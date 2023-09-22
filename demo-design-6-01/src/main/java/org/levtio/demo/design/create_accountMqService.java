package org.levtio.demo.design;

import com.alibaba.fastjson.JSON;
import org.levtio.demo.design.mq.create_account;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/22  14:54
 * @Describe:
 */
public class create_accountMqService {

    public void onMessage(String message){
        create_account mq = JSON.parseObject(message, create_account.class);

        mq.getNumber();
        mq.getAccountDate();
    }
}
