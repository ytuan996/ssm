package com.ytuan.ssm.service.impl;

import com.ytuan.ssm.mapper.RoleMapper;
import com.ytuan.ssm.pojo.Role;
import com.ytuan.ssm.service.RoleSerivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * comment:
 * </p>
 *
 * @author: ytuan
 * @Date 2019-09-14 19:27
 */
@Service
public class RoleSeriviceImpl implements RoleSerivice {

    @Autowired
    private RoleMapper roleMapper;

    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.NESTED)
    @Override
    public void insertRole(Role role) {

    }

    @Override
    public boolean deleteRoleByRoleId(String roleId) {
        return false;
    }

    @Override
    public Role updateRole(Role role) {
        return null;
    }
}
