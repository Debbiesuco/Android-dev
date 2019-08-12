package com.example.viewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

public class ThirdFragment extends Fragment {

    ViewPager viewPager;
    TextView textView;

    private Button prevButton4;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_third_fragment, container, false);


        ImageView imageView = view.findViewById(R.id.imgMain);
        imageView.setImageResource(R.mipmap.ic_launcher);

        viewPager = view.findViewById(R.id.viewPager);


        prevButton4 = view.findViewById(R.id.button4);

        prevButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ((MainActivity) getActivity()).selectFragment(1);

                textView = getActivity().findViewById(R.id.txtMain2);
                textView.setText(R.string.second_fragment);
            }
        });

        return view;
    }


}
