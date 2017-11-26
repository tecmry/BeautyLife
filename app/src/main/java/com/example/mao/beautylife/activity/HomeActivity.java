package com.example.mao.beautylife.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mao.beautylife.R;
import com.example.mao.beautylife.TabLayoutListener;
import com.example.mao.beautylife.TabSelected;
import com.example.mao.beautylife.adapter.PageAdapter;
import com.example.mao.beautylife.databinding.ActivityHomeBinding;
import com.example.mao.beautylife.fragment.InfoFragment;
import com.example.mao.beautylife.fragment.SelfFragment;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements TabLayoutListener {

    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        binding.activityHomeViewPager.setNoScroll(true);
        List<Fragment> list = new ArrayList<>();

        binding.activityHomeViewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), list));
        binding.activityHomeViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.activityHomeTab));
        binding.activityHomeTab.addOnTabSelectedListener(new TabSelected(binding.activityHomeViewPager, this));
    }

    @Override
    public void onBackPressed() {
        Intent mHomeIntent = new Intent(Intent.ACTION_MAIN);
        mHomeIntent.addCategory(Intent.CATEGORY_HOME);
        mHomeIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
        startActivity(mHomeIntent);
    }

    @Override
    public void tabSelectedListener(TabLayout.Tab tab) {

    }
}
