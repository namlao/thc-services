package com.thc.productservice.Result;

import com.thc.productservice.Entity.Product;
import org.springframework.http.HttpStatus;

public class UpdateProductResult {
    private int code;
    private Product product;
    public UpdateProductResult(Product productResult) {
        this.code = HttpStatus.OK.value();
        this.product = productResult;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
