<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.ResourceBundle" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	ResourceBundle res = ResourceBundle.getBundle("common");
%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<link rel="Shortcut icon"  href="<%=basePath%>img/favicon.ico">
<link rel=icon  href="<%=basePath%>img/favicon.ico">
<link rel=icon  href="<%=basePath%>img/favicon.ico">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<%=basePath%>js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/login.js"></script>
<title><%=res.getString("title")%></title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
}


.slideshow {
	position: absolute;
	width: 100vw;
	height: 100vh;
	overflow: hidden;
}

.slideshow-image {
	position: absolute;
	width: 100%;
	height: 100%;
	background: no-repeat 50% 50%;
	background-size: cover;
	-webkit-animation-name: kenburns;
	animation-name: kenburns;
	-webkit-animation-timing-function: linear;
	animation-timing-function: linear;
	-webkit-animation-iteration-count: infinite;
	animation-iteration-count: infinite;
	-webkit-animation-duration: 16s;
	animation-duration: 16s;
	opacity: 1;
	-webkit-transform: scale(1.2);
	transform: scale(1.2);
}

.slideshow-image:nth-child(1) {
	-webkit-animation-name: kenburns-1;
	animation-name: kenburns-1;
	z-index: 2;
}

.slideshow-image:nth-child(2) {
	-webkit-animation-name: kenburns-2;
	animation-name: kenburns-2;
	z-index: 3;
}

.slideshow-image:nth-child(3) {
	-webkit-animation-name: kenburns-3;
	animation-name: kenburns-3;
	z-index: 0;
}

.slideshow-image:nth-child(4) {
	-webkit-animation-name: kenburns-4;
	animation-name: kenburns-4;
	z-index: 1;
}


.login {
	position: absolute;
	top: 43%;
	left: 50%;
	-webkit-transform: translate3d(-50%, -50%, 0);
	transform: translate3d(-50%, -50%, 0);
	background-color: rgba(255, 255, 255, 0.75);
	box-shadow: 0 1em 2em -1em rgba(0, 0, 0, 0.5);
	/* padding: 1em 2em; */
	z-index: 99;
	width: 380px;
	height: auto;
	border-radius: 10px;
	line-height: 2.5;
}

.login h2 {
	opacity: 0.8;
	color: #0b371b;
	text-align: center;
	font-family: "Arial","Microsoft YaHei","黑体","宋体",sans-serif;
	font-size:30px;
	font-weight: 300;
}

.loginshow {
	width: 100%;
	height: auto;
	text-align:center;
	padding-top: 0;
}

.l-head {
	border-radius: 10px 10px 0px 0px;
	opacity: 0.8;
	width: 100%;
	background: #3FD393;
}

.ls-input {
	background: no-repeat 0 0 scroll;
	width: 75%;
	height: 40px;
	margin-top:20px;
    border: 1px solid #989898;
    border-radius: 4px;
    box-shadow: inset 0 1px 1px rgba(0,0,0,.075);
}

.ls-input-validate{
    background: no-repeat 0 0 scroll;
	width: 75%;
	height: 40px;
	 border: 1px solid #FF0000;
	box-shadow: inset 0 1px 1px rgba(0,0,0,.075);
	margin-top:10px;
	border-radius: 4px;
}

.ls-button {
	margin-top: 20px;
	margin-bottom:30px;
	font-family: "Arial","Microsoft YaHei","黑体","宋体",sans-serif;
	background: no-repeat 0 0 scroll;
	text-align: center;
	border: 1px solid #989898;
	outline: medium;
	width: 75%;
	height: 40px;
	border-radius: 4px;
}
</style>
</head>
<body>
	<!-- 文字区不需要请连css部分代码一并删除 -->

	<div class="login">
		<div class="l-head">
			<h2>后台管理系统</h2>
		</div>

		<div class="loginshow">
		    <input type="text" placeholder="无效的凭证，请检查后重试！" readonly="readonly" hidden="hidden" id="ls-validate" class="ls-input-validate">
			<input type="text" placeholder="用户名" id="username" class="ls-input"> 
			<input type="password" placeholder="密码" id="password" class="ls-input"> 
			<input type="button" id="submit" style="cursor: pointer;" value="登  &nbsp陆" class="ls-button">
		</div>
	</div>

	<div class="slideshow">
		<div class="slideshow-image"
			style="background-image: url('<%=basePath%>img/1.jpg')"></div>
		<div class="slideshow-image"
			style="background-image: url('<%=basePath%>img/2.jpg')"></div>
		<div class="slideshow-image"
			style="background-image: url('<%=basePath%>img/3.jpg')"></div>
		<div class="slideshow-image"
			style="background-image: url('<%=basePath%>img/4.jpg')"></div>
	</div>
</body>
</html>