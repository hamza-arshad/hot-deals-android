package com.hotdeals.hotdeals.Views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.widget.ScrollView;
import android.widget.TextView;

import com.hotdeals.hotdeals.R;

/**
 * Created by Psychocoder on 15/12/15.
 */
public class CustomTextView extends TextView {

    private TypedArray typedArray;
    private float x,y,width,height;

    public CustomTextView(Context context) {
        super(context);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        typedArray = context.obtainStyledAttributes(attrs, R.styleable.HotDeals);
        x = typedArray.getFloat(R.styleable.HotDeals_X, x);
        y = typedArray.getFloat(R.styleable.HotDeals_Y, y);
        width = typedArray.getFloat(R.styleable.HotDeals_width, width);
        height = typedArray.getFloat(R.styleable.HotDeals_horizontal, height);
        //this.setMovementMethod(new ScrollingMovementMethod());
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        typedArray = context.obtainStyledAttributes(attrs, R.styleable.HotDeals);
        x = typedArray.getFloat(R.styleable.HotDeals_X, x);
        y = typedArray.getFloat(R.styleable.HotDeals_Y, y);
        width = typedArray.getFloat(R.styleable.HotDeals_width, width);
        height = typedArray.getFloat(R.styleable.HotDeals_horizontal, height);
        //this.setMovementMethod(new ScrollingMovementMethod());
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int screenWidth = MeasureSpec.getSize(widthMeasureSpec);
        int screenHeight = MeasureSpec.getSize(heightMeasureSpec);

        setX((int) (screenWidth*x));
        setY((int) (screenHeight*y));

        //MUST do this to store the measurements
        setMeasuredDimension((int)(screenWidth*width), (int) (screenHeight*height));
    }
}
