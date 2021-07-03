package com.example.a15;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a15.databinding.FragmentSecondBinding;


public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;
    private String string;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        string = getArguments().getString("key");
        binding  = FragmentSecondBinding.inflate(inflater , container , false);
        return binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.secondSave.setOnClickListener(v -> {
            Fragment fragment = new ThirdFragment();
            Bundle bundle = new Bundle();
            bundle.putString("key2",string);
            fragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mContainer,fragment)
                    .addToBackStack(null).commit();
        });
    }
}