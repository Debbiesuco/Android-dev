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

public class SecondFragment extends Fragment {

    ViewPager viewPager;
    TextView textView;
    TextView txtView;

    MainActivity test;

    private Button nextButton2;
    private Button prevButton2;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_second_fragment, container, false);


        ImageView imageView = view.findViewById(R.id.imgMain);
        imageView.setImageResource(R.mipmap.ic_launcher);


        nextButton2 = view.findViewById(R.id.button2);
        prevButton2 = view.findViewById(R.id.button3);

        textView = view.findViewById(R.id.txtMain3);
        txtView = view.findViewById(R.id.txtMain);

        nextButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //((MainActivity) getActivity()).selectFragment(2);

                test = new MainActivity();
                test.testFunctionOne();


                textView = getActivity().findViewById(R.id.txtMain3);
                textView.setText(R.string.second_fragment);
            }
        });

        prevButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //((MainActivity) getActivity()).selectFragment(0);

                test = new MainActivity();
                test.testFunctionTwo();

                textView = getActivity().findViewById(R.id.txtMain);
                textView.setText(R.string.second_fragment);
            }
        });

        return view;
    }


}
