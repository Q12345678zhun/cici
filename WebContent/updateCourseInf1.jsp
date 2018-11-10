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

		<title>My JSP 'updateCourseInf1.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<script type="text/javascript">
function del(){
if(confirm("您真的要删除吗？")==true)
return true;
else
return false;
}
</script>
		<script src="styles/jquery-1.6.4.js" type="text/javascript"></script>
		<!--将jQuery引用进来-->
		<script type="text/javascript">
	$(document).ready(function() {
		$(".stripe tr").mouseover(function() {
			$(this).addClass("over");
		}).mouseout(function() {
			$(this).removeClass("over");
		})
		$(".stripe tr:even").addClass("alt");
	});
</script>
		<style type="text/css">
<!--
.stripe {
	border-collapse: collapse;
	font-size: 12px;
	margin-left: auto;
	margin-right: auto;
}

th {
	background: #0066FF;
	color: #FFFFFF;
	line-height: 20px;
	height: 30px;
	border: 1px solid #95bce2;
}

td {
	padding: 6px 11px;
	border-bottom: 1px solid #95bce2;
	border-right: 1px solid #95bce2;
	vertical-align: top;
	text-align: center;
}

tr>td:first-child {
	border-left: 1px solid #95bce2;
}

tr.alt {
	background: #ecf6fc;
}  /*这行将给所有的tr加上背景色*/
tr.over {
	background: #bcd4ec;
} /*这个将是鼠标高亮行的背景色*/
-->
</style>
	</head>

	<body>
		<table align="center" width="850px" class="stripe" 
			cellspacing="0">
			<thead>
			<tr>
				<th>
					课程号
				</th>
				<th>
					课程名
				</th>
				<th>
					上课时间
				</th>
				<th>
					地点
				</th>

				<th>
					修改
				</th>
				<th>
					删除
				</th>
			</tr>
			</thead>
			<tbody>
			<s:iterator value="#request.allCourse" id="course">
				<tr>
					<td>
						<s:property value="#course.cno" />
					</td>
					<td>
						<s:property value="#course.cname" />
					</td>
					<td>
						<s:property value="#course.ctime" />
					</td>
					<td>
						<s:property value="#course.caddress" />
					</td>
					<td>
						<s:a
							href="getPCourseDetailAction.action?course.cid=%{#course.cid}">修改</s:a>
					</td>
					<td>
						<s:a href="deleteCourseAction.action?course.cid=%{#course.cid}"
							onclick="return del()">删除</s:a>
					</td>
				</tr>


			</s:iterator></tbody>
		</table>

	</body>
</html>
