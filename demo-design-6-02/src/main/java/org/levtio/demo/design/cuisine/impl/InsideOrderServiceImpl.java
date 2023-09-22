package org.levtio.demo.design.cuisine.impl;

import org.levtio.demo.design.OrderAdapterService;
import org.levtio.demo.design.service.OrderService;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/22  15:10
 * @Describe:
 */
public class InsideOrderServiceImpl implements OrderAdapterService {
    private OrderService orderService = new OrderService();
    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }
}
