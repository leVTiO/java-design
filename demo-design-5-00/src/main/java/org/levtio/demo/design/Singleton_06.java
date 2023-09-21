package org.levtio.demo.design;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/21  15:22
 * @Describe:
 */
public class Singleton_06 {
    private static final AtomicReference<Singleton_06> INSTANCE = new
            AtomicReference<Singleton_06>();
    private static Singleton_06 instance;
    private Singleton_06() {
    }
    public static final Singleton_06 getInstance() {
        for (; ; ) {
            Singleton_06 instance = INSTANCE.get();
            if (null != instance) {
                return instance;
            }
            INSTANCE.compareAndSet(null, new Singleton_06());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        System.out.println(Singleton_06.getInstance());
        System.out.println(Singleton_06.getInstance());

        // 运行结果相同 org.levtio.demo.design.Singleton_06@2503dbd3
        //            org.levtio.demo.design.Singleton_06@2503dbd3

    }
}
