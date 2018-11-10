<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="adminIndex.htm" %>

<%@  taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>.
	<head>
		<base href="<%=basePath%>">
		<link rel="stylesheet" type="text/css" href="images/style.css"/>
		<link rel="stylesheet" type="text/css" href="styles/styles.css" />

		<title>My JSP 'insertTeacher.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	</head>
	<body><div align="center">
		<s:form action="insertTeacherAction">
			<s:textfield name="teacher.tno" label="老师编号"></s:textfield>
			<br>
			<s:textfield name="teacher.tname" label="老师姓名"></s:textfield>
			<br>
			<s:textfield name="teacher.tmajor" label="所属系"></s:textfield>
			<br>
			<s:textfield name="teacher.course.cno" label="所教课程编号"></s:textfield>
			<br>
			<s:submit value="提交"></s:submit>
		</s:form></div>
	</body>
</html>
