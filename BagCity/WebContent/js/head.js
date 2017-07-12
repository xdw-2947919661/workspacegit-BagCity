$(function(){
	//进行加载菜单列表信息
	$.ajax({
		type : "POST",
		url : "menulist",
		dataType : "json",
		contentType : "application/json",
		data : "",
		success : function(data) {
			/**---添加菜单start---**/
			$("#menu-left").empty();
			var text="";
			$.each(data.menulist,function(i,e){
				if(i==0){
					text+='<div class="menu-content menu-contbg" onclick="addbg(this);"><span class="'+e.icon+'" style="padding-right: 10px;"></span><span>'+e.name+'</span></div>';
				}else{
					text+='<div class="menu-content" onclick="addbg(this);"><span class="'+e.icon+'" style="padding-right: 10px; "></span><span>'+e.name+'</span></div>';
				}
			});
			$("#menu-left").append(text);
			/**---添加菜单end---**/
			
			/**---加载初始化内容start--**/
			/**getStaffList();*/
			/**---加载初始化内容end--**/
			
		},
		error : {

		}
	});
	
	
	$("#menu").click(function(){
	     $("#menu-left").toggle(500,function(){
	    	 $("#nav-content").toggleClass("col-md-10");
	    	 $("#nav-content").toggleClass("col-md-12");
	     });
	  });
	
	$("#user-img").click(function(){
	     $("#user-control").toggle(1000);
	  });
	
	$("#addStaff").click(function(){
		$("#nav-table").fadeOut(3000,function(){
			$("#nav-table").empty();
			var text="";
			text+="<div>";
			text+="dsaaaaaaaaaaaaaaaaaaaaaaa";
			text+="</div>";
			$("#nav-table").append(text);
			$("#nav-table").fadeIn(3000);
		});
		
	});
	
});


function getStaffList(){
	$.ajax({
		type : "POST",
		url : "staff/findall",
		dataType : "json",
		contentType : "application/json",
		data : "",
		success : function(data) {
			$("#nav-table").empty();
			var text="";
			text+='<div class="table-responsive ">';
			text+='<table class="table table-bordered">';
			text+='<caption>已有员工列表</caption>';
			text+='<thead>';
			text+='<tr>';
			text+='<th>ID</th>';
			text+='<th>姓名</th>';
			text+='<th>手机号</th>';
			text+='<th>备用电话</th>';
			text+='<th>家庭地址</th>';
			text+='<th>入职日期</th>';
			text+='<th>创建人</th>';
			text+='<th>创建日期</th>';
			text+='<th>修改人</th>';
			text+='<th>修改日期</th>';
			text+='</tr>';
			text+='</thead>';
			text+='<tbody>';
			$.each(data,function(i,e){
				if(i%2==0){
					text+='<tr class="success">';
				}else{
					text+='<tr>';
				}
				text+='<td>'+e.id+'</td>';
				text+='<td>'+e.name+'</td>';
				text+='<td>'+e.telphone+'</td>';
				text+='<td>'+e.spareTel+'</td>';
				text+='<td>'+e.address+'</td>';
				text+='<td>'+e.entryTime+'</td>';
				text+='<td>'+e.createUserId+'</td>';
				text+='<td>'+e.createTime+'</td>';
				text+='<td>'+e.updateUserId+'</td>';
				text+='<td>'+e.updateTime+'</td>';
				text+='</tr>';
			});
			text+='</tbody>';
			text+='</table>';
			text+='</div>';
			$("#nav-table").append(text);
		},
		error : {

		}
		});
}



function addbg(object){
	$(object).siblings().removeClass("menu-contbg");
	$(object).addClass("menu-contbg");
	$.ajax({
		type : "POST",
		url : "staff/findall",
		dataType : "json",
		contentType : "application/json",
		data : "",
		success : function(data) {
			$("#nav-table").empty();
			var text="";
			text+='<div class="table-responsive">';
			text+='<table class="table">';
			text+='<caption>已有员工列表</caption>';
			text+='<thead>';
			text+='<tr>';
			text+='<th>ID</th>';
			text+='<th>姓名</th>';
			text+='<th>手机号</th>';
			text+='<th>备用电话</th>';
			text+='<th>家庭地址</th>';
			text+='<th>入职日期</th>';
			text+='<th>创建人</th>';
			text+='<th>创建日期</th>';
			text+='<th>修改人</th>';
			text+='<th>修改日期</th>';
			text+='</tr>';
			text+='</thead>';
			text+='<tbody>';
			$.each(data,function(i,e){
				if(i%2==0){
					text+='<tr class="success">';
				}else{
					text+='<tr>';
				}
				text+='<td>'+e.id+'</td>';
				text+='<td>'+e.name+'</td>';
				text+='<td>'+e.telphone+'</td>';
				text+='<td>'+e.spareTel+'</td>';
				text+='<td>'+e.address+'</td>';
				text+='<td>'+e.entryTime+'</td>';
				text+='<td>'+e.createUserId+'</td>';
				text+='<td>'+e.createTime+'</td>';
				text+='<td>'+e.updateUserId+'</td>';
				text+='<td>'+e.updateTime+'</td>';
				text+='</tr>';
			});
			text+='</tbody>';
			text+='</table>';
			text+='</div>';
			$("#nav-table").append(text);
			$("#nav-table").fadeIn(3000);
		},
		error : {

		}
		});
	}