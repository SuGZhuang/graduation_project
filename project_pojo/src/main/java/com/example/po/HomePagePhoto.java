package com.example.po;

import java.io.Serializable;


public class HomePagePhoto implements Serializable {

    private Integer id;
    private Integer likeCount;
    private String illustration;
    private String address;
    private String bigaddress;

    public HomePagePhoto(Integer id, Integer likeCount, String illustration, String address, String bigaddress) {
        this.id = id;
        this.likeCount = likeCount;
        this.illustration = illustration;
        this.address = address;
        this.bigaddress = bigaddress;
    }

    public HomePagePhoto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public String getIllustration() {
        return illustration;
    }

    public void setIllustration(String illustration) {
        this.illustration = illustration;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBigaddress() {
        return bigaddress;
    }

    public void setBigaddress(String bigaddress) {
        this.bigaddress = bigaddress;
    }
}
