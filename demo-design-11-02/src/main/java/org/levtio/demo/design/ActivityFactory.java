package org.levtio.demo.design;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: LuoMingDong
 * @Date: 2023/10/9  13:51
 * @Describe:
 */
public class ActivityFactory {
    static Map<Long, Activity> activityMap = new HashMap<>();
    public static Activity getActivity(Long id){
        Activity activity = activityMap.get(id);
        if (null == activity){
            // 模拟从实际业务引用从接口中获取活动信息
            activity = new Activity();
            activity.setId(10001L);
            activity.setName("手机抢购");
            activity.setDesc("狂撸手机促销大活动第二期");
            activity.setStartTime(new Date());
            activity.setStopTime(new Date());
            activityMap.put(id, activity);
        }
        return activity;
    }
}
