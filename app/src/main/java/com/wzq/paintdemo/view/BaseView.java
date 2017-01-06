package com.wzq.paintdemo.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.View;

import com.wzq.paintdemo.R;

/**
 * Created by wzq on 17-1-6.
 */

public class BaseView extends View {
    protected Bitmap bitmap;

    public BaseView(Context context) {
        this(context, null);
    }

    public BaseView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BaseView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.a);
    }

    public void destoyBitmap()
    {
        if(bitmap!= null && !bitmap.isRecycled())
            bitmap.recycle();
    }

}
