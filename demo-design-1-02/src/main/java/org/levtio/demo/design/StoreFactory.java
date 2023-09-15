package org.levtio.demo.design;

import org.levtio.demo.design.store.ICommodity;
import org.levtio.demo.design.store.impl.CardCommodityService;
import org.levtio.demo.design.store.impl.CouponCommodityService;
import org.levtio.demo.design.store.impl.GoodsCommodityService;

public class StoreFactory {
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }
}
