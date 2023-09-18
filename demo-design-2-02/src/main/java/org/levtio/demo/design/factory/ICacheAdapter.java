package org.levtio.demo.design.factory;

import java.util.concurrent.TimeUnit;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/18  15:11
 */
public interface ICacheAdapter {
    String get(String key);
    void set(String key, String value);
    void set(String key, String value, long timeout, TimeUnit timeUnit);
    void del(String key);
}
