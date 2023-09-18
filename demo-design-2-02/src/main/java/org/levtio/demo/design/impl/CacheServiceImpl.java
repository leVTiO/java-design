package org.levtio.demo.design.impl;

import org.levtio.demo.design.CacheService;
import org.levtio.demo.design.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/18  16:47
 * @Describe:
 */
public class CacheServiceImpl implements CacheService {

    private RedisUtils redisUtils = new RedisUtils();
    @Override
    public String get(String key) {
        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        redisUtils.del(key);
    }
}
