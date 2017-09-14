package com.zhikao.googleplay.utils;

import android.content.Context;
import android.content.res.Resources;

import com.zhikao.googleplay.base.MyApplication;

/**
 * 封装一些和UI相关的操作
 */
public class UIUtils {
    /*得到上下文*/
    public static Context getContext() {
        return MyApplication.getContext();
    }

    /*得到Resoure对象*/
    public static Resources getResoures() {
        return getContext().getResources();
    }

    /*得到string.xml里的字符串信息*/
    public static String getString(int resId) {
        return getResoures().getString(resId);
    }

    /*得到string.xml里的字符串数组信息*/
    public static String[] getStrings(int resId) {
        return getResoures().getStringArray(resId);
    }

    /*得到color.xml里面的颜色信息*/
    public static int getColor(int resId) {
        return getResoures().getColor(resId);
    }

    /*得到应用程序的包名*/
    public static String getPackageName() {
        return getContext().getPackageName();
    }
}
