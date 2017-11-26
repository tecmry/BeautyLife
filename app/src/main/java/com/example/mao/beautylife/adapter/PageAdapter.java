package com.example.mao.beautylife.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.mao.beautylife.fragment.InfoFragment;
import com.example.mao.beautylife.fragment.SelfFragment;

import java.util.List;

/**
 * Created by lenovo on 2017/8/17.
 */

public class PageAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> list;

    public PageAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}