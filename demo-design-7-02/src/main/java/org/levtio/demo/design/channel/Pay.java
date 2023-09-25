package org.levtio.demo.design.channel;

import org.levtio.demo.design.mode.IPayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/25  17:26
 * @Describe:
 */
public abstract class Pay {
    protected Logger logger = LoggerFactory.getLogger(Pay.class);
    protected IPayMode payMode;
    public Pay(IPayMode payMode){
        this.payMode = payMode;
    }
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);

}
