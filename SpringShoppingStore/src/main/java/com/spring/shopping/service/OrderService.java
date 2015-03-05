package com.spring.shopping.service;

import java.text.ParseException;
import java.util.List;

import com.spring.shopping.model.AddressForm;
import com.spring.shopping.model.Customer;
import com.spring.shopping.model.Order;
import com.spring.shopping.model.Product;

public interface OrderService {
	public void createOrder(Order order, CartService cartService,
			Customer customer, AddressForm address) throws ParseException;
	public List<Product> getAllOrderItems(Order order);
	
	public List<Order> getAllOrdersForCustomer(Customer customer);
	
	Order getOrderById(Long orderId);

}