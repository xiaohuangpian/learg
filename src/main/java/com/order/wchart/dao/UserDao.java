package com.order.wchart.dao;

import com.order.wchart.entity.User;

import java.util.List;

public interface UserDao {
    /**
     *
     * */
    List<User> getUserList();
    /**
     *
     * */
    User getUserById(String id);
    /**
     *
     * */
    String insertUser(User user);
    /**
     *
     * */
    String updateUser(User user);
    /**
     *
     * */
    String deleteUser(String id);
}
