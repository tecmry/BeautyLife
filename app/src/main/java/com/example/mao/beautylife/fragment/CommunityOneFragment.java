package com.example.mao.beautylife.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mao.beautylife.R;
import com.example.mao.beautylife.adapter.OneRecyclerAdapter;
import com.example.mao.beautylife.databinding.FragmentCommunityOneBinding;
import com.jaeger.ninegridimageview.NineGridImageView;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by -- Mao on 2017/11/30.
 */

public class CommunityOneFragment extends Fragment implements View.OnClickListener {

    private FragmentCommunityOneBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_community_one, container, false);
        binding.fragmentCommunityRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        binding.fragmentCommunityRecycler.setAdapter(new OneRecyclerAdapter());
        binding.fragmentOneTextOne.setOnClickListener(this);
        binding.fragmentOneTextTwo.setOnClickListener(this);
        binding.fragmentOneTextThree.setOnClickListener(this);
        binding.fragmentOneTextFour.setOnClickListener(this);
        return binding.getRoot();
    }

    @Override
    public void onClick(View view) {

    }


}
