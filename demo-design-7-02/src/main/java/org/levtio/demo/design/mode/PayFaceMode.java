package org.levtio.demo.design.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/25  17:47
 * @Describe:
 */
public class PayFaceMode implements IPayMode{
    protected Logger logger = LoggerFactory.getLogger(PayFaceMode.class);
    @Override
    public boolean security(String uId) {
        logger.info("人脸支付，风控校验脸部识别");
        return true;
    }
}
