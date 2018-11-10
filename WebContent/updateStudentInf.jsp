<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="index.htm"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateStudentInf2.jsp' starting page</title>
    		<link rel="stylesheet" type="text/css" href="images/style.css"/>
    
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
   <div align="center" style="margin-top:-8cm;">
			<s:form action="updateStudentInfAction">
				<s:hidden value="%{#request.studentDetail.sid}" name="student.sid">
				</s:hidden>
				<s:textfield label="学号" value="%{#request.studentDetail.sno}"
					name="student.sno" readonly="true"></s:textfield>
				<br>
				<s:textfield label="姓名" value="%{#request.studentDetail.sname}"
					name="student.sname"></s:textfield>
				<br>
				<s:password label="密码" value="%{#request.studentDetail.spassword}"
					name="student.spassword"></s:password>
				<br>
				<s:radio list="#{'1':'男','2':'女'}" label="性别"
					value="%{#request.studentDetail.ssex}" name="student.ssex"></s:radio>
				<br>
				<s:textfield label="民族" value="%{#request.studentDetail.snation}"
					name="student.snation"></s:textfield>
				<br>
				<s:textfield label="专业" value="%{#request.studentDetail.smajor}"
					name="student.smajor"></s:textfield>
				<br>
				<s:textfield label="班级" value="%{#request.studentDetail.sclass}"
					name="student.sclass"></s:textfield>
				<br>
				<s:submit value="保存" align="center"></s:submit>
				<br>
			</s:form>
		</div>
  </body>
</html>
