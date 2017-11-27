package com.example.mao.beautylife.util;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

import com.example.mao.beautylife.GlideApp;


/**
 * Created by lenovo on 2017/8/20.
 */

public class ImageLoaderUtil {


    public static void ImageLoader(Activity activity, ImageView imageView, String url){
        GlideApp.with(activity).load(url).fitCenter().into(imageView);
    }

    public static void ImageLoader(Fragment fragment, ImageView imageView, String url){
        GlideApp.with(fragment).load(url).fitCenter().into(imageView);
    }

    public static void ImageLoader(ImageView imageView, String url){
        GlideApp.with(imageView).load(url).fitCenter().into(imageView);
    }

}
