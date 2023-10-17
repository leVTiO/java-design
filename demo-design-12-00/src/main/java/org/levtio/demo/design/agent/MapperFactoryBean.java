package org.levtio.demo.design.agent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author: LuoMingDong
 * @Date: 2023/10/17  15:41
 * @Describe:
 */
public class MapperFactoryBean<T> implements FactoryBean<T> {
    private Logger logger = LoggerFactory.getLogger(MapperFactoryBean.class);
    private Class<T> mapperInterface;
    public MapperFactoryBean(Class<T> mapperInterface){
        this.mapperInterface = mapperInterface;
    }
    @Override
    public T getObject() throws Exception {
        InvocationHandler handler = ((proxy, method, args) -> {
            Select select = method.getAnnotation(Select.class);
            logger.info("SQL:{}", select.value().replace("#{uId}", args[0].toString()));
            return args[0] + "levtio-levtio.top";
        });
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{mapperInterface}, handler);
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }

    @Override
    public Class<?> getObjectType() {
        return mapperInterface;
    }
}
