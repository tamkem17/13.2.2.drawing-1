package com.example.tam.a1322drawing_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

/**
 * Created by tam on 7/26/2017.
 */

public class DrawingRectagle extends View {
    private String mText = "Wow !";
    private Paint mPaint = new Paint();
    public DrawingRectagle(Context context) {
        super(context);
    }

    public DrawingRectagle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Random random = new Random();
        super.onDraw(canvas);

        DrawShapeView(canvas, 600, 600);
        mPaint.setTextAlign(Paint.Align.CENTER);
        mPaint.setTextSize(50);
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE);
        float w = mPaint.measureText(mText)/2;
        float textSize = mPaint.getTextSize();
        int viewWidth = getWidth();
        int viewHeight = getHeight();
        canvas.translate(viewWidth/2, viewHeight/2);
        for(int i=0; i<5; i++) {
            canvas.drawRect(viewHeight/8-w, viewHeight/8 - textSize, viewWidth/5 + w, viewWidth/5, mPaint);
            canvas.drawText(mText, viewHeight/7, viewWidth/6, mPaint);
            canvas.rotate(-36);
        }

    }

    public void DrawShapeView(Canvas drawBitmap, float viewHieght, float viewWidth){
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        float left = (getWidth()-viewWidth)/2.0f;
        float top = (getHeight()-viewHieght)/2.0f;
        drawBitmap.drawRect(left,top,left+viewWidth,top+viewHieght, paint);

    }




}
