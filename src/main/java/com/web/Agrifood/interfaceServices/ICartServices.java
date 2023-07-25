package com.web.Agrifood.interfaceServices;

import java.util.List;

import org.springframework.stereotype.Service;

import com.web.Agrifood.model.Cart;

public interface ICartServices {
	public List<Cart>  getAllCarts();
	public Cart getCartByProductId(int id);
	public int newCart(Cart cart);
	public int editCart(Cart cart);
	public int deleteCart(int id);
	public Cart getCartById(int id);
}
