package org.levtio.demo.design.factory.impl;

import org.levtio.demo.design.factory.ICacheAdapter;
import org.levtio.demo.design.matter.EGM;

import java.util.concurrent.TimeUnit;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/18  15:21
 */
public class EGMCacheAdapter implements ICacheAdapter {

    private EGM egm = new EGM();

    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    @Override
    public void set(String key, String value) {
        egm.set(key,value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key,value,timeout,timeUnit);
    }

    @Override
    public void del(String key) {
        egm.delete(key);
    }
}
