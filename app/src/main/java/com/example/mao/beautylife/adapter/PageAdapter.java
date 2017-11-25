package com.example.mao.beautylife.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.mao.beautylife.fragment.InfoFragment;
import com.example.mao.beautylife.fragment.SelfFragment;

/**
 * Created by lenovo on 2017/8/17.
 */

public class PageAdapter extends FragmentStatePagerAdapter {

    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new InfoFragment();
            case 1:
                return new SelfFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}