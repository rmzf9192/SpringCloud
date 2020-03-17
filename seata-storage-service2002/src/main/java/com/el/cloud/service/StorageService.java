package com.el.cloud.service;

/**
 * @author Roman.Zhang
 * @date 2020/3/17
 * @description:
 */
public interface StorageService {
    /**
     * 减库存
     *
     * @param productId
     * @param count
     * @return
     */
    void decrease(Long productId, Integer count);
}
