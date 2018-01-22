package com.zhang.service.inpl;

import com.zhang.dao.UserInfoDao;
import com.zhang.entity.User;
import com.zhang.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by YJ on 2018/1/22.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public User queryUserInfo(String id) {
        return userInfoDao.queryUserInfo(id);
    }
}
