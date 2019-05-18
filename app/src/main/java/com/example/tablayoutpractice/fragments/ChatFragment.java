package com.example.tablayoutpractice.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tablayoutpractice.R;
import com.example.tablayoutpractice.databinding.FragmentChatBinding;
import com.example.tablayoutpractice.databinding.FragmentHomeBinding;

public class ChatFragment extends Fragment {


    FragmentChatBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        return binding.getRoot();
        
        //return inflater.inflate(R.layout.fragment_home, container, false);
        //return super.onCreateView(inflater, container, savedInstanceState);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        binding.chatTxtV.setText("채팅 리스트 뷰!!");
    }
}
