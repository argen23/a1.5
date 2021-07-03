package com.example.a15;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a15.databinding.FragmentFifthBinding;


public class FifthFragment extends Fragment {
    private FragmentFifthBinding binding;
    private String string;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        string = getArguments().getString("key4");
        binding = FragmentFifthBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.fifthSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.fifthTv.setText(string);
            }
        });
    }
}