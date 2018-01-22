package com.zhang.dao.impl;

import com.zhang.dao.UserInfoDao;
import com.zhang.entity.User;
import com.zhang.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by YJ on 2018/1/22.
 */
@Component
public class UserInfoDaoImpl implements UserInfoDao {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public User queryUserInfo(String id) {
        int newid = Integer.valueOf(id);
        User user = userInfoMapper.queryUserInfoById(newid);
        return user;
    }
}
