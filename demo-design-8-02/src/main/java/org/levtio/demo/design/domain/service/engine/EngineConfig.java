package org.levtio.demo.design.domain.service.engine;

import org.levtio.demo.design.domain.service.logic.LogicFilter;
import org.levtio.demo.design.domain.service.logic.impl.UserAgeFilter;
import org.levtio.demo.design.domain.service.logic.impl.UserGenderFilter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/27  9:59
 * @Describe:
 */
public class EngineConfig {
    static Map<String, LogicFilter> logicFilterMap;
    static {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("userAge", new UserAgeFilter());
        logicFilterMap.put("userGender", new UserGenderFilter());
    }
    public Map<String, LogicFilter> getLogicFilterMap(){
        return logicFilterMap;
    }
    public void setLogicFilterMap(Map<String, LogicFilter> logicFilterMap) {
        EngineConfig.logicFilterMap = logicFilterMap;
    }
}
