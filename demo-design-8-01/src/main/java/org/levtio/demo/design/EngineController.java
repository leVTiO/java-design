package org.levtio.demo.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/26  17:21
 * @Describe:
 */
public class EngineController {
    private Logger logger = LoggerFactory.getLogger(EngineController.class);
    public String process(final String userId, final String userSex, final int userAge){
        logger.info("ifelse实现方式判断用户结果。userId：{} userSex：{} userAge：{}", userId, userSex, userAge);
        if ("man".equals(userSex)){
           if (userAge < 25){
               return "man<25";
           }
           if (userAge >= 25){
               return "man>=25";
           }
        }
        if ("woman".equals(userSex)){
            if (userAge < 25){
                return "woman<25";
            }
            if (userAge >= 25){
                return "woman>=25";
            }
        }
        return null;
    }
}
