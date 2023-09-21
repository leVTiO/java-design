package org.levtio.demo.design;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/21  15:21
 * @Describe: 饿汉模式，程序初始化时候加载
 */
public class Singleton_03 {
    private static Singleton_03 instance = new Singleton_03();
    private Singleton_03(){

    }
    public static Singleton_03 getInstance(){
        return instance;
    }
}
