package com.example.myprofile_20200526;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;
import com.example.myprofile_20200526.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        binding.profileImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContxt,PhotoViewActivity.class);
            }
        });

    }

    @Override
    public void setValues() {
//        인터넷에 있는 이미지 불러오기 => 인터넷 연결 권한 필요
        Glide.with(mContxt).load("https://pbs.twimg.com/profile_images/1263783479621251073/MmOMbz_W_400x400.jpg").into(binding.profileImg);
    }
}
