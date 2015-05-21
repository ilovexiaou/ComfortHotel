package com.elvis.text;

import com.elvis.dao.impl.RoomDaoImpl;
import com.elvis.domain.Room;

public class RoomText2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        RoomDaoImpl dao=new RoomDaoImpl();
        
        Room room=null;
        
        room=dao.isOrderRoom("king");
        
        System.out.println(room.getRoomname());
        System.out.println(room.getRoomprice());
        System.out.println(room.getRoomgrade());
        System.out.println(room.getId());
    }

}
