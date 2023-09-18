package org.levtio.demo.design.test;

import org.junit.Test;
import org.levtio.demo.design.CacheService;
import org.levtio.demo.design.cuisine.impl.CacheServiceImpl;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/18  13:50
 */
public class ApiTest {
    @Test
    public void test_CacheService() {

        CacheService cacheService = new CacheServiceImpl();

        cacheService.set("user_name_01", "levtio", 1);
        String val01 = cacheService.get("user_name_01", 1);
        System.out.println("测试结果：" + val01);

    }
}
