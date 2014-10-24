package com.nju.teachingsystem.controller;

import com.nju.teachingsystem.api.UserService;
import com.nju.teachingsystem.model.ServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by xiaoqiang.zhu on 2014/10/24.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getName", method = RequestMethod.GET)
    @ResponseBody
    public ServiceResult getUserName(HttpServletRequest request, @RequestParam("userId")int userId) {
        ServiceResult serviceResult = new ServiceResult();
        serviceResult.setMsg(userService.getUserById(userId));
        return serviceResult;
    }
}
