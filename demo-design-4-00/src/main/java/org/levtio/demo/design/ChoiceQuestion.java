package org.levtio.demo.design;

import java.util.Map;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/20  9:40
 * @Describe: 单选题
 */
public class ChoiceQuestion {
    private String name;
    private Map<String, String> option;
    private String key;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getOption() {
        return option;
    }

    public void setOption(Map<String, String> option) {
        this.option = option;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ChoiceQuestion() {
    }

    public ChoiceQuestion(String name, Map<String, String> option, String key) {
        this.name = name;
        this.option = option;
        this.key = key;
    }
}
