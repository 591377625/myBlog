package com.cheng.myblog.mapper;

import com.cheng.myblog.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    void addUser(User user);

    User selectByName(String username);

    User selectById(Integer userId);
}
