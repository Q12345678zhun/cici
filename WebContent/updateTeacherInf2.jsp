<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="adminIndex.htm"%>
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

		<title>My JSP 'updateTeacherInf2.jsp' starting page</title>

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
			<s:form action="updateTeacherInfAction">
				<s:hidden value="%{#request.teacherDetail.tid}" name="teacher.tid"></s:hidden>
				<s:textfield label="教师编号" value="%{#request.teacherDetail.tno}" readonly="true" name="teacher.tno"/>
				<s:textfield label="教师姓名" value="%{#request.teacherDetail.tname}" name="teacher.tname"></s:textfield>
				<s:textfield label="所在系" value="%{#request.teacherDetail.tmajor}" name="teacher.tmajor"></s:textfield>
				<s:textfield label="所教教程编号" value="%{#request.teacherDetail.course.cno}" name="course.cno"></s:textfield>
				<s:submit value="保存"></s:submit>
			</s:form>
		</div>
	</body>
</html>
