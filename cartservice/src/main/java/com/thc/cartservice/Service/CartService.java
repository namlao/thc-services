package com.thc.cartservice.Service;

import com.thc.cartservice.Args.AddCartArgs;
import com.thc.cartservice.Args.UpdateCartArgs;
import com.thc.cartservice.Entity.Cart;

import java.util.List;

public interface CartService {
    public Cart createCart(AddCartArgs cart);

    public Cart getCart(String id);

    public List<Cart> getAllCart();

    public Cart updateCart(UpdateCartArgs cart);

    public int deleteCart(String id);
    public int deleteCartAll();

    public Long count();
}
