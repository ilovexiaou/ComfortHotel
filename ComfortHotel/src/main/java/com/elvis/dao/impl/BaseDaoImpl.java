package com.elvis.dao.impl;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.elvis.utils.HibernateUtils;

public class BaseDaoImpl  {

    //private  SessionFactory sessionFactory;
    private  Session session;
    //private  Transaction transaction;

//从数据库中取数据存入alist  
    public List search(String hql) {
          
        session = HibernateUtils.getSession();
        List alist = null;
        alist = session.createQuery(hql).list();//从数据库中查询
        session.close();
        return alist;
    }

}
