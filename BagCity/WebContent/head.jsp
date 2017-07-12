<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.ResourceBundle" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	ResourceBundle res = ResourceBundle.getBundle("common");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8;">
<script type="text/javascript" src="<%=basePath%>js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/bootstrap.js"></script>
<script type="text/javascript" src="<%=basePath%>js/head.js"></script>
<link rel="stylesheet" href="<%=basePath%>css/jquery-ui.min.css">
<link rel="stylesheet" href="<%=basePath%>css/bootstrap.min.css">
<link rel="stylesheet" href="<%=basePath%>css/common.css">
<link rel="stylesheet" href="<%=basePath%>css/content.css">
<link rel="icon" href="<%=basePath%>img/favicon.ico">
<title><%=res.getString("title")%></title>
</head>
<body>
	<div class="container-fluid head navbar-fixed-top padright">
		<div class="row-fluid fontColor">
			<div class="col-md-4 padleft">
			<span id="menu" class="glyphicon glyphicon-align-justify btn-sm nav-span"></span>
				<img alt="公司logo" class="logoImg" src="<%=basePath%>img/logo.png">
			</div>
			<div class="col-md-4 nav-height text-right padright ">
				<input class="search-input"  type="text" />
					<span class="glyphicon glyphicon-search btn-lg nav-span" style="top:5px;" aria-hidden="true"></span>
			</div>
			<div class="col-md-1 nav border-left padright"><span class="glyphicon glyphicon-plus btn-lg" style="top:7px;"></span></div>
			<div class="col-md-1 nav border-left padright"><span class="glyphicon glyphicon-book btn-lg" style="top:7px;"></span></div>
			<div class="col-md-1 nav  border-left padright"><span class="glyphicon glyphicon-print btn-lg" style="top:7px;"></span></div>
			<div class="col-md-1 nav nav-user border-left padright " ><img id="user-img" alt="用户头像" class="userImg round-img" src="<%=basePath%>img/billing.jpg">
			<div class="user-control"  id="user-control" hidden="hidden">
			<div class="bh"><span class="glyphicon glyphicon-home" style="padding-right: 10px;"></span>个人中心</div>
			<div class="bh"><span class="glyphicon glyphicon-log-out" style="padding-right: 10px;"></span>退出登陆</div>
			</div>
			</div>
		</div>
	</div>
</body>
</html>