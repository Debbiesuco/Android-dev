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

public class FirstFragment extends Fragment {

    ImageView imageView;
    TextView textView;

    private Button nextButton1;
    MainActivity test;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_first_fragment, container, false);


        imageView = view.findViewById(R.id.imgMain);
        imageView.setImageResource(R.mipmap.ic_launcher);


        nextButton1 = view.findViewById(R.id.button1);


        nextButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //((MainActivity) getActivity()).selectFragment(1);

                test = new MainActivity();
                test.testFunctionOne();

                textView = getActivity().findViewById(R.id.txtMain2);

                textView.setText(R.string.first_fragment);

                //Toast.makeText(getContext(),"This is a toast", Toast.LENGTH_SHORT).show();

            }
        });


        return view;
    }


}
