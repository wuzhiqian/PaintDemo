package com.wzq.paintdemo.util.shder;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;

/**
 * Created by wzq on 17-1-6.
 */

public class DrawRadialGradient {
    private Paint paint;
    private Shader radialGradient;
    public DrawRadialGradient()
    {
        paint = new Paint();

        radialGradient = new RadialGradient(240, 150,100, new int[]{Color.YELLOW, Color.GREEN,Color.RED, Color.BLUE, Color.BLACK}, null, Shader.TileMode.REPEAT);
    }


    public void drawRadialGradient(Canvas canvas)
    {
        paint.setShader(radialGradient);
        canvas.drawCircle(240, 150, 100, paint);
    }

}
