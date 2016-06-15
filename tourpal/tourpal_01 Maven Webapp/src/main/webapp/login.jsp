<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>卓越社区</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>
<div data-role="page">
		<div data-role="header">
			<h1>欢迎来到卓越社区</h1>
		</div>
		<div data-role="content">
			<form action="<%=basePath %>tourpal/login.do" method="post" style="padding: 10px 20px;">
				<h3 align="center">
					<img alt="" src="<%=basePath %>resources/tourpal/img/logo.png" height="200px">
				</h3>
				<div align="center" style="color: red;">${info }</div>
				<label for="un" class="ui-hidden-accessible">账号:</label> <input
					type="text" name="userNumber" id="un" placeholder="请输入账号" /> <label
					for="un2" class="ui-hidden-accessible">密码:</label> <input
					type="text" name="userPw" id="un2" placeholder="请输入密码" />
				
				<div class="ui-grid-a">
					<div class="ui-block-a">
						<input type="submit" data-theme="b" value="登录" data-role="button">
					</div>
					<div class="ui-block-b">
						<a href="<%=basePath %>reg.jsp" data-role="button" data-ajax="false" data-theme="b">注册</a>
					</div>
				</div>
			</form>
		</div>
		<div data-role="footer" data-position="fixed">
			<h1>版权所有：卓越</h1>
		</div>
	</div>
</body>
</html>