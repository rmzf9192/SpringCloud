package com.el.cloud.service;


import com.el.cloud.entities.Payment;

/**
 * @author Roman.Zhang
 * @date 2020/3/8
 * @description:
 */
public interface PaymentService {
    /**
     * 新增
     *
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据Id查询
     *
     * @param id
     * @return
     */
    Payment getPaymentById(Long id);
}
