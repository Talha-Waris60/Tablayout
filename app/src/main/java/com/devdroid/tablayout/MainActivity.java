package com.devdroid.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tab);
        viewPager = findViewById(R.id.viewPager);

        // Call viewPager adapter here Because we set TabLayout in main activity
        ViewPagerMessengerAdapter adapter = new ViewPagerMessengerAdapter(getSupportFragmentManager());

        // Set on viewPager
        viewPager.setAdapter(adapter);

        // To synchronized TabLayout and viewPager
        tabLayout.setupWithViewPager(viewPager);
    }
}