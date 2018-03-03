package com.fxn.storeapp;

import android.app.Application;
import android.support.multidex.MultiDex;

import com.fxn.store.Store;

/**
 * Created by akshay on 02/03/18.
 */

public class StoreApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Store.init(this);
        MultiDex.install(this);
    }
}
