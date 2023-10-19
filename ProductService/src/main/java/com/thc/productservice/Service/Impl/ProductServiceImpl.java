package com.thc.productservice.Service.Impl;

import com.thc.productservice.Args.AddProductArgs;
import com.thc.productservice.Args.UpdateProductArgs;
import com.thc.productservice.Entity.Product;
import com.thc.productservice.Exception.ProductNotFoundException;
import com.thc.productservice.Repository.ProductRepository;
import com.thc.productservice.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(AddProductArgs cart) {
        Product product = new Product(cart.getName(),cart.getAvatar(),cart.getPrice(),cart.getCateId());
        String id = product.getId();
        productRepository.addProduct(product);
        return this.getProduct(id);
    }

    @Override
    public Product getProduct(String id) {
        if(productRepository.findById(id) == null){
            throw new ProductNotFoundException("Id không tồn tại");
        }
        return productRepository.findById(id);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product updateProduct(UpdateProductArgs updateProductArgs) {
        String id = updateProductArgs.getId();

        Product product = this.getProduct(id);

        product.setName(updateProductArgs.getName());
        product.setAvatar(updateProductArgs.getAvatar());
        product.setPrice(updateProductArgs.getPrice());
        product.setCateId(updateProductArgs.getCateId());


        productRepository.updateProduct(product);
        return product;
    }

    @Override
    public int deleteProduct(String id) {
        return productRepository.deleteById(this.getProduct(id).getId());
    }

    @Override
    public int deleteProductAll() {
        if(this.count() == 0){
            throw new ProductNotFoundException("Không có dữ liệu");
        }
        return productRepository.deleteAll();
    }

    @Override
    public Long count() {
        return productRepository.count();
    }
}
