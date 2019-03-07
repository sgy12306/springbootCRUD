package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select id,user_name,password,name from user where id=#{id} limit 1")
    User findUserByID(Long id);
    @Delete("delete from user where id=#{id}")
    void DeleteUser(Long id);
    @Insert("insert into user(user_name,password,name)values(#{user_name},#{password},#{name})")
    void insertUser(User user);

}
