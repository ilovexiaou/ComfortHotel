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
</head>
<body >
	<div >在线预订</div>
	<div >---------------------------------------------------------------</div>
	<div>
			<table >
			 <tr>
			  <td><table width="100px" border=1>房型</table></td>
			  <td><table width="100px" border=1>等级</table></td>
			  <td><table width="100px" border=1>类型</table></td>
			  <td><table width="100px" border=1>价格</table></td>
			  <td><table width="100px" border=1>优惠</table></td>
			  <td><table width="100px" border=1>预订</table></td>
			 </tr>
			 
			  <tr>
              <td><table border=1>${room.roomname}</table></td>
              <td><table border=1>${room.roomgrade}</table></td>
              <td><table border=1>${room.roomtype}</table></td>
              <td><table border=1>${room.roomprice}</table></td>
              <td><table border=1>${room.discount}</table></td>
              <td><table border=1><input type="submit" value="预订"></table></td>
             </tr>
			</table>
	</div>
	

</body>
</html>