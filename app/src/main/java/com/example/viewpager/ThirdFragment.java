package com.example.viewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

public class ThirdFragment extends Fragment {
    ViewPager viewPager;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_third_fragment, container, false);


        ImageView imageView = view.findViewById(R.id.imgMain);
        imageView.setImageResource(R.mipmap.ic_launcher);

//        viewPager = view.findViewById(R.id.viewPager);

        return view;
    }
}
