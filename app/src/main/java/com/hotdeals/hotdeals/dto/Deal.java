package com.hotdeals.hotdeals.dto;

import java.util.List;

/**
 * Created by confiz-2349 on 09/11/15.
 */
public class Deal {

    private int id;
    private int categoryId;
    private String dealName;
    private String imagePath;
    private List<Comment> comments;

    public Deal() {
    }

    public Deal(int id, int categoryId, String dealName, String imagePath, List<Comment> comments) {
        this.id = id;
        this.categoryId = categoryId;
        this.dealName = dealName;
        this.imagePath = imagePath;
        this.comments = comments;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getDealName() {
        return dealName;
    }

    public void setDealName(String dealName) {
        this.dealName = dealName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
