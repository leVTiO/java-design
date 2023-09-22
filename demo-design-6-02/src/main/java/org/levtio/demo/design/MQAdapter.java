package org.levtio.demo.design;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/22  15:07
 * @Describe:
 */
public class MQAdapter {
//    // 这个方法接受一个JSON字符串和一个映射关系的Map作为参数。它使用 JSON.parseObject 方法将JSON字符串解析为一个Map对象，并将该Map对象和映射关系传递给下一个 filter 方法进行处理。
//    public static RebateInfo filter(String strJson, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        return filter(JSON.parseObject(strJson, Map.class), link);
//    }
//
//    //这个方法接受一个Map对象和一个映射关系的Map作为参数。它创建一个 RebateInfo 对象，并根据映射关系设置 RebateInfo 对象的属性。它通过反射调用 RebateInfo 类的相应的setter方法来设置属性值。
//    public static RebateInfo filter(Map obj, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        RebateInfo rebateInfo = new RebateInfo();
//        for (String key : link.keySet()) {
//            Object val = obj.get(link.get(key));
//            RebateInfo.class.getMethod("set" + key.substring(0, 1).toUpperCase() + key.substring(1), String.class).invoke(rebateInfo, val.toString());
//        }
//        return rebateInfo;
//    }

    public static RebateInfo filter(String strJson, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return filter(JSON.parseObject(strJson, Map.class), link);
    }

    public static RebateInfo filter(Map obj, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        RebateInfo rebateInfo = new RebateInfo();
        for (String key : link.keySet()) {
            Object val = obj.get(link.get(key));
            RebateInfo.class.getMethod("set" + key.substring(0, 1).toUpperCase() + key.substring(1), String.class).invoke(rebateInfo, val.toString());
        }
        return rebateInfo;
    }

}
