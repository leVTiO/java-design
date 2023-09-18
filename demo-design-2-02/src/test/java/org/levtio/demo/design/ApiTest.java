package org.levtio.demo.design;

import org.junit.Test;
import org.levtio.demo.design.factory.JDKProxy;
import org.levtio.demo.design.factory.impl.EGMCacheAdapter;
import org.levtio.demo.design.factory.impl.IIRCacheAdapter;
import org.levtio.demo.design.impl.CacheServiceImpl;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/18  16:49
 * @Describe:
 */
public class ApiTest {
    @Test
    public void test_CacheService() throws Exception {

        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "levtio");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println("测试结果：" + val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "levtio");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println("测试结果：" + val02);

    }
}
