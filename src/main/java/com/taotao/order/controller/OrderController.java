package com.taotao.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.ExceptionUtil;
import com.taotao.order.pojo.OrderInfo;
import com.taotao.order.service.OrderService;

/**
 * 订单Controller
* <p>Title: OrderController.java<／p>
* <p>Description: <／p>
* <p>Copyright: Copyright (c) 2020<／p>
* <p>Company: CUIT<／p>
* @author MrGeek
* @date 2020-10-23_09:03:27
* @version 1.0
 */
@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	/**
	 * 生成订单的处理器
	* <p>Title: createOrder<／p>
	* <p>Description: <／p>
	* @param orderInfo
	* @return
	 */
	@RequestMapping(value="/order/create", method=RequestMethod.POST)
	@ResponseBody
	public TaotaoResult createOrder(@RequestBody OrderInfo orderInfo) {
		try {
			TaotaoResult result = orderService.createOrder(orderInfo);
			return result;
			
		} catch (Exception e) {
			e.printStackTrace();
			return TaotaoResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
}
