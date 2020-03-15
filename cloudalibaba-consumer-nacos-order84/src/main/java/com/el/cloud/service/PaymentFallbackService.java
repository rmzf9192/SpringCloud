package com.el.cloud.service;

import com.el.cloud.entities.CommonResult;
import com.el.cloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author Roman.Zhang
 * @date 2020/3/15
 * @description:
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, "fallback");
    }
}
