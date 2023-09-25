package org.levtio.demo.design.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/25  17:50
 * @Describe:
 */
public class PayFingerprintMode implements IPayMode{
    protected Logger logger = LoggerFactory.getLogger(PayFingerprintMode.class);
    @Override
    public boolean security(String uId) {
        logger.info("指纹支付，风控校验指纹信息");
        return true;
    }
}
