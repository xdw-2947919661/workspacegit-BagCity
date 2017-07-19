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
	<div class="container-fluid menudiv padright">
		<div class="row-fluid">
			<div class="col-md-2 menu-left padright padleft" id="menu-left">

			</div>
			<div class="col-md-10 pull-right padnone" id="nav-content">
			
			     <div class="col-md-12 disinline  padnone" id="nav-list" style="height: auto;">
				  <div class="col-md-12 text-right padTop20">
					<input type="text" class=""> <a class="nav-span"><span class="glyphicon glyphicon-search btn-sm padRight5"></span>搜索</a> 
					<a class="nav-span" id="addStaff"> <span class="glyphicon glyphicon-plus btn-sm padRight5"></span>添加 </a> 
					<a class="nav-span"> <span
						class="glyphicon glyphicon-trash btn-sm padRight5"></span>删除
					</a> <a class="nav-span"> <span
						class="glyphicon glyphicon-filter btn-sm padRight5"></span>筛选
					</a>
				</div>
				<div class="col-md-12  padnone"
					style="border-bottom: 1px solid #CCD8F2; margin-top: 1px;"></div>
				<div class="col-md-12" id="nav-table" style="overflow: auto">

				</div> 
				</div>
				
				<div class="col-md-12 disnone padnone" id="nav-add" style="height: auto;">
				<div class="col-md-12 text-left padTop20">
				<span class="glyphicon glyphicon-chevron-left btn-lg padnone padright5 nav-span" id="chevron"></span>添加新员工
				</div>
				<div class="col-md-12 padnone"
					style="border-bottom: 1px solid #CCD8F2; margin-top: 3px;"></div>
					
				<div  class="col-md-12">
				<div class="col-md-2 text-right padTop20"><span class="redstar">*</span> <span>姓名：</span></div>
				<div class="col-md-6 padTop20">
				<input type="text" class="form-control" id="staffName"  placeholder="请输入名字">
				</div>
				</div>
				
				<div  class="col-md-12">
				<div class="col-md-2 text-right padTop20"><span class="redstar">*</span><span>手机号：</span></div>
				<div class="col-md-6 padTop20">
				<input type="text" class="form-control" id="telphone"  placeholder="请输入手机号">
				</div>
				</div>
				
				<div  class="col-md-12">
				<div class="col-md-2 text-right padTop20"><span class="redstar">*</span><span>备用电话：</span></div>
				<div class="col-md-6 padTop20">
				<input type="text" class="form-control" id="spareTel"  placeholder="请输入备用电话">
				</div>
				</div>
				
				<div  class="col-md-12">
				<div class="col-md-2 text-right padTop20"><span>家庭地址：</span></div>
				<div class="col-md-6 padTop20">
				<input type="text" class="form-control" id="address"  placeholder="请输入家庭地址">
				</div>
				</div>
				
				<div  class="col-md-12">
				<div class="col-md-2 text-right padTop20"><span class="redstar">*</span><span>入职日期：</span></div>
				<div class="col-md-6 padTop20">
				<input type="text" class="form-control" id="datepicker">
				</div>
				</div>
				
				<div  class="col-md-12">
				<div class="col-md-2 text-right padTop20"><span>头像：</span></div>
				<div class="col-md-6 padTop20">
				<input type="text" class="form-control" id="firstname"  placeholder="请输入名字">
				</div>
				</div>
				
				<div  class="col-md-12">
				<div class="col-md-2 text-right padTop20"></div>
				<div class="col-md-6 padTop20">
				<button type="button" class="btn btn-success" id="saveStaff">保存</button>
				<button type="button" class="btn btn-default" id="close">取消</button>
				</div>
				</div>
				</div>

			</div>
		</div>
	</div>
</body>
</html>