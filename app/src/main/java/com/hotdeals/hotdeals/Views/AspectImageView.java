package com.hotdeals.hotdeals.Views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import com.hotdeals.hotdeals.R;

/**
 * Created by Psychocoder on 14/12/15.
 */

public class AspectImageView extends ImageView {

    private TypedArray typedArray;
    private float x,y,width,height;

    public AspectImageView(Context context) {
        super(context);
    }

    public AspectImageView(Context context, AttributeSet attrs) {

        super(context, attrs);
        typedArray = context.obtainStyledAttributes(attrs, R.styleable.HotDeals);
        x = typedArray.getFloat(R.styleable.HotDeals_X,x);
        y = typedArray.getFloat(R.styleable.HotDeals_Y, y);
        width = typedArray.getFloat(R.styleable.HotDeals_width, width);
        height = typedArray.getFloat(R.styleable.HotDeals_horizontal, height);

    }

    public AspectImageView(Context context, AttributeSet attrs, int defStyle) {

        super(context, attrs, defStyle);
        typedArray = context.obtainStyledAttributes(attrs, R.styleable.HotDeals);
        x = typedArray.getFloat(R.styleable.HotDeals_X,x);
        y = typedArray.getFloat(R.styleable.HotDeals_Y, y);
        width = typedArray.getFloat(R.styleable.HotDeals_width, width);
        height = typedArray.getFloat(R.styleable.HotDeals_horizontal, height);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int screenWidth = MeasureSpec.getSize(widthMeasureSpec);
        int screenHeight = MeasureSpec.getSize(heightMeasureSpec);

        //Figure out the aspect ratio of the image content
        int desiredSize;
        float aspect;
        Drawable d = getDrawable();
        if (d == null) {
            desiredSize = 0;
            aspect = 1f;
        } else {
            desiredSize = (int) (screenHeight*height);
            aspect = (float) d.getIntrinsicWidth() / (float) d.getIntrinsicHeight();
        }

        int widthSize = (int) (desiredSize * aspect);
        int heightSize = desiredSize;

        if(widthSize > screenWidth)
        {
            heightSize = (int) (heightSize - ((widthSize - screenWidth)/aspect));
            widthSize = screenWidth;
        }

        setX((screenWidth * x) - widthSize / 2);
        setY(screenHeight * y);

        //MUST do this to store the measurements
        setMeasuredDimension(widthSize, heightSize);
    }
}
