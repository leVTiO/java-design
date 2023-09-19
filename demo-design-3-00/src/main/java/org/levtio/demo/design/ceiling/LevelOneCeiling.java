package org.levtio.demo.design.ceiling;

import org.levtio.demo.design.Matter;

import java.math.BigDecimal;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/19  10:34
 * @Describe:
 * 吊顶
 * 品牌；装修公司自带
 * 型号：一级顶
 */
public class LevelOneCeiling implements Matter {
    @Override
    public String scene() {
        return "吊顶";
    }

    @Override
    public String brand() {
        return "装修公司自带";
    }

    @Override
    public String model() {
        return "一级顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(260);
    }

    @Override
    public String desc() {
        return "造型只做第一级，只有一个层次的吊顶，一般离顶120-150mm";
    }
}
