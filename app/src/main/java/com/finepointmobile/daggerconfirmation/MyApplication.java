package com.finepointmobile.daggerconfirmation;

import android.app.Application;

/**
 * Created by danielmalone on 8/1/17.
 */

public class MyApplication extends Application {

    Application mApplication;

    public MyApplication(Application application) {
        mApplication = application;
    }

    public MyApplication() {
    }

    public Application getInstance() {
        return mApplication;
    }
}
