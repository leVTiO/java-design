package org.levtio.demo.design.store;

import java.util.Map;

/**
 * @author 罗明东
 */
public interface ICommodity {
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
