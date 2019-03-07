package com.iteheima;

import com.itheima.Runnner;
import com.itheima.UserService.UserService;
import com.itheima.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Runnner.class)
public class SpringbootTest {
    @Autowired
    private UserService userService;
    @Test
    public void test() {
        List<User> userList = userService.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }
    @Value("${spring.name}")
    private String str;
    @Test
    public void testyml() {
        System.out.println(str);
    }
}
