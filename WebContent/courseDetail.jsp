<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ include file="index.htm" %>

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
		<title>My JSP 'courseDetail.jsp' starting page</title>

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
			课程编号：
			<s:property value="#request.courseDetail.cno" />
			<br>
			课程名：
			<s:property value="#request.courseDetail.cname" />
			<br>
			上课时间：
			<s:property value="#request.courseDetail.ctime" />
			<br>
			上课地点：
			<s:property value="#request.courseDetail.caddress" />
			<br>
			教师：
			<s:property value="#request.courseDetail.teacher.tname" />
			<br>
			<s:a action="getXuankeCourseAction">返回</s:a>
		</div>
	</body>
</html>
