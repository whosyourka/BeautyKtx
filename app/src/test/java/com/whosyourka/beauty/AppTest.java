package com.whosyourka.beauty;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by HMC on 2019/5/7
 **/
public class AppTest extends BasePresenterTest {

    @Test
    public void getAppContext() {
        App app = new App();
        Assert.assertEquals(app.getAppContext(),null);
        app.onCreate();
        Assert.assertNotNull(app.getAppContext());
    }
}