package com.elvis.web.action;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.elvis.domain.Reservation;
import com.elvis.domain.Room;
import com.elvis.domain.User;
import com.elvis.utils.DateUtils;
import com.elvis.utils.HibernateUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import freemarker.template.utility.DateUtil;

public class ReservationAction extends ActionSupport {
     
  //test这个没办法 先放着试试吧
    private String id;
    private String roomid;
    private String userid;
    private Date createtime;
    private Date checkintime;
    private Date checkouttime;
    private String finalcost;
    private String roomprice;
    
    public String getRoomprice() {
        return roomprice;
    }
    public void setRoomprice(String roomprice) {
        this.roomprice = roomprice;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getRoomid() {
        return roomid;
    }
    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public Date getCreatetime() {
        return createtime;
    }
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
    public Date getCheckintime() {
        return checkintime;
    }
    public void setCheckintime(Date checkintime) {
        this.checkintime = checkintime;
    }
    public Date getCheckouttime() {
        return checkouttime;
    }
    public void setCheckouttime(Date checkouttime) {
        this.checkouttime = checkouttime;
    }
    public String getFinalcost() {
        return finalcost;
    }
    public void setFinalcost(String finalcost) {
        this.finalcost = finalcost;
    }
    

    private Reservation res=new Reservation();
    
    
    public String execute() {
        Session session=null;
        try {
            session=HibernateUtils.getSession();
            Transaction tx=session.beginTransaction();
            //transaction状态
          
            int day=DateUtils.daysBetween(checkintime,checkouttime);
            int roompriceint=Integer.parseInt(roomprice);
            finalcost=roompriceint*day+"";
                    
            res.setCheckintime(checkintime);
            res.setCheckouttime(checkouttime);
            res.setCreatetime(new Date());
            res.setRoomid(roomid);
            res.setFinalcost(finalcost);
            res.setUserid(userid);
            res.setRoomprice(roomprice);
            
            //persistent状态
            session.save(res);
            tx.commit();
            return "success";
        } catch (Exception e) {
            e.printStackTrace(); 
            
                       
        }finally{
            HibernateUtils.closeSession(session);
        }
        
        return "error";
    }
     
    
    Session session  =HibernateUtils.getSession();
   


  
}
