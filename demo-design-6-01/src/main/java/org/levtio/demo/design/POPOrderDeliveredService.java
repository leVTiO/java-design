package org.levtio.demo.design;

import com.alibaba.fastjson.JSON;
import org.levtio.demo.design.mq.POPOrderDelivered;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/22  14:54
 * @Describe:
 */
public class POPOrderDeliveredService {
    public void onMessage(String message) {

        POPOrderDelivered mq = JSON.parseObject(message, POPOrderDelivered.class);

        mq.getuId();
        mq.getOrderId();
        mq.getOrderTime();

        // ... 处理自己的业务
    }
}
