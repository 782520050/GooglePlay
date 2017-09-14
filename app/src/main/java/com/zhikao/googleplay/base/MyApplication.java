package com.zhikao.googleplay.base;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Process;

/**
 * 全局+单例
 */
public class MyApplication extends Application {

    private static int mMainThreadId;
    private static Context mContext;
    private static Handler mMainThreadHandler;

    /*得到上下文*/
    public static Context getContext() {
        return mContext;
    }

    /*得到主线程*/
    public static Handler getMainThreadHandler() {
        return mMainThreadHandler;
    }

    /*得到主线程ID*/
    public static int getMainThreadId() {
        return mMainThreadId;
    }

    @Override
    public void onCreate() {//程序的入口方法
        //程序一旦运行 可启动的方法 ,可以创建一些可以直接从这里去拿
        /*上下文*/
        mContext = getApplicationContext();
        /*主线程的Hander*/
        mMainThreadHandler = new Handler();
        /*主线程的ID*/
        mMainThreadId = Process.myTid();
        /*myTid 记得首字母就行
        * myTid:Thread
        * myPid:Process
        *myUid:User
        * */
        super.onCreate();
    }
}
