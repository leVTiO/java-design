package org.levtio.demo.design;

import com.alibaba.fastjson.JSON;
import org.levtio.demo.design.mq.OrderMq;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/22  14:54
 * @Describe:
 */
public class OrderMqService {
    public void onMessage(String message) {

        OrderMq mq = JSON.parseObject(message, OrderMq.class);

        mq.getUid();
        mq.getOrderId();
        mq.getCreateOrderTime();

        // ... 处理自己的业务
    }
}
