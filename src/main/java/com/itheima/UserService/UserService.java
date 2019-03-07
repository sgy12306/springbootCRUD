package com.itheima.UserService;

import com.itheima.domain.User;

import java.util.List;

public interface UserService {

     List<User> findAll();

     User findUserByID(Long id);

     void DeleteUser(Long id);

     void insertUser(User user);
}
