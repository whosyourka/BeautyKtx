package com.whosyourka.beauty.pitureList.model

import androidx.lifecycle.ViewModel

/**
 * Created by HMC on 2019/3/18
 */
class PitureListModle {
    var name: String? = null

    fun getPitureListData(model: PitureListModle): PitureListModle {
        var pitureListModle = PitureListModle()
        pitureListModle.name = "myPiture"
        return pitureListModle
    }
}
