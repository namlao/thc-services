package com.thc.productservice.Result;

import org.springframework.http.HttpStatus;

public class DeleteByIdResult {
    private int code;
    private int count;

    public DeleteByIdResult(int count) {
        this.count = count;
        this.code = HttpStatus.OK.value();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
