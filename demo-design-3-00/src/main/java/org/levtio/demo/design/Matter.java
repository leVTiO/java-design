package org.levtio.demo.design;

import java.math.BigDecimal;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/19  10:22
 * @Describe: 物料接口，提供所有基本信息
 */
public interface Matter {

    /**
     * 场景；地板、地砖、涂料、吊顶
     */
    String scene();

    /**
     * 品牌
     */
    String brand();

    /**
     * 型号
     */
    String model();

    /**
     * 平米报价
     */
    BigDecimal price();

    /**
     * 描述
     */
    String desc();
}
