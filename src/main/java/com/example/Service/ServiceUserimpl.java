package com.example.Service;

import com.example.dao.UserMapper;
import com.example.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ServiceUserimpl implements ServiceUser{
    @Autowired
    private UserMapper userMapper;
    @Override
    public List <Users> selectAll() { return userMapper.selectAll();

    }
}
