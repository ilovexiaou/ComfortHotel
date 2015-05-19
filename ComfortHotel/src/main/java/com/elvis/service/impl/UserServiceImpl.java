package com.elvis.service.impl;

import com.elvis.dao.UserDao;
import com.elvis.domain.User;
import com.elvis.service.UserService;

public class UserServiceImpl implements UserService {
    
    private UserDao userDao;
    
    @Override
    public void add(User user) {
        // TODO Auto-generated method stub
        userDao.add(user);
    }
    
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
}
