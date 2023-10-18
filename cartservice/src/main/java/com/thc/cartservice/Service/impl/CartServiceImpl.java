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
        String id = UUID.randomUUID().toString();
        Cart cart = new Cart(cartArgs.getName(),cartArgs.getManager(),cartArgs.getAddress());
        cart.setId(id);
        cart.setCreatedAt(LocalDate.now());
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

        if(this.getCart(id) == null){
            return null;
        }
        Cart cart = this.getCart(updateCartArgs.getId());
        cart.setName(updateCartArgs.getName());
        cart.setManager(updateCartArgs.getManager());
        cart.setAddress(updateCartArgs.getAddress());


        cartRepository.updateCart(cart);
        return cartRepository.getCart(id);
    }

    @Override
    public int deleteCart(String id) {
        String cartId = this.getCart(id).getId();
        return cartRepository.deleteCart(cartId);
    }

    @Override
    public int deleteCartAll() {
        if(cartRepository.deleteCartAll() == 0){
            throw new CartNotFoundException("Không có dữ liệu");
        }
        return cartRepository.deleteCartAll();
    }

    @Override
    public int count() {
        return cartRepository.count();
    }
}
