package com.devpro.databaseandfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.devpro.databaseandfragment.databinding.FragmentBuid02Binding;

public class Fragment02 extends Fragment {
    FragmentBuid02Binding binding2;

    public static Fragment02 newInstance() {

        Bundle args = new Bundle();

        Fragment02 fragment = new Fragment02();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding2 = DataBindingUtil.inflate(inflater, R.layout.fragment_buid02, container, false);
        binding2.tvDemo02.setText("Done2");
        return binding2.getRoot();
    }
}
