package com.hazemelmamlouk.publishsubjectrxjava.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.hazemelmamlouk.publishsubjectrxjava.R;
import com.hazemelmamlouk.publishsubjectrxjava.adapter.EventBusPagerAdapter;
import com.hazemelmamlouk.publishsubjectrxjava.adapter.InterfacePagerAdapter;
import com.hazemelmamlouk.publishsubjectrxjava.adapter.RxBusPagerAdapter;

public class EventBus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_bus);
        EventBusPagerAdapter rxBusPagerAdapter =
                new EventBusPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(rxBusPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
    }
}
