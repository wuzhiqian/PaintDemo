package com.wzq.paintdemo.view.shaderview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import com.wzq.paintdemo.R;
import com.wzq.paintdemo.util.shder.DrawBitmapShader;
import com.wzq.paintdemo.view.BaseView;

/**
 * Created by wzq on 17-1-5.
 */

public class BitmapShaderView extends BaseView {
    DrawBitmapShader drawBitmapShader;
    public BitmapShaderView(Context context) {
        this(context, null);
    }

    public BitmapShaderView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }
    private int type = 1;
    public BitmapShaderView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a =  context.obtainStyledAttributes(attrs, R.styleable.BitmapShaderView);
        type = a.getInt(R.styleable.BitmapShaderView_type, 1);
        drawBitmapShader = new DrawBitmapShader();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(type == 1)
            drawBitmapShader.drawBitmapShader(canvas, bitmap);
        else if(type == 2)
            drawBitmapShader.drawArcBitmapShader(canvas,bitmap);
        else
            drawBitmapShader.drawCircleBitmapShader(canvas, bitmap);

    }


}
