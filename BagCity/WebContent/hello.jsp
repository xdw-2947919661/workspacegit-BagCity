<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="head.jsp"></jsp:include>
</head>
<body class="bg">
	<!-- <div style="height: 1000px; padding-top: 65px;text-align: center;"><h1>内容页面</h1></div> -->
	<div class="container-fluid menudiv">
		<div class="row-fluid">
			<div class="col-md-2 menu-left padright padleft" id="menu-left">

			</div>
			<div class="col-md-10 pull-right" id="nav-content">
				<div class="col-md-12 text-right padTop20">
					<input type="text" class=""> <a class="nav-span"><span class="glyphicon glyphicon-search btn-sm padRight5"></span>搜索</a> 
					<a class="nav-span" id="addStaff"> <span class="glyphicon glyphicon-plus btn-sm padRight5"></span>添加 </a> 
					<a class="nav-span"> <span
						class="glyphicon glyphicon-trash btn-sm padRight5"></span>删除
					</a> <a class="nav-span"> <span
						class="glyphicon glyphicon-filter btn-sm padRight5"></span>筛选
					</a>
				</div>
				<div class="col-md-12"
					style="height: 1px; border: 1px solid #CCD8F2; margin-top: 5px;"></div>
				<div class="col-md-12" id="nav-table" style="overflow: auto">

				</div>
			</div>
		</div>
	</div>
</body>
</html>