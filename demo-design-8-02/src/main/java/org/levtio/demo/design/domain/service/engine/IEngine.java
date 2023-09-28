package org.levtio.demo.design.domain.service.engine;

import org.levtio.demo.design.domain.model.aggregates.TreeRich;
import org.levtio.demo.design.domain.model.vo.EngineResult;

import java.util.Map;

/**
 * @Author: LuoMingDong
 * @Date: 2023/9/27  9:53
 * @Describe:
 */
public interface IEngine {
    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);
}
