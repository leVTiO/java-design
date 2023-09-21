package org.levtio.demo.design;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/21  15:21
 * @Describe: 首推
 */
public class Singleton_04 {
    private static class SingletonHolder{
        private static  Singleton_04 instance = new Singleton_04();
    }
    private Singleton_04(){

    }
    private static Singleton_04 getInstance(){
        return SingletonHolder.instance;
    }
}
