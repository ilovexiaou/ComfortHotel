package com.elvis.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.elvis.dao.UserDao;
import com.elvis.domain.User;
import com.elvis.utils.HibernateUtils;

public class ElvisUserDaoImpl implements UserDao {

    @Override
    public void add(User user) {
        Session session=HibernateUtils.getSession();
        Transaction tx=null;
        try {
            tx= session.beginTransaction(); //开启事务
            //保存
            session.save(user);
            tx.commit();//提交事务
        } catch (RuntimeException e) {
            tx.rollback();
            throw e;
        }finally{
            HibernateUtils.closeSession(session);
        }
                                            
    }

    @Override
    public void delete(String id) {
        Session session=HibernateUtils.getSession();
        Transaction tx=null;
        try {
            tx= session.beginTransaction(); //开启事务
            //删除
            User user=(User) getById(id); //先查询到要删除的user
            session.delete(user);
            
            
            tx.commit();//提交事务
        } catch (RuntimeException e) {
            tx.rollback();
            throw e;
        }finally{
            HibernateUtils.closeSession(session);
        }
        
    }

    @Override
    public void update(User user) {
        Session session=HibernateUtils.getSession();
        Transaction tx=null;
        try {
            tx= session.beginTransaction(); //开启事务
            //更新
            session.update(user);
            
            tx.commit();//提交事务
        } catch (RuntimeException e) {
            tx.rollback();
            throw e;
        }finally{
            HibernateUtils.closeSession(session);
        }
        
    }

    @Override
    public User getById(String id) {
        Session session=HibernateUtils.getSession();
        Transaction tx=null;
        try {
            tx= session.beginTransaction(); //开启事务
            //查询 by id
            User user=(User) session.get(User.class, id);
            
            tx.commit();//提交事务
            return user;
        } catch (RuntimeException e) {
            tx.rollback();
            throw e;
        }finally{
            HibernateUtils.closeSession(session);
        }
        
        
    }

    @Override
    public List<User> findAll() {
        Session session=HibernateUtils.getSession();
        Transaction tx=null;
        try {
            tx= session.beginTransaction(); //开启事务
            //查找全部
            List<User> list=session.createQuery("from User").list();
            
            tx.commit();//提交事务
            return list;
        } catch (RuntimeException e) {
            tx.rollback();
            throw e;
        }finally{
            HibernateUtils.closeSession(session);
        }
        
        
    }

    @Override
    public List<User> findAll(int first, int max) {
        Session session=HibernateUtils.getSession();
        Transaction tx=null;
        try {
            tx= session.beginTransaction(); //开启事务
            //分页查找
            List<User> list=session.createQuery("from User")
                    .setFirstResult(first)
                    .setMaxResults(max)
                    .list();
            
            tx.commit();//提交事务
            return list;
        } catch (RuntimeException e) {
            tx.rollback();
            throw e;
        }finally{
            HibernateUtils.closeSession(session);
        }
        
    }

}
