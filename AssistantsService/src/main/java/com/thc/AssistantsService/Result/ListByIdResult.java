package com.thc.productservice.Result;

import com.thc.productservice.Entity.Product;
import org.springframework.http.HttpStatus;

public class ListByIdResult {
    private int code;
    private Product data;

    public ListByIdResult(Product data) {
        this.code = HttpStatus.OK.value();
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Product getData() {
        return data;
    }

    public void setData(Product data) {
        this.data = data;
    }
}
