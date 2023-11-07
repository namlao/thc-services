package com.thc.customerservice.Requests;

public class UpdateCustomerByPhoneRequest {
    private String phone;
    private int point;
    private String level;

    public UpdateCustomerByPhoneRequest(String phone, int point, String level) {
        this.phone = phone;
        this.point = point;
        this.level = level;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
