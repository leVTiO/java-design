package org.levtio.demo.design.goods;
import com.alibaba.fastjson.JSON;
/**
 * 模拟实体商品服务
 */
public class GoodsService {
    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }
}
