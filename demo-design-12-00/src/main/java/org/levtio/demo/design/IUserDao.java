package org.levtio.demo.design;

import org.levtio.demo.design.agent.Select;

/**
 * @Author: LuoMingDong
 * @Date: 2023/10/17  15:25
 * @Describe:
 */
public interface IUserDao {
    @Select("select userName form user where id = #{uId}")
    String queryUserInfo(String uId);
}
