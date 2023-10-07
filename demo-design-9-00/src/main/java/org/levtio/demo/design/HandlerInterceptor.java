package org.levtio.demo.design;

/**
 * @Author: LuoMingDong
 * @Date: 2023/10/7  14:37
 * @Describe:
 */
public interface HandlerInterceptor {
    boolean preHandle(String request, String response, Object handler);
}
