package org.levtio.demo.design.door.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: LuoMingDong
 * @Date: 2023/10/8  10:44
 * @Describe:
 */
@ConfigurationProperties("levtio.door")
public class StarterServiceProperties {
    private String userStr;

    public String getUserStr() {
        return userStr;
    }

    public void setUserStr(String userStr) {
        this.userStr = userStr;
    }

}
