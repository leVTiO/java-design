package org.levtio.demo.design.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/22  14:42
 * @Describe:
 */
public class POPOrderService {
    private Logger logger = LoggerFactory.getLogger(POPOrderService.class);

    public boolean isFirstOrder(String uId) {
        logger.info("POP商家，查询用户的订单是否为首单：{}", uId);
        return true;
    }
}
