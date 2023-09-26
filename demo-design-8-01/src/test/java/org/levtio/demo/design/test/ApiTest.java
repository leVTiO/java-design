package org.levtio.demo.design.test;

import org.junit.Test;
import org.levtio.demo.design.EngineController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/26  17:36
 * @Describe:
 */
public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_EngineController() {
        EngineController engineController = new EngineController();
        String process = engineController.process("levtio", "man", 21);
        logger.info("测试结果：{}", process);
    }
}
