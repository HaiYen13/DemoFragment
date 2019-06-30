package com.devpro.databaseandfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.devpro.databaseandfragment.databinding.FragmentBuild01Binding;

public class Fragment01 extends Fragment {
    FragmentBuild01Binding bingding;

    public static Fragment01 newInstance() {
        Bundle args = new Bundle();
        Fragment01 fragment = new Fragment01();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        bingding = DataBindingUtil.inflate(inflater, R.layout.fragment_build01, container, false);

        bingding.tvDemo.setText("Done");
        return bingding.getRoot();
    }
}
