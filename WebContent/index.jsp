<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<link rel="stylesheet" type="text/css" href="images/style.css"/>
		<link rel="stylesheet" type="text/css" href="styles/styles.css" />

		<title>My JSP 'index.jsp' starting page</title>
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
		 <div align="center">
		<s:form action="studentLogonAction">
			<s:textfield name="student.sno" label="学号"></s:textfield>
			<br>
			 
			<s:password name="student.spassword" label="密码"></s:password>
			<br>
			 
			<s:submit value="登录" align="right"></s:submit>
				 
		</s:form>
	<s:a href="studentRegist.jsp">新生注册</s:a>&nbsp;&nbsp;&nbsp;&nbsp;<s:a href="adminIndex.jsp">管理员入口</s:a>
	 </div>
	</body>
</html>
