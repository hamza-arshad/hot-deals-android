package com.hotdeals.hotdeals.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.hotdeals.hotdeals.R;

import org.w3c.dom.Text;

import java.util.jar.Attributes;

/**
 * Created by Psychocoder on 14/12/15.
 */
public class DealDetailView extends ScrollView {

    private int like_drawable, dislike_drawable;
    private String titleText, oldPriceText, newPriceText, companyText, detailsText;

    private ImageView like, dislike;
    private TextView title, old_price, new_price, company, details;

    private int screenWidth, screenHeight;

    public DealDetailView(Context context) {
        super(context);
        initView();
    }

    private void initView() {

        like = new ImageView(this.getContext());
        like.setImageResource(R.drawable.logo);

        dislike = new ImageView(this.getContext());
        dislike.setImageResource(R.drawable.logo);

        title = new TextView(this.getContext());
        title.setText("Title of the Deal");

        old_price = new TextView(this.getContext());
        old_price.setText("Title of the Deal");

        new_price = new TextView(this.getContext());
        new_price.setText("Title of the Deal");

        company = new TextView(this.getContext());
        company.setText("Company");

        details = new TextView(this.getContext());
        details.setText("details");
    }

    @Override
    public void onDraw(Canvas canvas)
    {
        setPlaces();

    }

    private void setPlaces() {

        title.setX((int) (screenWidth*0.05));
        title.setY((int) (screenHeight * 0.45));

        like.setX((int) (screenWidth * 0.65));
        like.setY((int) (screenHeight * 0.45));

        dislike.setX((int) (screenWidth * 0.8));
        dislike.setY((int) (screenHeight * 0.45));

        old_price.setY((int) (screenHeight * 0.65));

        new_price.setY((int) (screenHeight * 0.7));

        company.setY((int) (screenHeight * 0.85));

        details.setY((int) (screenHeight));



    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        screenWidth = MeasureSpec.getSize(widthMeasureSpec);
        screenHeight = MeasureSpec.getSize(heightMeasureSpec);

        double scale = screenWidth*0.1;
        like.setScaleX((float) scale / like.getDrawable().getIntrinsicWidth());
        like.setScaleY((float) scale / like.getDrawable().getIntrinsicHeight());

        dislike.setScaleX(like.getScaleX());
        dislike.setScaleY(like.getScaleY());

        title.setWidth((int) (screenWidth*0.5));
        title.setHeight((int) (screenHeight*0.2));

        old_price.setWidth(screenWidth);
        new_price.setWidth(screenWidth);
        company.setWidth(screenWidth);
        details.setWidth(screenWidth);
    }

    public int getLike_drawable() {
        return like_drawable;
    }

    public void setLikeDrawable(int like_drawable) {
        this.like_drawable = like_drawable;
        this.like.setImageResource(like_drawable);
        invalidate();
    }

    public int getDislike_drawable() {
        return dislike_drawable;
    }

    public void setDislikeDrawable(int dislike_drawable) {
        this.dislike_drawable = dislike_drawable;
        this.dislike.setImageResource(dislike_drawable);
        invalidate();
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
        this.title.setText(titleText);
        invalidate();
    }

    public String getOldPriceText() {
        return oldPriceText;
    }

    public void setOldPriceText(String oldPriceText) {
        this.oldPriceText = oldPriceText;
        this.old_price.setText(oldPriceText);
        invalidate();
    }

    public String getNewPriceText() {
        return newPriceText;
    }

    public void setNewPriceText(String newPriceText) {
        this.newPriceText = newPriceText;
        this.new_price.setText(newPriceText);
        invalidate();
    }

    public String getCompanyText() {
        return companyText;
    }

    public void setCompanyText(String companyText) {
        this.companyText = companyText;
        this.company.setText(companyText);
        invalidate();
    }

    public String getDetailsText() {
        return detailsText;
    }

    public void setDetailsText(String detailsText) {
        this.detailsText = detailsText;
        this.details.setText(detailsText);
        invalidate();
    }
}
