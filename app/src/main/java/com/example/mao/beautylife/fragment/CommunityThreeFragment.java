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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.example.mao.beautylife.R;
import com.example.mao.beautylife.SpaceItemDecoration;
import com.example.mao.beautylife.adapter.ThreeRecyclerAdapter;
import com.example.mao.beautylife.databinding.FragmentCommunityThreeBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by -- Mao on 2017/11/30.
 */

public class CommunityThreeFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    private FragmentCommunityThreeBinding binding;
    private ThreeRecyclerAdapter adapter = new ThreeRecyclerAdapter();
    private List<String> strList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_community_three, container, false);
        binding.fragmentCommunityRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        binding.fragmentCommunityRecycler.setAdapter(adapter);
        binding.fragmentCommunityRecycler.addItemDecoration(new SpaceItemDecoration(getResources().getDimensionPixelSize(R.dimen.space)));
        strList.add("全部");
        strList.add("口红");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, strList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.fragmentThreeSpinner.setAdapter(arrayAdapter);
        binding.fragmentThreeSpinner.setOnItemSelectedListener(this);
        return binding.getRoot();
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
