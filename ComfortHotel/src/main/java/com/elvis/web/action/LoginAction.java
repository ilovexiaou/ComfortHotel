package com.elvis.web.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.elvis.dao.impl.UserDaoImpl;
import com.elvis.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements SessionAware {

    UserDaoImpl dao = new UserDaoImpl();
    
    private String username;
    private String password;
    private Map<String,Object> session;
    
    public String execute(){
            User user = dao.isValidAdmin(username, password);//将username和password传递到dao层交个hibernate判断
            if(user!=null){
                session.put("user", user);//若登陆成功则将该user记录在session中
                return "success";
            }else{
                addActionError("你没有管理权限");
                return "error";
            }
    }
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, Object> getSession() {
        return session;
    }
    
    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
        
    }
   

}
