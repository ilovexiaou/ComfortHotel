package com.elvis.domain;

import java.util.Date;

public class Reservation {
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
    
    
}
