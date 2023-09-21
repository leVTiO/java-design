package org.levtio.demo.design;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/21  13:54
 * @Describe: 静态类使用
 */
public class Singleton_00 {
    public static Map<String,String> cache = new ConcurrentHashMap<>();
}
