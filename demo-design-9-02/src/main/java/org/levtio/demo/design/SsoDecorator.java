package org.levtio.demo.design;

/**
 * @Author: LuoMingDong
 * @Date: 2023/10/7  15:15
 * @Describe:
 */
public class SsoDecorator implements HandlerInterceptor{

    private HandlerInterceptor handlerInterceptor;
    private SsoDecorator(){}
    public SsoDecorator(HandlerInterceptor handlerInterceptor){
        this.handlerInterceptor = handlerInterceptor;
    }
    @Override
    public boolean preHandle(String request, String response, Object handler) {
        return handlerInterceptor.preHandle(request,response,handler);
    }
}
