package com.elvis.text;

import java.util.List;

import org.hibernate.cache.spi.QueryResultsRegion;

import com.elvis.dao.impl.ElvisUserDaoImpl;
import com.elvis.domain.User;

import junit.framework.TestCase;

public class ElvisUserDaoImplTest extends TestCase {

    public void testAdd() {
        User user=new User();
        user.setUsername("shazi2");
        ElvisUserDaoImpl el=new ElvisUserDaoImpl();
        el.add(user);
    }

    public void testDelete() {
        ElvisUserDaoImpl el=new ElvisUserDaoImpl();
        el.delete("8ae585e94d9d73ab014d9d73ac5a0000");
    }

    public void testUpdate() {
        ElvisUserDaoImpl el=new ElvisUserDaoImpl();
        User user=el.getById("8ae585e94d9d73ab014d9d73ac5a0000");
        user.setUsername("nicaishishazi");
        el.update(user);      
    }
    
    public void testGetById() {
        ElvisUserDaoImpl el=new ElvisUserDaoImpl();
        User user=el.getById("8ae585e94d9d73ab014d9d73ac5a0000");
        System.out.println(user.getUsername());
    }


    public void testFindAll() {
        ElvisUserDaoImpl el=new ElvisUserDaoImpl();
        List<User> list=el.findAll();
        for(User user: list){
            System.out.println(user.getUsername());
        }
        
    }

    public void testFindAllIntInt() {
        ElvisUserDaoImpl el=new ElvisUserDaoImpl();
        //List<User> list=el.findAll(0,3);
        List<User> list=el.findAll(3,3);
        for(User user: list){
            System.out.println(user.getUsername());
        }
    }

}
