package com.example.dao;

import com.example.domain.Users;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select( "select * from users" )
    public List<Users> selectAll();
}
