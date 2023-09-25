package org.levtio.demo.design;

import org.junit.Test;
import org.levtio.demo.design.channel.Pay;
import org.levtio.demo.design.channel.WxPay;
import org.levtio.demo.design.channel.ZfbPay;
import org.levtio.demo.design.mode.PayFaceMode;
import org.levtio.demo.design.mode.PayFingerprintMode;

import java.math.BigDecimal;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/25  17:51
 * @Describe:
 */
public class ApiTest {
    @Test
    public void test_pay() {

        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("weixin_1092033111", "100000109893", new BigDecimal(100));

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        Pay zfbPay = new ZfbPay(new PayFingerprintMode());
        zfbPay.transfer("jlu19dlxo111","100000109894",new BigDecimal(100));

    }
}
