package com.itheima.UserService.Impl;

import com.itheima.UserService.UserService;
import com.itheima.dao.UserDao;
import com.itheima.dao.UserMapper;
import com.itheima.domain.User;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserMapper userMapper;
    @Override
    //@Cacheable(value ="user")  此时连接redis
    public List<User> findAll() {

        return userDao.findAll();
    }

        //redis全部删除，如果只删除一个呢？
    @CacheEvict(value ="user",allEntries = true)
    public User findUserByID(Long id) {
        return userMapper.findUserByID(id);
    }

    @Override
    public void DeleteUser(Long id) {
        //int i = 1 / 0;
        userMapper.DeleteUser(id);
    }

    @Override
    public void insertUser(User user) {
        //int i = 1 / 0;
        userMapper.insertUser(user);

    }


}
