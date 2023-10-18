package com.thc.cartservice.Args;

public class AddCartArgs {
    private String name;
    private String manager;
    private String address;

    public AddCartArgs(String name, String manager, String address) {
        this.name = name;
        this.manager = manager;
        this.address = address;
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
}
