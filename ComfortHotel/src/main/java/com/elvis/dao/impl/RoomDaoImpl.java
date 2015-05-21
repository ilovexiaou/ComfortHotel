package com.elvis.dao.impl;

import java.util.List;

import com.elvis.domain.Room;

public class RoomDaoImpl extends BaseDaoImpl {

    //查询数据库符合要求的房间集合
    public Room isOrderRoom(String id){
        
        Room room=null;
        String hql="FROM Room WHERE id= '"+id+"'";
        List<Room> list=super.search(hql);
        if (list!=null && list.size()>0) {           
                room=list.get(0);

        }
        
        return room;
    }
}
