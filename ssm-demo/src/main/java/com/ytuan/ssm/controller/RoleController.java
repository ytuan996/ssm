package com.ytuan.ssm.controller;

import com.ytuan.ssm.pojo.Role;
import com.ytuan.ssm.service.RoleSerivice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * comment:
 * </p>
 *
 * @author: ytuan
 * @Date 2019-09-14 19:29
 */
@Controller
@RequestMapping(value = "/role")
public class RoleController {

    private RoleSerivice roleSerivice;

    @RequestMapping(value = "/addRole")
    public void addRole(Role role) {
        roleSerivice.insertRole(role);
    }
}
