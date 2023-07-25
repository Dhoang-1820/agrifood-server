package com.web.Agrifood.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.Agrifood.interfaceServices.ICartServices;
import com.web.Agrifood.mapper.CartMapper;
import com.web.Agrifood.mapper.UserMapper;
import com.web.Agrifood.model.Cart;
import com.web.Agrifood.model.CartExample;
import com.web.Agrifood.model.User;
@Service
public class CartServices implements ICartServices {
	
	@Autowired
	CartMapper cartMapper;


	@Override
	public List<Cart> getAllCarts() {
		CartExample example = new CartExample();
		return cartMapper.selectByExample(example);
	}
	
	@Override
	public Cart getCartByProductId(int id) {
		return cartMapper.selectByProductId(id);
	}
	
	@Override
	public int newCart(Cart cart) {
		return cartMapper.insert(cart);
	}

	@Override
	public int editCart(Cart cart) {
		return cartMapper.updateByPrimaryKeySelective(cart);
	}

	@Override
	public int deleteCart(int id) {
		return cartMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Cart getCartById(int id) {
		return cartMapper.selectByPrimaryKey(id);
	}

}
