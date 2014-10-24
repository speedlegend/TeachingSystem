package com.nju.teachingsystem.impl;

import com.nju.teachingsystem.api.UserService;
import com.nju.teachingsystem.dao.UserDAO;
import com.nju.teachingsystem.model.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by xiaoqiang.zhu on 2014/10/24.
 */
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO;

    @Override
    public User getUserById(int userId) {
        User user = new User();
        user.setUid(userId);
        user = userDAO.queryUserByUid(userId);
        return user;
    }
}
