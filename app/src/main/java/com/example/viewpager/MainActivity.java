package com.example.viewpager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        if (viewPager != null) {
            ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager());
            viewPager.setAdapter(adapter);
        }


//            TextView textView = findViewById(R.id.txtMain);
//            textView.setText(R.string.second_fragment);

        // TextView result = textView;

    }


    public void move(View view) {
        viewPager.setCurrentItem(1);

        textView = findViewById(R.id.txtMain2);
        textView.setText(R.string.second_fragment);

    }

    public void move2(View view) {
        viewPager.setCurrentItem(2);

        textView = findViewById(R.id.txtMain3);
        textView.setText(R.string.third_fragment);

    }




    public void move3(View view) {
        viewPager.setCurrentItem(0);

        textView = findViewById(R.id.txtMain);
        textView.setText(R.string.first_fragment);

    }


}
