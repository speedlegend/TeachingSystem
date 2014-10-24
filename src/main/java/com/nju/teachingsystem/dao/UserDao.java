package com.nju.teachingsystem.dao;

import com.nju.teachingsystem.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by xiaoqiang.zhu on 2014/10/21.
 */
public interface UserDAO {
    User queryUserByUid (@Param("uid")int uid);
}
