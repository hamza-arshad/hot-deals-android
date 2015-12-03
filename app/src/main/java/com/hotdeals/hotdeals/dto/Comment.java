package com.hotdeals.hotdeals.dto;

/**
 * Created by confiz-2349 on 09/11/15.
 */
public class Comment {

    private int id;
    private int dealId;
    private int userId;
    private User user;
    private Deal deal;

    public Comment() {
    }

    public Comment(int id, int dealId, int userId, User user, Deal deal) {
        this.id = id;
        this.dealId = dealId;
        this.userId = userId;
        this.user = user;
        this.deal = deal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDealId() {
        return dealId;
    }

    public void setDealId(int dealId) {
        this.dealId = dealId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }
}
