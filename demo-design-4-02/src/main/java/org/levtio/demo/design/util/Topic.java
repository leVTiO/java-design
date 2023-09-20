package org.levtio.demo.design.util;

import java.util.Map;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/20  11:10
 * @Describe:
 */
public class Topic {
    private Map<String, String> option;
    private String key;

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

    public Topic() {
    }

    public Topic(Map<String, String> option, String key) {
        this.option = option;
        this.key = key;
    }
}
