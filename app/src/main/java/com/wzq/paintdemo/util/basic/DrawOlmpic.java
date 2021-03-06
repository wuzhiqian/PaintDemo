package com.wzq.paintdemo.util.basic;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by wzq on 17-1-5.
 */

public class DrawOlmpic {

    public static void drawOlmpic(Canvas canvas, Bitmap bitmap)
    {
        Paint paint1 = new Paint();
        paint1.setColor(Color.BLUE);
        paint1.setAntiAlias(true);
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setStrokeWidth(10);
        canvas.drawCircle(70, 150, 60, paint1);


        Paint paint4 = new Paint();
        paint4.setAntiAlias(true);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(10);
        paint4.setColor(Color.YELLOW);
        canvas.drawCircle(140, 220, 60, paint4);


        Paint paint2 = new Paint();
        paint2.setColor(Color.BLACK);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(10);
        canvas.drawCircle(210, 150, 60, paint2);

        Paint paint5 = new Paint();
        paint5.setColor(Color.GREEN);
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setAntiAlias(true);
        paint5.setStrokeWidth(10);
        canvas.drawCircle(280, 220, 60, paint5);


        Paint paint3 = new Paint();
        paint3.setColor(Color.RED);
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(10);
        canvas.drawCircle(350, 150, 60, paint3);


        Paint paint6 = new Paint();
        paint6.setAntiAlias(true);
        paint6.setColor(Color.BLUE);
        paint6.setTextSize(20);
        paint6.setUnderlineText(true);
        canvas.drawText("  Welcome to Beijing  ", 220 , 320, paint6);


        Paint paint7 = new Paint();
        paint7.setColor(Color.BLUE);
        paint7.setAntiAlias(true);
        paint7.setTextSize(20);
        canvas.drawText("北京欢迎你", 270, 350, paint7);

        Paint paint8 = new Paint();
        canvas.drawBitmap(bitmap, 10, 500, paint8);
    }
}
