package com.fxn.stashapp;

import android.app.Application;
import android.support.multidex.MultiDex;

import com.fxn.stash.Stash;

/**
 * Created by akshay on 02/03/18.
 */

public class StashApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Stash.init(this);
        MultiDex.install(this);
    }
}
