package org.levtio.demo.design.test;

import org.junit.Test;
import org.levtio.demo.design.LoginSsoDecorator;

/**
 * @Author: LuoMingDong
 * @Date: 2023/10/7  14:50
 * @Describe:
 */
public class ApiTest {
    @Test
    public void test_LoginSsoDecorator() {
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator();
        String request = "1successlevtio";
        boolean success = ssoDecorator.preHandle(request, "loginsuccess", "t");
        System.out.println("登录校验：" + request + (success ? " 放行" : " 拦截"));
    }
}
