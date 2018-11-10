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
		<link rel="stylesheet" type="text/css" href="images/style.css" />
		<link rel="stylesheet" type="text/css" href="styles/styles.css" />
		<title>My JSP 'adminIndex.jsp' starting page</title>

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
		<div align="center"><br>
			<s:form action="adminLogonAction">
				<s:textfield name="admin.ano" label="管理员账户"></s:textfield>
				<s:password name="admin.apassword" label="密码"></s:password>
				<s:submit value="登录" align="right"></s:submit>
			</s:form>
		</div>
	</body>
</html>
