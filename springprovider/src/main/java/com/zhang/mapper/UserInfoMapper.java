package com.zhang.mapper;

import com.zhang.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * Created by YJ on 2018/1/22.
 */
@Component
public interface UserInfoMapper {

    @Select("select * from t_user where user_Id = #{userId}")
    public User queryUserInfoById(@Param("userId") int id);
}
