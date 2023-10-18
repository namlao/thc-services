package com.thc.cartservice.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.UUID;

@Data
public class Cart {

    @Id
    private String id;
    private String name;
    private String manager;
    private String address;

    @Column(name = "created_at", updatable=false)
    private LocalDate createdAt;

    public Cart() {
    }

    public Cart(String id, String name, String manager, String address, LocalDate createdAt) {
        this.id = id;
        this.name = name;
        this.manager = manager;
        this.address = address;
        this.createdAt = createdAt;
    }

    public Cart(String name, String manager, String address) {
        this.name = name;
        this.manager = manager;
        this.address = address;
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

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
