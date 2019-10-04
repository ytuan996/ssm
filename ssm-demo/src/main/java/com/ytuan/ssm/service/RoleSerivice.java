package com.ytuan.ssm.service;

import com.ytuan.ssm.pojo.Role;

/**
 * <p>
 * comment:
 * </p>
 *
 * @author: ytuan
 * @Date 2019-09-14 19:26
 */
public interface RoleSerivice {

    void insertRole(Role role);

    boolean deleteRoleByRoleId(String roleId);

    Role updateRole(Role role);
}
