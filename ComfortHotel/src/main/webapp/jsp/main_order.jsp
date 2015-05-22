<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
    <style>
        body {
           margin-right:250px;
           background-color: gray;
           font-size: 20px;
           color: yellow;
        }
    </style>
    
    <script type="text/javascript" src="javascript/DatePicker.js"></script>
</head>
<body >
	<div >在线预订</div>
	<div >---------------------------------------------------------------</div>
	<div>
        <form action="room.action">
                   选择房间
            <select  name="id">
                <option value="1"  selected="selected">总统套房</option>
                <option value="2">情侣套房</option>
                <option value="3">商务客房</option>
                <option value="4">特殊房间</option>
            </select>
            
            <input type="submit" value="提交">
                        
        </form>
    </div>
    
	<div>
	   
			<form action="reserve.action">
			
			     <div>---------------------------------------------------------------</div>
			     <div>${user.username} <input type="hidden" name="userid" value=${user.username}></div>
			     <div>房型 &nbsp;&nbsp;&nbsp;&nbsp;     ${room.roomname}</div>
			     <div>房号 &nbsp;&nbsp;&nbsp;&nbsp;     ${room.id}
			       <input type="hidden" name="roomid" value=${room.id}> 
			     </div>
			     <div>等级 &nbsp;&nbsp;&nbsp;&nbsp;     ${room.roomgrade}</div>
			     <div>类型 &nbsp;&nbsp;&nbsp;&nbsp;    ${room.roomtype}</div>
			     <div >价格 &nbsp;&nbsp;&nbsp;&nbsp;    ${room.roomprice}
			         <input type="hidden" name="roomprice" value=${room.roomprice}>
			     </div>
			     <div>优惠 &nbsp;&nbsp;&nbsp;&nbsp;    ${room.discount}</div>			     
			     <div>预订时间    
			      <input name="checkintime"  type="text" onclick="setday(this)" readonly="readonly" />
			      <input name="checkouttime"  type="text" onclick="setday(this)" readonly="readonly" />
			      </div>
			     <div></div>
			     <input type="submit" value="预订">
			     
			</form>
			

			 
			 								 			  
                     	
		
	</div>
	

</body>
</html>