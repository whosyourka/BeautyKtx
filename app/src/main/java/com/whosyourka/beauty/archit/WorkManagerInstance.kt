package com.whosyourka.beauty.archit

import android.content.Context
import androidx.work.*
import java.util.concurrent.TimeUnit


/**
 * Created by HMC on 2019/2/14
 * workmanager 使用单例
 */
class WorkManagerInstance private constructor() {

    companion object {
        val INSTANCE by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            WorkManagerInstance()
        }
    }

    fun enqueue() {
        //定期任务
        val pullRequest = PeriodicWorkRequestBuilder<CommonWorker>(24, TimeUnit.SECONDS)
            .addTag("pullRequest")
            .setConstraints(Constraints.Builder().setRequiresCharging(true).build())
            //设置在某种情况下运行
            .setInputData(Data.Builder().putInt("key_accept_bg_work", 1).build()).build()
        val pullRequest1 = OneTimeWorkRequestBuilder<CommonWorker>()
            .addTag("pullRequest1")
            //设置在某种情况下运行
            .setConstraints(Constraints.Builder().setRequiresCharging(true).build())
            .setInputData(Data.Builder().putInt("key_accept_bg_work", 1).build()).build()

        WorkManager.getInstance().enqueue(pullRequest)
        WorkManager.getInstance().enqueue(pullRequest1)
        WorkManager.getInstance().beginUniqueWork("pullRequest1", ExistingWorkPolicy.APPEND,pullRequest1)
            .enqueue()

        val pullRequestID = pullRequest.id
        println("pullRequestid:" + pullRequestID)
//        println("value:" + WorkManager.getInstance().getStatusById(pullRequestID).value)

        WorkManager.getInstance().cancelWorkById(pullRequest.id)
        WorkManager.getInstance().cancelWorkById(pullRequest1.id)
        WorkManager.getInstance().cancelAllWorkByTag("pullRequest1")
    }


    /*
    //翻译写法
    @Volatile
    private var INSTANCE: WorkManagerInstance? = null

    fun getInstance(): WorkManagerInstance? {
        if (INSTANCE == null) {
            synchronized(WorkManagerInstance::class.java) {
                if (INSTANCE == null) {
                    INSTANCE = WorkManagerInstance()
                }
            }
        }
        return INSTANCE
    }
    */

    class CommonWorker(appContext: Context, workerParams: WorkerParameters)
        : Worker(appContext, workerParams) {
        var retry = false;
        override fun doWork(): Result {
            println("id：" + id)
            var number = this.inputData.getInt("key_accept_bg_work", 0)
            if (0 == number) {
                return Result.failure()
            } else if (1 == number) {
                println("retry:" + retry)
                if (retry) {
                    return Result.success()
                }
                retry = true
                Thread.sleep(5000)
                return Result.retry()
            }
            //...set the output, and we're done!
//            val output: Data = mapOf("key_accept_bg_work" to 2).toWorkData()
//            setOutputData(output)
            return Result.success()
        }

    }


}
