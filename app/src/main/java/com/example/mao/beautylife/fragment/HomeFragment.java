package com.example.mao.beautylife.fragment;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.mao.beautylife.R;
import com.example.mao.beautylife.databinding.FragmentHomeBinding;
import com.example.mao.beautylife.util.ImageLoaderUtil;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.loader.ImageLoaderInterface;

/**
 * Created by -- Mao on 2017/11/27.
 */

public class HomeFragment extends Fragment implements ImageLoaderInterface, View.OnClickListener {

    private FragmentHomeBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        initBanner();

        return binding.getRoot();
    }

    @Override
    public void displayImage(Context context, Object path, View imageView) {
        ImageLoaderUtil.ImageLoader(this, (ImageView) imageView, (String) path);
    }

    @Override
    public View createImageView(Context context) {
        return null;
    }

    private void initBanner(){
        binding.fragmentHomeBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        binding.fragmentHomeBanner.setImageLoader(this);
//        binding.fragmentHomeBanner.setImages()
        binding.fragmentHomeBanner.setBannerAnimation(Transformer.DepthPage);
        binding.fragmentHomeBanner.isAutoPlay(true);
        binding.fragmentHomeBanner.setDelayTime(1500);
        binding.fragmentHomeBanner.start();
    }

    @Override
    public void onClick(View view) {

    }
}
