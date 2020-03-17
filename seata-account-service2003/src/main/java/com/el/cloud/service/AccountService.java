package com.el.cloud.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author Roman.Zhang
 * @date 2020/3/17
 * @description:
 */
@Service
public interface AccountService {
    /**
     * 减库存
     *
     * @param userId 用户id
     * @param money  金额
     * @return
     */
    void decrease(Long userId, BigDecimal money);
}
