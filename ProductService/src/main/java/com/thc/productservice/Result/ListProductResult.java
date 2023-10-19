package com.thc.productservice.Result;

import com.thc.productservice.Entity.Product;
import org.springframework.http.HttpStatus;

import java.util.List;

public class ListProductResult {
    private int count;
    private int code;
    private List<Product> products;

    public ListProductResult(List<Product> productList) {
        this.products = productList;
        this.code = HttpStatus.OK.value();
        this.count = productList.size();
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

    public List<Product> getProductList() {
        return products;
    }

    public void setProductList(List<Product> productList) {
        this.products = productList;
    }
}
