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
		<title>My JSP 'studentRegist.jsp' starting page</title>
		<link rel="stylesheet" type="text/css" href="styles/styles.css" />

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
		<s:form action="insertStudentAction">
			<s:textfield name="student.sno" label="学号"></s:textfield>
			<s:textfield name="student.sname" label="姓名"></s:textfield>
			<s:password name="student.spassword" label="密码"></s:password>
			<s:radio list="#{'1':'男','2':'女'}" value="1" name="student.ssex"
				label="性别"></s:radio>
			<s:textfield name="student.snation" label="民族"></s:textfield>
			<s:textfield name="student.smajor" label="专业"></s:textfield>
			<s:textfield name="student.sclass" label="班级"></s:textfield>
			<s:submit value="注册"></s:submit>
		</s:form></div>
	</body>
</html>
