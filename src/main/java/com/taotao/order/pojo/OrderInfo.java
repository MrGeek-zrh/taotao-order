package com.taotao.order.pojo;

import java.util.List;

import com.taotao.pojo.Order;
import com.taotao.pojo.OrderItem;
import com.taotao.pojo.OrderShipping;

/**
 * 用于接收订单数据的实体类
* <p>Title: OrderInfo.java<／p>
* <p>Description: <／p>
* <p>Copyright: Copyright (c) 2020<／p>
* <p>Company: CUIT<／p>
* @author MrGeek
* @date 2020-10-23_00:13:59
* @version 1.0
 */
public class OrderInfo extends Order{

	private List<OrderItem> orderItems;
	private OrderShipping orderShipping;
	
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	public OrderShipping getOrderShipping() {
		return orderShipping;
	}
	public void setOrderShipping(OrderShipping orderShipping) {
		this.orderShipping = orderShipping;
	}
	
}