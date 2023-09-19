package org.levtio.demo.design.test;

import org.junit.Test;
import org.levtio.demo.design.DecorationPackageController;

import java.math.BigDecimal;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/19  11:17
 * @Describe:
 */
public class ApiTest {

    @Test
    public void test_DecorationPackageController(){
        DecorationPackageController decoration = new DecorationPackageController();

        // 豪华欧式
        System.out.println(decoration.getMatterList(new BigDecimal("132.52"),1));

        // 轻奢田园
        System.out.println(decoration.getMatterList(new BigDecimal("98.25"),2));

        // 现代简约
        System.out.println(decoration.getMatterList(new BigDecimal("85.43"),3));
    }
}
