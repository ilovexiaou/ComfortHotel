package com.elvis.web.action;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import com.elvis.dao.impl.RoomDaoImpl;
import com.elvis.domain.Room;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RoomAction extends ActionSupport implements SessionAware {

    RoomDaoImpl dao = new RoomDaoImpl();   
    private Map<String,Object> session;
    private String id;
    
    private String roomname;
    private String roomgrade;
    private String roomtype;
    private String roomprice;
    private String discount;
    
    public List list = new LinkedList();
        
    //HttpServletRequest hsr = ServletActionContext.getRequest();
    //roomname = hsr.getParameter("mySelect");
    
    public String execute(){
        Room room=dao.isOrderRoom(id); //把roomname传递到dao层给hibernate判断 返回一个符合要求的list<Room>集合
        if (room!=null) {
            session.put("room",room);
            return "success";
        }else {
            return "error";
        }
        
    }
    
    
    @Override
    public void setSession(Map<String, Object> session) {
        // TODO Auto-generated method stub
        this.session = session;
    }

    public Map<String, Object> getSession() {
        return session;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getRoomname() {
        return roomname;
    }


    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }


    public String getRoomgrade() {
        return roomgrade;
    }


    public void setRoomgrade(String roomgrade) {
        this.roomgrade = roomgrade;
    }


    public String getRoomtype() {
        return roomtype;
    }


    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }


    public String getRoomprice() {
        return roomprice;
    }


    public void setRoomprice(String roomprice) {
        this.roomprice = roomprice;
    }


    public String getDiscount() {
        return discount;
    }


    public void setDiscount(String discount) {
        this.discount = discount;
    }


    public List getList() {
        return list;
    }


    public void setList(List list) {
        this.list = list;
    }


    
}
