package com.whosyourka.beauty;

import android.app.Application;

/**
 * Created by HMC on 2019/4/29
 **/
public class App extends Application {
    private Application application;
    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }

    public Application getAppContext(){
        return application;
    }
}
