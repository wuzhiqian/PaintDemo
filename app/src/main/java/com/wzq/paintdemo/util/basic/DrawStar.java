package com.wzq.paintdemo.util.basic;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;


/**
 * Created by wzq on 17-1-5.
 */

public class DrawStar {
    public static void drawStar(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);



        final int cent_X = 100;
        final int cent_Y = 400;
        final int outRadius = 40;
        double point[][] = new double[][]{
                {cent_X, cent_Y - outRadius},
                {cent_X - outRadius * Math.cos(18 * Math.PI / 180), cent_Y - outRadius * Math.sin(18* Math.PI / 180)},
                {cent_X - outRadius * Math.cos(54* Math.PI / 180), cent_Y + outRadius * Math.sin(54* Math.PI / 180)},
                {cent_X + outRadius * Math.cos(54* Math.PI / 180), cent_Y + outRadius * Math.sin(54* Math.PI / 180)},
                {cent_X + outRadius * Math.cos(18* Math.PI / 180), cent_Y - outRadius * Math.sin(18* Math.PI / 180)}
        };

        float pointf[][] = new float[5][2];
        for(int i = 0; i < point.length; i ++)
            for (int j = 0; j < point[i].length; j ++)
            {
                pointf[i][j] = (float) point[i][j];
            }

        Path path = new Path();
        path.reset();
        path.moveTo(pointf[0][0], pointf[0][1]);
        path.lineTo(pointf[2][0], pointf[2][1]);
        path.lineTo(pointf[4][0], pointf[4][1]);
        path.lineTo(pointf[1][0], pointf[1][1]);
        path.lineTo(pointf[3][0], pointf[3][1]);
        path.lineTo(pointf[0][0], pointf[0][1]);
        path.close();
        canvas.drawPath(path, paint);
    }


}
