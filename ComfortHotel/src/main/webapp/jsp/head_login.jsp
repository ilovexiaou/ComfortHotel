<%@ page language="java" import="com.elvis.domain.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

    <style>
body {
	margin: 5px 250px 5px 250px; background-color : gray;
	font-size: 20px;
	color: yellow;
	background-color: gray;
}

	a:link,a:visited {
		text-decoration: none; /*超链接无下划线*/
		color: yellow;
	}
	
	a:hover {
		text-decoration: underline; /*鼠标放上去有下划线*/
		color: yellow;
	}
	
</style>
</head>
<body>

	
	<div style=" width:1100px">
        <div  style=" float:left; width:150px;"><img src="picture/logo.jpg"> </div>            
        <div  style=" float:left; width:500px;"><img src="picture/logo2.jpg"></div>  
        <div  style=" float:left; width:250px;"><img src="picture/logo3.jpg"></div>


        <%
		boolean userlogined = false;
    
		User user = (User) session.getAttribute("user");
		String str=user.getUsername();
		if (str != null ) {
		    userlogined = true;
		}
		
		%> 
		

		<%
		    if (userlogined) {
		%>
		<div style=" float:left; width:100px; align="right";> 欢迎${user.username}</div>
		<a href="exit.jsp" target="_top">退出</a>
		<%
		    } else {
		%>
		<div style=" float:left; width:50px; align="right";> <a href="register.jsp" target="_top">注册</a></div>
        <div style=" float:left; width:50px; align="right";><a href="login.jsp" target="_blank">登陆</a></div>
		<%}%>


	</div>

   
    <div  style="clear:both" >
        <div  style=" float:left; width:110px;"> <a href="../index.jsp" target="_top">首页预览</a></div>
         <div style=" float:left; width:110px;"> <a href="../index.jsp" target="_top">在线预订</a></div>
         <div style=" float:left; width:110px;"> <a href="index_service3.jsp" target="_top"> 服务设施</a></div>
         <div style=" float:left; width:110px;"> <a href="index_picture4.jsp" target="_top">酒店图片</a></div>
         <div style=" float:left; width:110px;"> <a href="index_map5.jsp" target="_top">地图位置</a></div>
         <div style=" float:left; width:110px;"> <a href="index_discount6.jsp" target="_top"> 优惠信息</a></div>
         <div style=" float:left; width:110px;"> <a href="index_new7.jsp" target="_top">新闻资讯</a></div>
         <div style=" float:left; width:110px;"> <a href="index_job8.jsp" target="_top">人才招聘</a></div>         
    </div>

</body>
</html>