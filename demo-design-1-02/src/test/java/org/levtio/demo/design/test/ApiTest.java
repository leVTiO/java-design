package org.levtio.demo.design.test;

import org.junit.Test;
import org.levtio.demo.design.StoreFactory;
import org.levtio.demo.design.store.ICommodity;

import java.util.HashMap;
import java.util.Map;

public class ApiTest {

    @Test
    public void test_commodity() throws Exception {
        StoreFactory storeFactory = new StoreFactory();

        // 1. 优惠券
        ICommodity commodityService_1 = storeFactory.getCommodityService(1);
        commodityService_1.sendCommodity("10001", "EGM1023938910232121323432", "791098764902132", null);

        // 2. 实物商品
        ICommodity commodityService_2 = storeFactory.getCommodityService(2);
        Map<String,String> extMap = new HashMap<String,String>();
        extMap.put("consigneeUserName", "levtio");
        extMap.put("consigneeUserPhone", "18708422873");
        extMap.put("consigneeUserAddress", "四川省成都市新都区");

        commodityService_2.sendCommodity("10001","9820198721311","1023000020112221113",new HashMap<String, String>() {{
            put("consigneeUserName", "levtio");
            put("consigneeUserPhone", "18708422873");
            put("consigneeUserAddress", "四川省成都市新都区");
        }});

        // 3. 第三方兑换卡(爱奇艺)
        ICommodity commodityService_3 = storeFactory.getCommodityService(3);
        commodityService_3.sendCommodity("10001","AQY1xjkUodl8LO975GdfrYUio",null,null);

    }

}
