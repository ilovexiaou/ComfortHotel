package com.elvis.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.opensymphony.xwork2.inject.Factory;

public class HibernateUtils {
    private static SessionFactory factory=null;
    static{
        try{
        //默认读取hibernate.cfg.xml
        Configuration cfg=new Configuration().configure();
        
        //建立sessionfactory
        factory=cfg.buildSessionFactory();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static Session getSession(){
        return factory.openSession();
    }
    
    public static void closeSession(Session session){
        if (session!=null) {
            if (session.isOpen()) {
                session.clear();
            }
        }
    }
    
    public static SessionFactory getSessionFactory(){
        return factory;
    }
}
