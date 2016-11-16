<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <h1>重新登录</h1>
   <form action="<c:url value='/employee/employeelogin1.action'/>"  method="post">
	  	<table>
		  	<tr>
		  		<td>用户名:</td>
		  		<td><input name="name" type="text" style="width:150px"/></td>
		  	</tr>
		  	<tr>
		  		<td>id:</td>
		  		<td><input name="id" type="password" style="width:150px"/></td>
		  		
		  	</tr>
		  	<tr>
		  		<td><input  type="submit" value="提交"/></td>
		  		<td><input type="reset" value="重新填写"/></td>
		  		
		  	</tr>
	  	</table>
	  </form>
  </body>
</html>
