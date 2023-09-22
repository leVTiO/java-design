package org.levtio.demo.design.mq;

import com.alibaba.fastjson.JSON;

import java.util.Date;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/22  14:17
 * @Describe: 开户
 */
public class create_account {
    private String number;
    private String address;
    private Date accountDate;
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getAccountDate() {
        return accountDate;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public void setAccountDate(Date accountDate) {
        this.accountDate = accountDate;
    }
}
