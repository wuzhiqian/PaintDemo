package com.wzq.paintdemo.view.shaderview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

import com.wzq.paintdemo.util.shder.DrawComposeShader;
import com.wzq.paintdemo.view.BaseView;

/**
 * Created by wzq on 17-1-6.
 */

public class ComposeShaderView extends BaseView{
    private DrawComposeShader drawComposeShader;
    public ComposeShaderView(Context context) {
        this(context, null);
    }

    public ComposeShaderView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ComposeShaderView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        drawComposeShader = new DrawComposeShader(bitmap);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawComposeShader.drawComposeShader(canvas);
    }
}
