package com.whosyourka.beauty

/**
 * Created by HMC on 2019/3/27
 */
class Banana {
    fun getColor() {
        val b: Int? = 22
        val a: Int? = b
        if (a == b) {
            println("21" + a)
        }
    }

    lateinit var subject: Banana

//    companion object {
//        @JvmStatic
//        fun getColor():String{
//            return "红色"
//        }
//    }
}