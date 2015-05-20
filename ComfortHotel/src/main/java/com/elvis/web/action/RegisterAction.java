package com.elvis.web.action;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.elvis.domain.User;
import com.elvis.utils.HibernateUtils;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class RegisterAction implements Action,ModelDriven<User> {
    
    private User user=new User();
    
    @Override
    public String execute() throws Exception {
        // TODO Auto-generated method stub
        
        
        Session session=null;
        try {
            session=HibernateUtils.getSession();
            Transaction tx=session.beginTransaction();
            //transaction状态
       
            user.setUsername(user.getUsername());
            user.setPassword(user.getPassword());
            
       
            
            //persistent状态
            session.save(user);
            tx.commit();
            return "success";
        } catch (Exception e) {
            e.printStackTrace(); 
            
                       
        }finally{
            HibernateUtils.closeSession(session);
        }
        
        return "error";
    }

    @Override
    public User getModel() {
       
        return user;
    }

   
}
