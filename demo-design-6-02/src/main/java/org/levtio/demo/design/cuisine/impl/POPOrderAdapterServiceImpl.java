package org.levtio.demo.design.cuisine.impl;

import org.levtio.demo.design.OrderAdapterService;
import org.levtio.demo.design.service.POPOrderService;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/22  15:14
 * @Describe:
 */
public class POPOrderAdapterServiceImpl implements OrderAdapterService {
    private POPOrderService popOrderService = new POPOrderService();

    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }

}
