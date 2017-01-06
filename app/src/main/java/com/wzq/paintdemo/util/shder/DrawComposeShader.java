package com.wzq.paintdemo.util.shder;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;

/**
 * Created by wzq on 17-1-6.
 */

public class DrawComposeShader {


    private DrawBitmapShader drawBitmapShader;
    private DrawLinearGradient drawLinearGradient;
    private ComposeShader composeShader;
    private Paint paint;
    public DrawComposeShader(Bitmap bitmap)
    {
        paint = new Paint();
        paint.setAntiAlias(true);
        drawBitmapShader = new DrawBitmapShader(bitmap);
        drawLinearGradient = new DrawLinearGradient();
        composeShader = new ComposeShader(drawBitmapShader.getBitmapShader(), drawLinearGradient.getLinearGradient(), PorterDuff.Mode.ADD);
    }


    public void drawComposeShader(Canvas canvas)
    {
        paint.setShader(composeShader);
        canvas.drawCircle(240, 150 , 100, paint);
    }
}
