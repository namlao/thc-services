package com.thc.cartservice.Service.impl;

import com.thc.cartservice.Args.AddCartArgs;
import com.thc.cartservice.Args.UpdateCartArgs;
import com.thc.cartservice.Entity.Cart;
import com.thc.cartservice.Exception.CartNotFoundException;
import com.thc.cartservice.Repository.CartRepository;
import com.thc.cartservice.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;

    @Override
    public Cart createCart(AddCartArgs cartArgs) {
        Cart cart = new Cart(cartArgs.getName(),cartArgs.getManager(),cartArgs.getAddress());
        String id = cart.getId();
        cartRepository.createCart(cart);

        return cartRepository.getCart(id);
    }

    @Override
    public Cart getCart(String id) {
        if(cartRepository.getCart(id) == null){
            throw new CartNotFoundException("Id không tồn tại");
        }
        return cartRepository.getCart(id);
    }

    @Override
    public List<Cart> getAllCart() {
        return cartRepository.getAllCart();
    }

    @Override
    public Cart updateCart(UpdateCartArgs updateCartArgs){
        String id = updateCartArgs.getId();

        Cart cart = this.getCart(id);

        cart.setName(updateCartArgs.getName());
        cart.setManager(updateCartArgs.getManager());
        cart.setAddress(updateCartArgs.getAddress());


        cartRepository.updateCart(cart);
        return cart;
    }

    @Override
    public int deleteCart(String id) {
        return cartRepository.deleteCart(this.getCart(id).getId());
    }

    @Override
    public int deleteCartAll() {
        if(this.count() == 0){
            throw new CartNotFoundException("Không có dữ liệu");
        }
        return cartRepository.deleteCartAll();
    }

    @Override
    public Long count() {
        return cartRepository.count();
    }
}
