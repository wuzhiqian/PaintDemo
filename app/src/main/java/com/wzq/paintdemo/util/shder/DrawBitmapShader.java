package com.wzq.paintdemo.util.shder;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.ArcShape;
import android.graphics.drawable.shapes.OvalShape;

/**
 * Created by wzq on 17-1-5.
 */

public class DrawBitmapShader {
    private static BitmapShader bitmapShader;
    private static ShapeDrawable shapeDrawable;


    private static BitmapShader circleBitmapShader;
    private static ShapeDrawable circleShapeDrawable;

    public static void drawBitmapShader(Canvas canvas, Bitmap bitmap) {
        bitmapShader = new BitmapShader(bitmap, Shader.TileMode.MIRROR,Shader.TileMode.REPEAT);
        shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setShader(bitmapShader);
        shapeDrawable.setBounds(20, 20, bitmap.getWidth() - 50, bitmap.getHeight() - 30);
        shapeDrawable.draw(canvas);
    }

    public static void drawCircleBitmapShader(Canvas canvas, Bitmap bitmap) {
        circleBitmapShader = new BitmapShader(bitmap, Shader.TileMode.MIRROR,Shader.TileMode.REPEAT);
        circleShapeDrawable = new ShapeDrawable(new ArcShape(180, 50));
        circleShapeDrawable.getPaint().setShader(circleBitmapShader);
        circleShapeDrawable.setBounds(20, 10, bitmap.getWidth() , bitmap.getHeight());
        circleShapeDrawable.draw(canvas);
    }
}
