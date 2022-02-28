package com.example.btvn4;

public class ListPost {
    private int thumbnail;
    private String titlepost;
    private String fan;
    private String amount;
    private String status;

    public ListPost(int thumbnail, String titlepost, String fan, String amount, String status) {
        this.thumbnail = thumbnail;
        this.titlepost = titlepost;
        this.fan = fan;
        this.amount = amount;
        this.status = status;
    }

    public ListPost(int post_1, String abc, String abc1, String szc) {
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitlepost() {
        return titlepost;
    }

    public void setTitlepost(String titlepost) {
        this.titlepost = titlepost;
    }

    public String getFan() {
        return fan;
    }

    public void setFan(String fan) {
        this.fan = fan;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
