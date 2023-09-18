package org.levtio.demo.design.factory.impl;

import org.levtio.demo.design.factory.ICacheAdapter;
import org.levtio.demo.design.matter.IIR;

import java.util.concurrent.TimeUnit;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/18  16:24
 */
public class IIRCacheAdapter implements ICacheAdapter {

    private IIR iir = new IIR();
    @Override
    public String get(String key) {
        return iir.get(key);
    }

    @Override
    public void set(String key, String value) {
        iir.set(key,value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        iir.del(key);
    }
}
