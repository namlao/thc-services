package com.thc.cartservice.Mapper;

import com.thc.cartservice.Entity.Cart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.UUID;

@Mapper
public interface CartMapper {
    List<Cart> findAll();

    Cart findById(String id);

    int addCart(Cart cart);

    int count();

    int deleteById(String id);

    int deleteAll();

    int updateCart(Cart cart);
}
