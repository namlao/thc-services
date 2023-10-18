package com.thc.cartservice.Resutls;

import com.thc.cartservice.Entity.Cart;
import org.springframework.http.HttpStatus;

public class UpdateCartResult {
    private int code;
    private Cart cart;
    public UpdateCartResult(Cart cardResult) {
        this.code = HttpStatus.OK.value();
        this.cart = cardResult;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
