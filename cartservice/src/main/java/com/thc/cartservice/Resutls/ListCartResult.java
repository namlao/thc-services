package com.thc.cartservice.Resutls;

import com.thc.cartservice.Entity.Cart;
import com.thc.cartservice.Service.CartService;
import org.springframework.http.HttpStatus;

import java.util.List;

public class ListCartResult {
    private int count;
    private int code;
    private List<Cart> carts;

    public ListCartResult(List<Cart> cart) {
        this.carts = cart;
        this.code = HttpStatus.OK.value();
        this.count = cart.size();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }
}
