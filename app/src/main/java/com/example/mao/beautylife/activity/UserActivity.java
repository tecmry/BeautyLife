package com.example.mao.beautylife.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.mao.beautylife.R;
import com.example.mao.beautylife.TabLayoutListener;
import com.example.mao.beautylife.TabSelected;
import com.example.mao.beautylife.adapter.PageAdapter;
import com.example.mao.beautylife.databinding.ActivityUserBinding;
import com.example.mao.beautylife.fragment.InfoFragment;
import com.example.mao.beautylife.fragment.SelfFragment;

import java.util.ArrayList;
import java.util.List;

public class UserActivity extends AppCompatActivity implements View.OnClickListener, TabLayoutListener {

    private ActivityUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        binding.activityUserViewPager.setNoScroll(true);
        List<Fragment> list = new ArrayList<>();
        list.add(new InfoFragment());
        list.add(new SelfFragment());
        binding.activityUserViewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), list));
        binding.activityUserViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.activityUserTab));
        binding.activityUserTab.addOnTabSelectedListener(new TabSelected(binding.activityUserViewPager, this));
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void tabSelectedListener(TabLayout.Tab tab) {
        switch (tab.getPosition()){

        }
    }
}
