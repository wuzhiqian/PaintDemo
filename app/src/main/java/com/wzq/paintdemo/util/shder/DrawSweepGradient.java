package com.wzq.paintdemo.util.shder;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.SweepGradient;

/**
 * Created by wzq on 17-1-6.
 */

public class DrawSweepGradient {

    private Paint paint;
    private SweepGradient sweepGradient;

    public DrawSweepGradient()
    {
        paint = new Paint();
        paint.setAntiAlias(true);
        sweepGradient = new SweepGradient(240, 150, new int[]{Color.BLACK, Color.BLUE, Color.RED, Color.RED, Color.GREEN}, null);
    }

    public void drawSweepGradient(Canvas canvas)
    {
        paint.setShader(sweepGradient);
        canvas.drawCircle(240, 150, 100, paint);
    }



}
