package com.el.cloud.service;

import com.el.cloud.domain.Order;

/**
 * @author Roman.Zhang
 * @date 2020/3/17
 * @description:
 */
public interface OrderService {
    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}
