package com.itheima.Controller;

import com.itheima.UserService.UserService;
import com.itheima.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/findUser")
    public List<User> findUser() {
       return userService.findAll();
    }
    @RequestMapping("/findOne/{id}")
    public User findOne(@PathVariable("id") Long id) {
        return userService.findUserByID(id);
    }
    @RequestMapping("/DeleteUser/{id}")
    public void DeleteUser(@PathVariable("id") Long id) {
         userService.DeleteUser(id);
    }
    @RequestMapping("/insertUser")
    public void insertUser(@RequestBody User user) {
        userService.insertUser(user);
    }
}
