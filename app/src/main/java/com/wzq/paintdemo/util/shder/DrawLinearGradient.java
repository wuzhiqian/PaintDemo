package com.wzq.paintdemo.util.shder;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;

/**
 * Created by wzq on 17-1-6.
 */

public class DrawLinearGradient {
    private Paint paint;
    private LinearGradient linearGradient;

    public LinearGradient getLinearGradient() {
        return linearGradient;
    }

    public DrawLinearGradient()
    {
        paint = new Paint();
        paint.setAntiAlias(true);
        linearGradient = new LinearGradient(10, 10, 352 - 10, 220 - 10, new int[]{Color.YELLOW, Color.BLACK, Color.BLUE, Color.GREEN, Color.RED}, null, Shader.TileMode.REPEAT);

    }
    public  void drawLinearGradient(Canvas canvas, Bitmap bitmap) {
        paint.setShader(linearGradient);
        canvas.drawCircle(240, 150, 90, paint);
    }
}
