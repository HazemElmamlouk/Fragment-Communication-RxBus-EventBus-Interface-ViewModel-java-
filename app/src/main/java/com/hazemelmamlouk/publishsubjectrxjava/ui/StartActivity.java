package com.hazemelmamlouk.publishsubjectrxjava.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.hazemelmamlouk.publishsubjectrxjava.R;
import com.hazemelmamlouk.publishsubjectrxjava.fragment.FirstFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.RxBus)
    Button RxBus;
    @BindView(R.id.EventBus)
    Button EventBus;
    @BindView(R.id.ViewModel)
    Button ViewModel;
    @BindView(R.id.Interface)
    Button Interface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        ButterKnife.bind(this);
        RxBus.setOnClickListener(this);
        EventBus.setOnClickListener(this);
        ViewModel.setOnClickListener(this);
        Interface.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.RxBus){
            startActivity(new Intent(StartActivity.this, MainActivity.class));
        }
        if(view.getId()==R.id.EventBus){
            startActivity(new Intent(StartActivity.this, EventBus.class));
        }
        if(view.getId()==R.id.ViewModel){
            startActivity(new Intent(StartActivity.this, ViewModel.class));
        }
        if(view.getId()==R.id.Interface){
            startActivity(new Intent(StartActivity.this, Interface.class));
        }
    }
}
