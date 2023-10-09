package org.levtio.demo.design;

import java.util.Date;

/**
 * @Author: LuoMingDong
 * @Date: 2023/10/9  13:36
 * @Describe:
 */
public class ActivityController {
    public Activity queryActivityInfo(Long id) {
        // 模拟从实际业务应用从接口中获取活动信息
        Activity activity = new Activity();
        activity.setId(10001L);
        activity.setName("手机抢购");
        activity.setDesc("狂撸手机促销大活动第二期");
        activity.setStartTime(new Date());
        activity.setStopTime(new Date());
        activity.setStock(new Stock(1000,1));
        return activity;
    }
}
