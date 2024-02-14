package com.thc.productservice.Service;

import com.thc.productservice.Args.AddProductArgs;
import com.thc.productservice.Args.UpdateProductArgs;
import com.thc.productservice.Entity.Product;

import java.util.List;

public interface ProductService {
    public Product createProduct(AddProductArgs cart);

    public Product getProduct(String id);

    public List<Product> getAllProduct();

    public Product updateProduct(UpdateProductArgs cart);

    public int deleteProduct(String id);
    public int deleteProductAll();

    public Long count();
}
