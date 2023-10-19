package com.thc.cartservice.Repository.impl;

import com.thc.cartservice.Entity.Cart;
import com.thc.cartservice.Mapper.CartMapper;
import com.thc.cartservice.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CartRepositoryImpl implements CartRepository {
    @Autowired
    private CartMapper cartMapper;

    @Override
    public int createCart(Cart cart) {
        return cartMapper.addCart(cart);
    }

    @Override
    public Cart getCart(String id) {
        return cartMapper.findById(id);
    }

    @Override
    public List<Cart> getAllCart() {
        return cartMapper.findAll();
    }

    @Override
    public int updateCart(Cart cart) {
        return cartMapper.updateCart(cart);
    }

    @Override
    public int deleteCart(String id) {
        return cartMapper.deleteById(id);
    }

    @Override
    public int deleteCartAll() {
        return cartMapper.deleteAll();
    }

    @Override
    public Long count() {
        return cartMapper.count();
    }
}
