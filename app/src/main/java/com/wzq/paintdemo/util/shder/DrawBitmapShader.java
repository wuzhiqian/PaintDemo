package com.wzq.paintdemo.util.shder;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.ArcShape;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;

/**
 * Created by wzq on 17-1-5.
 */

public class DrawBitmapShader {
    private static BitmapShader bitmapShader;
    private static ShapeDrawable shapeDrawable;


    private static BitmapShader arcBitmapShader;
    private static ShapeDrawable arcShapeDrawable;


    private static BitmapShader circleRectBitmapShader;
    private static ShapeDrawable circleRectBitmapDrawable;

    public static void drawBitmapShader(Canvas canvas, Bitmap bitmap) {
        bitmapShader = new BitmapShader(bitmap, Shader.TileMode.MIRROR,Shader.TileMode.REPEAT);
        shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setShader(bitmapShader);
        shapeDrawable.setBounds(20, 20, bitmap.getWidth() - 50, bitmap.getHeight() - 30);
        shapeDrawable.draw(canvas);
    }

    public static void drawArcBitmapShader(Canvas canvas, Bitmap bitmap) {
        arcBitmapShader = new BitmapShader(bitmap, Shader.TileMode.MIRROR,Shader.TileMode.REPEAT);
        arcShapeDrawable = new ShapeDrawable(new ArcShape(0, 130));
        arcShapeDrawable.getPaint().setShader(arcBitmapShader);
        arcShapeDrawable.setBounds(20, 10, bitmap.getWidth() , bitmap.getHeight());
        arcShapeDrawable.draw(canvas);
    }

    public static void drawCircleBitmapShader(Canvas canvas, Bitmap bitmap)
    {
        circleRectBitmapShader = new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        circleRectBitmapDrawable = new ShapeDrawable(new RoundRectShape(new float[]{10, 10, 10, 10, 10, 10, 10, 10}, new RectF(30, 30, 30, 30), new float[]{30, 30, 30, 30, 30, 30, 30, 30}));
        circleRectBitmapDrawable.getPaint().setShader(circleRectBitmapShader);
        circleRectBitmapDrawable.setBounds(30, 10, bitmap.getWidth() - 30, bitmap.getHeight() - 10);
        circleRectBitmapDrawable.draw(canvas);
    }
}
