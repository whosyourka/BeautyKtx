package com.whosyourka.beauty

import android.util.Log
import junit.framework.Assert.assertEquals
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.powermock.api.mockito.PowerMockito
import org.powermock.core.classloader.annotations.PowerMockIgnore
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.rule.PowerMockRule
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config


@PrepareForTest(Banana::class)
@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class)
@PowerMockIgnore("org.powermock.*", "org.mockito.*", "org.robolectric.*", "android.*", "androidx.*" )
class MainActivityPowerMockTest{
    @Rule
    @JvmField
    val rule = PowerMockRule()
    @Test
    fun testInstrumentTest(){
        PowerMockito.mockStatic(Banana::class.java)
        PowerMockito.`when`(Banana.getColor()).thenReturn("绿色")
        Assert.assertEquals(Banana.getColor(), "绿色")
    }
}