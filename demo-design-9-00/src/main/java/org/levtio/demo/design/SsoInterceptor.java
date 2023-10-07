package org.levtio.demo.design;

/**
 * @Author: LuoMingDong
 * @Date: 2023/10/7  14:40
 * @Describe:
 */
public class SsoInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        String ticket = request.substring(1,8);
        return ticket.equals("success");
    }
}
