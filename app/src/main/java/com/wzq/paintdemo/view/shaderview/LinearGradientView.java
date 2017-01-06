package com.wzq.paintdemo.view.shaderview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

import com.wzq.paintdemo.util.shder.DrawLinearGradient;
import com.wzq.paintdemo.view.BaseView;

/**
 * Created by wzq on 17-1-6.
 */

public class LinearGradientView extends BaseView{
    DrawLinearGradient drawLinearGradient;
    public LinearGradientView(Context context) {
        this(context, null);
    }

    public LinearGradientView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LinearGradientView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        drawLinearGradient = new DrawLinearGradient(bitmap);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawLinearGradient.drawLinearGradient(canvas, bitmap);
    }
}
