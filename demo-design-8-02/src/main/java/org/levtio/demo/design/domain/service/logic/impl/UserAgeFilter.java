package org.levtio.demo.design.domain.service.logic.impl;

import org.levtio.demo.design.domain.service.logic.BaseLogic;

import java.util.Map;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/27  9:50
 * @Describe:
 */
public class UserAgeFilter extends BaseLogic {
    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("age");
    }
}
