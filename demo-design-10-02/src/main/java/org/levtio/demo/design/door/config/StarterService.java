package org.levtio.demo.design.door.config;

/**
 * @Author: LuoMingDong
 * @Date: 2023/10/8  10:41
 * @Describe:
 */
public class StarterService {
    private String userStr;
    public StarterService(String userStr){
        this.userStr = userStr;
    }
    public String[] split(String separatorChar){
        return this.userStr.split(separatorChar);
    }
}
