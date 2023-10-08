package org.levtio.demo.design;

import org.levtio.demo.design.domian.UserInfo;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: LuoMingDong
 * @Date: 2023/10/8  10:25
 * @Describe:
 */
public class HelloWorldController {

    public UserInfo queryUserInfo(@RequestParam String userId) {

        // 做白名单拦截
        List<String> userList = new ArrayList<String>();
        userList.add("1001");
        userList.add("levtio");
        userList.add("juis");
        if (!userList.contains(userId)) {
            return new UserInfo("1111", "非白名单可访问用户拦截！");
        }

        return new UserInfo("eric:" + userId, 22, "天津市南开区南开大学");
    }

}
