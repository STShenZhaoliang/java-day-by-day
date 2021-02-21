package cn.st.mapper;

import cn.st.domain.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @description:
 * @author: st
 * @create: 2021-02-20 16:24
 **/

public interface RoleMapper {

    @Select("SELECT * FROM sys_user_role ur,sys_role r WHERE ur.roleId=r.id AND ur.userId=#{uid}")
    public List<Role> findByUid(int uid);

}