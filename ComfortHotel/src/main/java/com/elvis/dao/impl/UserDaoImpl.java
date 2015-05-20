package com.elvis.dao.impl;

import java.util.List;

import com.elvis.domain.User;

public class UserDaoImpl extends BaseDaoImpl {
    
    //判断数据库中是否有该用户
    public User isValidAdmin(String username, String password) {
        User user = null;
        //调用hibernate
        List<User> list =super.search("FROM User WHERE  username ='"+username+"' AND password = '"+password+"'");
        if(list!=null && list.size()>0){//若找到的list不为空那么则说明数据库中包含这个人
            user = list.get(0);
        }
        return user;
    }
}
