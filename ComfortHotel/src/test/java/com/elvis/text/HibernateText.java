package com.elvis.text;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.elvis.domain.User;


public class HibernateText {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //默认读取hibernate.cfg.xml
        Configuration cfg=new Configuration().configure();
        
        //建立sessionfactory
        SessionFactory factory=cfg.buildSessionFactory();
        
        //取得session
        Session session=null;
        
        try {
            session=factory.openSession();
            //开启事务
            session.beginTransaction();
            User user=new User();
            user.setUsername("胡说");
            user.setPassword("123");
            
            //保存对象 
            session.save(user);
            //提交事务
            session.getTransaction().commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            //回滚事务
            session.getTransaction().rollback();            
        }finally{
            if (session!=null) {
                if (session.isOpen()) {
                    session.close();
                }
            }
        }
        
        
        

    }

}
