package org.levtio.demo.design.test;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.levtio.demo.design.Activity;
import org.levtio.demo.design.ActivityController;
import org.levtio.demo.design.ActivityFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: LuoMingDong
 * @Date: 2023/10/9  14:21
 * @Describe:
 */
public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);
    private ActivityController activityController = new ActivityController();
    @Test
    public void test_queryActivityInfo(){
        Long req = 10001L;
        Activity activity = activityController.queryActivityInfo(req);
        logger.info("测试结果：{} {}", req, JSON.toJSONString(activity));
    }
}
