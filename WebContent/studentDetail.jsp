<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="index.htm" %>

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

		<title>My JSP 'studentInf.jsp' starting page</title>

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
			学生编号：
			<s:property value="#request.studentDetail.sno" />
			<br>
			姓名：
			<s:property value="#request.studentDetail.sname" />
			<br>
			性别：
			<s:if test="#request.studentDetail.ssex==1">男</s:if>
			<s:if test="#request.studentDetail.ssex==2">女</s:if>
			<br>
			民族：
			<s:property value="#request.studentDetail.snation" />
			<br>
			专业：
			<s:property value="#request.studentDetail.smajor" />
			<br>
			班级：
			<s:property value="#request.studentDetail.sclass" />
			<br><br>
			<s:a href="getStudentInfAction.action">修改</s:a>
		</div>
	</body>
</html>
