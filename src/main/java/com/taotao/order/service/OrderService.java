package com.taotao.order.service;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.order.pojo.OrderInfo;

/**
 * 订单Service
* <p>Title: OrderService.java<／p>
* <p>Description: <／p>
* <p>Copyright: Copyright (c) 2020<／p>
* <p>Company: CUIT<／p>
* @author MrGeek
* @date 2020-10-23_08:23:15
* @version 1.0
 */
public interface OrderService {

	/**
	 * 生成订单
	* <p>Title: createOrder<／p>
	* <p>Description: <／p>
	* @param orderInfo
	* @return
	 */
	public TaotaoResult createOrder(OrderInfo orderInfo);
}
