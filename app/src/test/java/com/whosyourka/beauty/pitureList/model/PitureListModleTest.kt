package com.whosyourka.beauty.pitureList.model

import com.whosyourka.beauty.BasePresenterTest
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.mockito.Spy

/**
 * Created by HMC on 2019/5/5
 */
class PitureListModleTest : BasePresenterTest() {
    val mModel = PitureListModle()
    @Test
    fun getPitureListData() {
        Assert.assertEquals(mModel.getPitureListData(), "myPiture")
    }
}