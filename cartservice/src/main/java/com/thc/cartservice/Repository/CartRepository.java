package com.thc.cartservice.Repository;

import com.thc.cartservice.Entity.Cart;

import java.util.List;

public interface CartRepository {
    public int createCart(Cart cart);

    public Cart getCart(String id);

    public List<Cart> getAllCart();

    public int updateCart(Cart cart);

    public int deleteCart(String id);
    public int deleteCartAll();

    public Long count();
}
