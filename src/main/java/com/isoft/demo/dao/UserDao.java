package com.isoft.demo.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.isoft.demo.entity.User;
import com.isoft.demo.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao{
    @Autowired
    UserMapper userMapper;
    QueryWrapper<User> queryWrapper = new QueryWrapper<>() ;
    public int getPassCounts(@Param("userId") Integer userId, @Param("userPass") String userPass){
        queryWrapper.eq("userId" , userId) ;
        queryWrapper.eq("userPass", userPass) ;
        User u =userMapper.selectOne(queryWrapper) ;
        return u == null  ? 0 : 1 ;
    }
    public int update(User user){
        int i = userMapper.update(user);
        return i < 1  ? 0 : 1 ;
    }

}
