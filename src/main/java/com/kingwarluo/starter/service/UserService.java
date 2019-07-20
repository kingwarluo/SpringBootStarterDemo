package com.kingwarluo.starter.service;

import com.kingwarluo.starter.domain.User;
import com.kingwarluo.starter.mapper.UserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getById(Long id) {
        return userMapper.get(id);
    }

}
