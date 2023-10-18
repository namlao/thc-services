package com.thc.cartservice.Resutls;

import com.thc.cartservice.Entity.Cart;
import org.springframework.http.HttpStatus;

import java.util.List;

public class ListByIdResult {
    private int code;
    private Cart data;

    public ListByIdResult(Cart data) {
        this.code = HttpStatus.OK.value();
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Cart getData() {
        return data;
    }

    public void setData(Cart data) {
        this.data = data;
    }
}
