package com.elvis.dao;

import java.util.List;

import com.elvis.domain.User;

public interface UserDao {
    //增
    public void add(User user); 
    //删
    public void delete(String id);
    //改
    public void update(User user);
    //查 by id
    public User getById(String id);
    //查 全部
    public List<User> findAll();
    //查 分页
    public List<User> findAll(int min,int max);
}
