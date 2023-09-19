package org.levtio.demo.design.test;

import org.junit.Test;
import org.levtio.demo.design.Builder;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/19  11:50
 * @Describe:
 */
public class ApiTest {
    @Test
    public void test_Builder(){
        Builder builder = new Builder();

        // 豪华欧式
        System.out.println(builder.levelOne(132.52D).getDetail());

        // 轻奢田园
        System.out.println(builder.levelTwo(98.25D).getDetail());

        // 现代简约
        System.out.println(builder.levelThree(85.43D).getDetail());
    }
}
