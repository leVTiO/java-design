package org.levtio.demo.design;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/21  13:57
 * @Describe: 懒汉模式（线程不安全）
 */
public class Singleton_01 {
    private static Singleton_01 instance;
    private Singleton_01(){

    }
    public static Singleton_01 getInstance(){
        if (instance != null) {
            return instance;
        }
        instance = new Singleton_01();
        return instance;
    }
}
