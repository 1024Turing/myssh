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
    
    <title>My JSP 'addEmploy.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<%-- <script type="text/javascript" src="<c:url  value='/js/lhgcore.js'/>"></script>
<script type="text/javascript" src="<c:url value='/js/lhgcalendar.js'/>"></script>
	 --%>
	 <!-- 加控件用c标签 -->
<script type="text/javascript" src="<c:url value='/jquery-1.10.0.js'/>"></script>
<script type="text/javascript" src="<c:url value='/Date/WdatePicker.js'/>"></script>
<script type="text/javascript" src="<c:url value='/Date/skin/WdatePicker.css'/>"></script>
	<script type="text/javascript" >
	//进页面就加载ajax
	$(document).ready(function(){
		 $.post("<c:url value='/department/departmentqueryAllDep.action'/>",function(data){
	  		   	//alert(data);
	  		   	//select标签拼接后台传过来的数据
	  		   	$("#sel").append(data);
	  		   	},"html"
	  		   ); 
	})
  	/* function query(){
  		
  		   $.post("<c:url value='/department/departmentqueryAllDep.action'/>",function(data){
  		   	//alert(data);
  		   	
  		   	$("#sel").append(data);
  		   	},"html"
  		   );  
	}*/
		  
	   /*  $.ajax({  
	     url:"<c:url value='/message/message_ajax.action'/>",  
	     type:'post',  
	     data:"{}",  
	     dataType:'json',  
	     success:function (data){
	    	 alert(data);
	    	 }
	     });  */
	  	 
  </script> 
 
  </head>
  
  
  <body>
   <form action="<c:url value='/employee/employeeaddEmployee.action'/>"  method="post">
	  	 <table>
		  	 <tr>
		  		<td>姓名:</td>
		  		<td><input name="name" type="text" style="width:150px"/></td>
		  	</tr>
		  	
		  	<tr>
		  		<td>邮件:</td>
		  		<td><input name="email" type="text" style="width:150px"/></td>
		  	</tr>
		  	<tr>
		  		<td>入职时间:</td>
		  		<td><input name="hireDate" type="text"  class="Wdate" onClick="WdatePicker()" style="width:150px"/></td>
		  	</tr>
		  	<tr>
		  		<td>薪水:</td>
		  		<td><input name="salary" type="text" style="width:150px"/></td>
		  	</tr>
		  	<tr>
		  		<td>部门:</td>    
<!-- 		  		<td><input name="department_id" type="text" style="width:150px"/></td>
 -->		  		
		  		<td><select name="department_id" id = "sel">
		  				<option value="-1">请选择</option>
		  				
		  			</select>
		  		</td>
		  	</tr>  
		  	<tr>
		  		<td><input  type="submit" value="提交"/></td>
		  		<td><input type="reset" value="重新填写"/></td>
		  		
		  	</tr>
		  	
	  	</table>
	  </form>
  </body>
</html>
