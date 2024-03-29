package com.thc.customerservice.Entity;

import com.fasterxml.uuid.impl.UUIDUtil;
import com.thc.customerservice.Config.Level;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Data
public class Customer {
    @Id
    private String id;
    private String name;
    private String phone;
    private int point;
    private String level;

    public Customer() {
    }

    public Customer(String id, String name, String phone, int point, String level) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.point = point;
        this.level = level;
    }

    public Customer(String name, String phone, int point, String level) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.phone = phone;
        this.point = point;
        this.level = level;
    }

    public Customer(String name, String phone) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.phone = phone;
        this.level = Level.Dong;
    }

    public Customer(String id, int point,String level) {
        this.id = id;
        this.point = point;
        this.level = level;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

}
