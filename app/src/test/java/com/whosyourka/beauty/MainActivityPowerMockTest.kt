package com.whosyourka.beauty

import android.util.Log
import org.junit.Assert.*
import org.junit.Test
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner
import org.powermock.core.classloader.annotations.PowerMockIgnore
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunnerDelegate
import org.powermock.modules.junit4.rule.PowerMockRule
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config


@PrepareForTest(Banana::class)
@RunWith(MockitoJUnitRunner::class)
@Config(constants = BuildConfig::class)
@PowerMockIgnore("org.mockito.*", "org.robolectric.*", "android.*")
@PowerMockRunnerDelegate(RobolectricTestRunner::class)
class MainActivityPowerMockTest{
    @Rule
    @JvmField
    val rule = PowerMockRule()
    @Test
    fun testInstrumentTest(){
        Log.d("1","1")
        assertEquals(1,1)
    }
}