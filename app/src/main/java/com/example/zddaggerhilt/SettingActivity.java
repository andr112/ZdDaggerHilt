package com.example.zddaggerhilt;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.zddaggerhilt.api.ZdDataRepository;
import com.example.zddaggerhilt.databinding.ActivitySettingBinding;

import javax.inject.Inject;

public class SettingActivity extends AppCompatActivity {
    private ActivitySettingBinding binding;

    @Inject
    ZdDataRepository dataRepository;
    @Inject
    ZdDataRepository dataRepository2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        ((ZdApp) getApplication()).appComponent.actFactory().create().inject(this);
        Log.i("ZdTest", "sett dataRepository:" + dataRepository);
        Log.i("ZdTest", "sett dataRepository2:" + dataRepository2);
        super.onCreate(savedInstanceState);
        binding = ActivitySettingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
