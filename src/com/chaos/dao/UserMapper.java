package com.chaos.dao;

import com.chaos.model.User;
import java.util.List;

public interface UserMapper {
    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();
}