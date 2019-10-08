package com.hazemelmamlouk.publishsubjectrxjava.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.hazemelmamlouk.publishsubjectrxjava.R;
import com.hazemelmamlouk.publishsubjectrxjava.adapter.EventBusPagerAdapter;
import com.hazemelmamlouk.publishsubjectrxjava.fragment.EightFragment;
import com.hazemelmamlouk.publishsubjectrxjava.fragment.SecondFragment;
import com.hazemelmamlouk.publishsubjectrxjava.fragment.siventhFragment;

public class Interface extends AppCompatActivity implements siventhFragment.OnFragmentCommunicationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface);
        EventBusPagerAdapter rxBusPagerAdapter =
                new EventBusPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(rxBusPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
    }
    @Override public void onNameChange(String name) {
        String tag = "android:switcher:" + R.id.view_pager + ":" + 1;
        EightFragment fragment = (EightFragment) getSupportFragmentManager().findFragmentByTag(tag);
        if (fragment != null) {
            fragment.onNameChange(name);
        }
    }
}

