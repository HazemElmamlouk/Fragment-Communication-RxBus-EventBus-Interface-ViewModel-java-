package com.hazemelmamlouk.publishsubjectrxjava.fragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.textfield.TextInputEditText;
import com.hazemelmamlouk.publishsubjectrxjava.R;
import com.hazemelmamlouk.publishsubjectrxjava.commun.RxBus;

import org.greenrobot.eventbus.EventBus;


public class ThirdFragment extends Fragment {
    public ThirdFragment() {
        // Required empty public constructor
    }


    public static ThirdFragment newInstance() {
        return new ThirdFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextInputEditText inputDataText = view.findViewById(R.id.textInputTextData);
        inputDataText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                EventBus.getDefault().post(charSequence.toString());

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
    }
}