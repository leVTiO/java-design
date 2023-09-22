package org.levtio.demo.design;

import java.util.Date;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/22  15:04
 * @Describe: 统一的MQ消息体
 */
public class RebateInfo {
    private String userId;
    private String bizId;
    private Date bizTime;
    private String desc;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public Date getBizTime() {
        return bizTime;
    }

    public void setBizTime(String bizTime) {
        this.bizTime = new Date(Long.parseLong("1591077840669"));
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
