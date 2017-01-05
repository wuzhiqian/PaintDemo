package com.wzq.paintdemo.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.wzq.paintdemo.R;
import com.wzq.paintdemo.view.PaintView;

/**
 * Created by wzq on 17-1-5.
 */

public class SimpleActivity extends AppCompatActivity{
    private PaintView paintView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        paintView = (PaintView) findViewById(R.id.paintView);
    }

    @Override
    protected void onDestroy() {
        paintView.destoryBitmap();
        super.onDestroy();
    }
}
