<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="adminIndex.htm"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateCourseInf2.jsp' starting page</title>
    
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
			<s:form action="updateCourseInfAction">
				<s:hidden value="%{#request.courseDetail.cid}" name="course.cid"></s:hidden>
				<s:textfield label="课程编号" value="%{#request.courseDetail.cno}" readonly="true" name="course.cno"/>
				<s:textfield label="课程名称" value="%{#request.courseDetail.cname}" name="course.cname"></s:textfield>
				<s:textfield label="上课时间" value="%{#request.courseDetail.ctime}" name="course.ctime"></s:textfield>
				<s:textfield label="上课地点" value="%{#request.courseDetail.caddress}" name="course.caddress"></s:textfield>
				<s:submit value="保存"></s:submit>
			</s:form>
		</div>
  </body>
</html>
