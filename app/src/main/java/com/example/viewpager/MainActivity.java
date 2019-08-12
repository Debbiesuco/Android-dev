package com.example.viewpager;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        if (viewPager != null) {
            ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager());
            viewPager.setAdapter(adapter);
        }


    }

    public void selectFragment(int position) {

        viewPager.setCurrentItem(position, true);

    }

}
