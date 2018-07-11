package com.wang.test.dao;

import com.wang.test.entities.User;

import java.util.List;

public interface UserDao {
    int insert(User user);
    int batchInsert(List<User>userList);

    int update(User user);

    int delete(int id);

    User selectById(int id);

    List<User> selectAll();


}
