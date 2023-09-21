package org.levtio.demo.design;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/21  14:44
 * @Describe:
 */
public class Singleton_02 {
    private static Singleton_02 instance;
    private Singleton_02(){

    }
    public synchronized static Singleton_02 getInstance(){
        if (instance != null) {
            return instance;
        }
        instance = new Singleton_02();
        return instance;
    }
}
