package com.wzq.paintdemo.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.wzq.paintdemo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void enterBisicAcitivity(View view)
    {
        Intent intent = new Intent();
        intent.setClass(this, SimpleActivity.class);
        startActivity(intent);
    }


    public void enterShaderAcitivity(View view)
    {
        Intent intent = new Intent();
        intent.setClass(this, ShaderActivity.class);
        startActivity(intent);
    }



}
