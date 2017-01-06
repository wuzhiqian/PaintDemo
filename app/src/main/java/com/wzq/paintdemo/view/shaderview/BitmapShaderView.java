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

/**
 * Created by wzq on 17-1-5.
 */

public class BitmapShaderView extends View {
    private Bitmap bitmap;
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
        bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.a);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(type == 1)
            DrawBitmapShader.drawBitmapShader(canvas, bitmap);
        else
            DrawBitmapShader.drawArcBitmapShader(canvas,bitmap);

    }
}
