package com.thc.productservice.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.UUID;

@Data
public class Product {
    @Id
    private String id;
    private String name;
    private String avatar;
    private Long price;
    private String cateId;

    public Product() {
    }

    public Product(String id, String name, String avatar, Long price, String cateId) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.price = price;
        this.cateId = cateId;
    }

    public Product(String name, String avatar, Long price, String cateId) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.avatar = avatar;
        this.price = price;
        this.cateId = cateId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
