package com.example.mao.beautylife.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mao.beautylife.R;
import com.example.mao.beautylife.databinding.FragmentCommunityBinding;

/**
 * Created by -- Mao on 2017/11/27.
 */

public class CommunityFragment extends Fragment {

    private FragmentCommunityBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_community, container, false);

        return binding.getRoot();
    }
}
