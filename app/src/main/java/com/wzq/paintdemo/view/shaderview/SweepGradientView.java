package com.wzq.paintdemo.view.shaderview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

import com.wzq.paintdemo.util.shder.DrawSweepGradient;
import com.wzq.paintdemo.view.BaseView;

/**
 * Created by wzq on 17-1-6.
 */

public class SweepGradientView extends BaseView {
    private DrawSweepGradient drawSweepGradient;
    public SweepGradientView(Context context) {
        this(context, null);
    }

    public SweepGradientView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SweepGradientView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        drawSweepGradient = new DrawSweepGradient();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawSweepGradient.drawSweepGradient(canvas);
    }
}
