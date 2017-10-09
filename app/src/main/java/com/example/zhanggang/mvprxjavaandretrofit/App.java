package com.example.zhanggang.mvprxjavaandretrofit;

import android.app.Application;
import android.content.Context;

/**
 * Created by zhanggang on 2017/10/9.
 */

public class App extends Application {
    public static App content;
    @Override
    public void onCreate() {
        super.onCreate();
        this.content=this;
    }
    public static Context context(){
        return content;
    }
}
