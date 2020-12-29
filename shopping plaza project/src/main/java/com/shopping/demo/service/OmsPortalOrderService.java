package com.shopping.demo.service;

import com.shopping.demo.common.api.CommonResult;
import com.shopping.demo.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

public interface OmsPortalOrderService {
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    @Transactional
    void cancelOrder(Long orderId);
}
