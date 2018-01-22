package com.zhang.service;

import com.zhang.entity.User;

/**
 * Created by YJ on 2018/1/22.
 */
public interface UserInfoService {

    /**
     * 查询用户信息
     * @param id
     * @return
     */
    public User queryUserInfo(String id);
}
