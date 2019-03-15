package com.whosyourka.beauty

import android.util.Log
import com.googlecode.eyesfree.utils.LogUtils
import org.junit.Assert.*
import org.junit.Test
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnit
import org.mockito.junit.MockitoJUnitRunner
import org.powermock.core.classloader.annotations.PowerMockIgnore
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunnerDelegate
import org.powermock.modules.junit4.rule.PowerMockRule
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config


@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class)
class MainActivityMockTest{
    @Rule
    @JvmField
    val rule = MockitoJUnit.rule()
    @Test
    fun testInstrumentTest(){
        Log.d("1","1")
        assertEquals(1,1)
        var list = mock(List::class.java)
        list.last()
        verify(list).last()
    }



    @Test
    fun testWorkManager(){

    }
}