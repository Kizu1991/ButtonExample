package com.example.button;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.button.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Button1のクリックイベント設定
        mBinding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Button", "Button1クリックー");
            }
        });
        // Button2のクリックイベント設定
        mBinding.button2.setOnClickListener(this);
        // Button3のクリックイベント設定
        mBinding.button3.setOnClickListener(new MyClick());
        // Button5のクリックイベント設定
        mBinding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Button", "Button5クリックー");
            }
        });
    }

    @Override
    public void onClick(View v) {
        Log.d("Button", "Button2クリックー");
    }

public void onClickButton4(View v){
    Log.d("Button", "Button4クリックー");
}
}
