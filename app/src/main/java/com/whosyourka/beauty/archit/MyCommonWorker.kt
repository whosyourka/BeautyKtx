package com.whosyourka.beauty.archit

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

/**
 * Created by HMC on 2019/5/7
 **/
//class MyCommonWorker(appContext: Context, workerParams: WorkerParameters)
//    : Worker(appContext, workerParams) {
//    var retry = false
//    override fun doWork(): Result {
//        println("id：" + id)
//        var number = this.inputData.getInt("key_accept_bg_work", 0)
//        if (0 == number) {
//            return Result.failure()
//        } else if (1 == number) {
//            println("retry:" + retry)
//            if (retry) {
//                return Result.success()
//            }
//            retry = true
//            Thread.sleep(5000)
//            return Result.retry()
//        }
//        //...set the output, and we're done!
////            val output: Data = mapOf("key_accept_bg_work" to 2).toWorkData()
////            setOutputData(output)
//        return Result.success()
//    }
//
//}