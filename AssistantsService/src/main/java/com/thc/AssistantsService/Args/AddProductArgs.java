package com.thc.productservice.Args;

public class AddProductArgs {
    private String name;
    private String avatar;
    private Long price;
    private String cateId;

    public AddProductArgs(String name, String avatar, Long price, String cateId) {
        this.name = name;
        this.avatar = avatar;
        this.price = price;
        this.cateId = cateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getCateId() {
        return cateId;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId;
    }
}
