package com.whosyourka.beauty.pitureList.model

import com.whosyourka.beauty.BasePresenterTest
import org.junit.Assert
import org.junit.Test

/**
 * Created by HMC on 2019/5/5
 */
class PitureListModleTest {
    val mModel = PitureListModle()
    @Test
    fun getPitureListData() {
        Assert.assertEquals(mModel.getPitureListData().name, "myPiture")
    }
}