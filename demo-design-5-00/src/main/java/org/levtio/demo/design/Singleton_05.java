package org.levtio.demo.design;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/21  15:21
 * @Describe:
 */
public class Singleton_05 {
    private static Singleton_05 instance;
    private Singleton_05(){}
    public static Singleton_05 getInstance(){
        if (instance != null){
            return instance;
        }
        synchronized (Singleton_05.class){
            if (instance == null){
                instance = new Singleton_05();
            }
        }
        return instance;
    }
}
