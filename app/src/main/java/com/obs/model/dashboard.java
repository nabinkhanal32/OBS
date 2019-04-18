package com.obs.model;

public class dashboard {
    private String name;
    private String phoneNo;
    private int imgId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public dashboard(String name, String phoneNo, int imgId) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.imgId = imgId;
    }
}
