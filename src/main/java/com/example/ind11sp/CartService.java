package com.example.ind11sp;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    private final Cart cart;


    public CartService(Cart cart) {
        this.cart = cart;
    }
    public void add(Integer[] ids){
        cart.add(ids);
    }
    public List<Integer> all(){
        return cart.getAll();
    }
}
