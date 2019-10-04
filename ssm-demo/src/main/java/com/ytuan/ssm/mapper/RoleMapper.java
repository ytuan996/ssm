package com.ytuan.ssm.mapper;

import com.ytuan.ssm.pojo.Role;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * comment:
 * </p>
 *
 * @author: ytuan
 * @Date 2019-09-14 19:25
 */
@Repository
public interface RoleMapper {

    void insertRole(Role role);

    boolean deleteRoleByRoleId(String roleId);

    Role updateRole(Role role);
}
