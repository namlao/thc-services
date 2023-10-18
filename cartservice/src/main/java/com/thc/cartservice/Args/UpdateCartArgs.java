package com.thc.cartservice.Args;

public class UpdateCartArgs {
    private String id;
    private String name;
    private String manager;
    private String address;

    public UpdateCartArgs(String id, String name, String manager, String address) {
        this.id = id;
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
}
