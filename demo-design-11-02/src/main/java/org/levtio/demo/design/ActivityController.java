package org.levtio.demo.design;

import org.levtio.demo.design.util.RedisUtils;

/**
 * @Author: LuoMingDong
 * @Date: 2023/10/9  14:13
 * @Describe:
 */
public class ActivityController {
    private RedisUtils redisUtils = new RedisUtils();
    public Activity queryActivityInfo(Long id) {
        Activity activity = ActivityFactory.getActivity(id);
        // 模拟从Redis中获取库存变化信息
        Stock stock = new Stock(1000, redisUtils.getStockUsed());
        activity.setStock(stock);
        return activity;
    }
}
