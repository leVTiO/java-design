package org.levtio.demo.design.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @Author: LuoMingDong
 * @Date: 2023/9/25  17:45
 * @Describe:
 */
public class PayCypher implements IPayMode{

    protected Logger logger = LoggerFactory.getLogger(PayCypher.class);
    @Override
    public boolean security(String uId) {
        logger.info("密码支付，风控校验环境安全");
        return true;
    }
}
