package com.whosyourka.beauty


import android.app.Application
import android.content.Context


import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.MockitoAnnotations
import org.powermock.core.classloader.annotations.PowerMockIgnore
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.rule.PowerMockRule
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import org.robolectric.annotation.Config
import org.robolectric.shadows.ShadowLog

import java.lang.reflect.Field
import java.lang.reflect.Modifier

import org.powermock.api.mockito.PowerMockito.mock

/**
 * create by huangmingcan@lakala.com on 2019/1/11 10:29
 * function：
 */

@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class)
@PowerMockIgnore("org.powermock.*", "org.mockito.*", "org.robolectric.*", "android.*", "androidx.*", "javax.xml.*", "org.xml.sax.*", "org.w3c.dom.*", "org.springframework.context.*", "org.apache.log4j.*", "org.bouncycastle.*")
open class BasePresenterTest {
    @Rule
    @JvmField
    var rule = PowerMockRule()


    val application: Application
        get() = RuntimeEnvironment.application

    val context: Context
        get() = RuntimeEnvironment.application

    open fun setup() {
    }

    @Test
    fun testInstrumentTest(){
    }
}