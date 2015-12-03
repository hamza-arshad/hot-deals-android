package com.hotdeals.hotdeals.dto;

import java.util.List;

/**
 * Created by confiz-2349 on 08/11/15.
 */
public class Category {

    private int id;
    private String categoryName;
    private List<Deal> deals;

    public Category() {
    }

    public Category(int id, String categoryName, List<Deal> deals) {
        this.id = id;
        this.categoryName = categoryName;
        this.deals = deals;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Deal> getDeals() {
        return deals;
    }

    public void setDeals(List<Deal> deals) {
        this.deals = deals;
    }

    public void addDeal(Deal deal) {
        deals.add(deal);
    }
}
