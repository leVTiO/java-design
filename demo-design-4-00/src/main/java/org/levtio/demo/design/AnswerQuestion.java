package org.levtio.demo.design;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/20  9:42
 * @Describe: 解答题
 */
public class AnswerQuestion {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    private String key;

    public AnswerQuestion() {
    }

    public AnswerQuestion(String name, String key) {
        this.name = name;
        this.key = key;
    }
}
