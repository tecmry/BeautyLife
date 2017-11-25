package com.example.mao.beautylife.activity;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.mao.beautylife.R;
import com.example.mao.beautylife.adapter.PageAdapter;
import com.example.mao.beautylife.databinding.ActivityUserBinding;

public class UserActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        binding.activityUserViewPager.setNoScroll(true);
        binding.activityUserViewPager.setAdapter(new PageAdapter(getSupportFragmentManager()));
        binding.activityUserViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.activityUserTab));
        binding.activityUserTab.addOnTabSelectedListener(new TabSelected(binding.activityUserViewPager));
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
    public void onClick(View v) {

    }

    private class TabSelected extends TabLayout.ViewPagerOnTabSelectedListener{

        private TabSelected(ViewPager viewPager) {
            super(viewPager);
        }

        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            super.onTabSelected(tab);
            switch (tab.getPosition()){
                case 0:

                    break;
                case 1:
                    break;
                default:
                    break;
            }
        }
    }

}
