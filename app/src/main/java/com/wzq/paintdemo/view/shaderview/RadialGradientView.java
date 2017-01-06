package com.wzq.paintdemo.view.shaderview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

import com.wzq.paintdemo.util.shder.DrawRadialGradient;
import com.wzq.paintdemo.view.BaseView;

/**
 * Created by wzq on 17-1-6.
 */

public class RadialGradientView extends BaseView{
    private DrawRadialGradient drawRadialGradient;
    public RadialGradientView(Context context) {
        this(context, null);
    }

    public RadialGradientView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RadialGradientView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        drawRadialGradient = new DrawRadialGradient();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawRadialGradient.drawRadialGradient(canvas);
    }
}
