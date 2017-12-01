package com.example.mao.beautylife.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mao.beautylife.R;
import com.example.mao.beautylife.databinding.FragmentCommunityOneBinding;

/**
 * Created by -- Mao on 2017/11/30.
 */

public class CommunityOneFragment extends Fragment {

    private FragmentCommunityOneBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_community_one, container, false);
        binding.fragmentCommunityRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));

        return binding.getRoot();
    }
}
