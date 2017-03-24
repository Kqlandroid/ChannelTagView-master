package com.view.test.com.zhl.channeltagview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 孔庆林 on 2017/3/24.
 */

public class CounterView extends View implements View.OnClickListener {
private Paint mpaint;
    private Rect mBoounds;
    private int mcount;
    public CounterView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mpaint=new Paint(Paint.ANTI_ALIAS_FLAG);
        mBoounds=new Rect();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mpaint.setColor(Color.parseColor("#D2216D"));
        canvas.drawRect(0,0,getWidth(),getHeight(),mpaint);
    }

    @Override
    public void onClick(View v) {

    }
}
