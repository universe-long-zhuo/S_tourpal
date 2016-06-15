<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="d" uri="http://displaytag.sf.net"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>用户管理-用户查询</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet" />
<script type="text/javascript" src="resources/js/jquery.min.js"></script>
<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
</head>
<body>
	<div>
		<ul class="breadcrumb" style="margin: 0px;">
			<li>系统管理</li>
			<li>用户管理</li>
			<li>用户查询</li>
		</ul>
	</div>
	<form action="userinfo/list.do" class="form-inline">
		<div class="row alert alert-info" style="margin: 0px; padding: 5px;">
			<div class="form-group">
				<label>姓名:</label> <input type="text" name="userName"
					class="form-control" placeholder="请输入姓名" /> <label>类别:</label> <select
					name="userType" class="form-control">
					<option value="">请选择</option>
					<option value="管理员">管理员</option>
					<option value="普通用户">普通用户</option>
				</select>
			</div>
			<input type="submit" class="btn btn-danger" value="查询"> <a
				href="jsp/admin/userinfo/userinfo_add.jsp" class="btn btn-success">添加用户</a>
		</div>


		<div class="row" style="padding: 15px;" align="right">
			<d:table name="${list }" class="table table-hover table-condensed"
				pagesize="10" requestURI="userinfo/list.do">
				<d:column property="userNumber" title="账号" />
				<d:column property="userPw" title="密码" />
				<d:column property="userName" title="姓名" />
				<d:column property="userType" title="类别" />
				<d:column paramId="userNumber" paramProperty="userNumber" value="修改"
					href="userinfo/load.do" title="修改" />
						<d:column paramId="userNumber" paramProperty="userNumber" value="删除"
					href="userinfo/delete.do" title="删除" />
			</d:table>

		</div>
	</form>
</body>
</html>