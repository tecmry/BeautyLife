package com.example.mao.beautylife;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;

/**
 * Created by -- Mao on 2017/11/25.
 */

public class MyLeanCloudApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // 初始化参数依次为 this, AppId, AppKey
        AVOSCloud.initialize(this,"ecIHPESHNrbdCx4IakbXzBK6-gzGzoHsz","nQiL0u9CvujDB7DlUymnqVfN");
    }
}
