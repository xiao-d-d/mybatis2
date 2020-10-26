package com.mybatis.mi.mapper;

import com.mybatis.mi.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int insert(@Param("user") User user);
    int update(@Param("user") User user);
    User selectById(@Param("userId") int id,@Param("username") String name);
}
