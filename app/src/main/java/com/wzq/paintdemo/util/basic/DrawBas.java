package com.wzq.paintdemo.util.basic;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;

/**
 * Created by wzq on 17-1-5.
 */

public class DrawBas {
    public static void drawBas(Canvas canvas)
    {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE);


        Point startPoint = new Point(200, 400);
        Point endPoint = new Point(400, 400);
        Point assistPoint = new Point(300, 500);

        Path path = new Path();
        path.moveTo(startPoint.x, startPoint.y);
        path.quadTo(assistPoint.x, assistPoint.y , endPoint.x, endPoint.y);
      //  path.close();
        canvas.drawPath(path, paint);
        canvas.drawPoint(assistPoint.x, assistPoint.y, paint);
    }
}
