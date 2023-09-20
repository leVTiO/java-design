package org.levtio.demo.design.test;

import org.junit.Test;
import org.levtio.demo.design.QuestionBankController;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/20  11:48
 * @Describe:
 */
public class ApiTest {
    @Test
    public void test_QuestionBank() throws CloneNotSupportedException {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("花花", "1000001921032"));
        System.out.println(questionBankController.createPaper("豆豆", "1000001921051"));
        System.out.println(questionBankController.createPaper("大宝", "1000001921987"));
    }
}
