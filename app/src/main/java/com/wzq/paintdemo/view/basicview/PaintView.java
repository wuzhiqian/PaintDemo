package com.wzq.paintdemo.view.basicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import com.wzq.paintdemo.R;
import com.wzq.paintdemo.util.basic.DrawBas;
import com.wzq.paintdemo.util.shder.DrawBitmapShader;
import com.wzq.paintdemo.util.basic.DrawOlmpic;
import com.wzq.paintdemo.util.basic.DrawStar;

/**
 * Created by wzq on 17-1-5.
 */

public class PaintView extends View {


    private Bitmap bitmap;
    private Bitmap dogBmp;

    public PaintView(Context context) {
        this(context, null);
    }

    public PaintView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PaintView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.pic);
        dogBmp = BitmapFactory.decodeResource(getResources(),R.mipmap.a);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        DrawOlmpic.drawOlmpic(canvas, bitmap);
        DrawStar.drawStar(canvas);
        DrawBas.drawBas(canvas);
      //  DrawBitmapShader.drawBitmapShader(canvas, dogBmp);

   //     DrawBitmapShader.drawArcBitmapShader(canvas, dogBmp);
    }


    public void destoryBitmap()
    {
        if(bitmap != null && !bitmap.isRecycled())
            bitmap.recycle();
        if(dogBmp != null && !dogBmp.isRecycled())
            dogBmp.recycle();
    }
}
