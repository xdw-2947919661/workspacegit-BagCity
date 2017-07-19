$(function(){
	
	$( "#datepicker" ).datepicker({//添加日期选择功能  
       // numberOfMonths:1,//显示几个月  
       // showButtonPanel:true,//是否显示按钮面板  
        dateFormat: 'yy-mm-dd',//日期格式  
        timeFormat: 'hh:mm', 
        clearText:"清除",//清除日期的按钮名称  
        closeText:"关闭",//关闭选择框的按钮名称  
        //yearSuffix: '年', //年的后缀  
        showMonthAfterYear:true,//是否把月放在年的后面  
        //defaultDate:'2011-03-10',//默认日期  
        //minDate:'2011-03-05',//最小日期  
        //maxDate:'2011-03-20',//最大日期  
        //monthNames: ['一月','二月','三月','四月','五月','六月','七月','八月','九月','十月','十一月','十二月'],  
        //dayNames: ['星期日','星期一','星期二','星期三','星期四','星期五','星期六'],  
        //dayNamesShort: ['周日','周一','周二','周三','周四','周五','周六'],  
        //dayNamesMin: ['日','一','二','三','四','五','六'],  
        /*onSelect: function(selectedDate) {//选择日期后执行的操作  
            alert(selectedDate);  
        }*/  
        });
	
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
			getStaffList();
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
	
	/**
	 * 添加操作
	 */
	$("#addStaff").click(function(){
		$("#nav-list").removeClass("disinline");
		$("#nav-list").addClass("disnone");
		$("#nav-add").removeClass("disnone");
		$("#nav-add").addClass("disinline");
		$("#nav-add input").val("");
		
	});
	
	//保存员工信息操作
	$("#saveStaff").click(function(){
		var name=$("#staffName").val();
		var telphone=$("#telphone").val();
		var spareTel=$("#spareTel").val();
		var address=$("#address").val();
		var entryTime=$("#datepicker").val();
		var dateValue = {
				"name" : name,
				"telphone" : telphone,
				"spareTel" : spareTel,
				"address" : address,
				"entryTime" : entryTime
			};
		
		$.ajax({
			type : "POST",
			url : "staff/add",
			dataType : "json",
			contentType : "application/json",
			data :JSON.stringify(dateValue),
			success : function(data) {	
				if(data.returnCode=="success"){
					$("#nav-add").removeClass("disinline");
					$("#nav-add").addClass("disnone");
					$("#nav-list").removeClass("disnone");
					$("#nav-list").addClass("disinline");
					getStaffList();
				}
			},
			error : {

			}
		});
	});
	
	//取消
	$("#close,#chevron").click(function(){
		$("#nav-add").removeClass("disinline");
		$("#nav-add").addClass("disnone");
		$("#nav-list").removeClass("disnone");
		$("#nav-list").addClass("disinline");
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
			/*text+='<th>ID</th>';*/
			text+='<th>姓名</th>';
			text+='<th>手机号</th>';
			text+='<th>备用电话</th>';
			text+='<th>家庭地址</th>';
			text+='<th>入职日期</th>';
			text+='<th>创建人</th>';
			text+='<th>创建日期</th>';
			text+='<th>修改人</th>';
			text+='<th>修改日期</th>';
			text+='<th>操作</th>';
			text+='</tr>';
			text+='</thead>';
			text+='<tbody>';
			$.each(data,function(i,e){
				if(i%2==0){
					text+='<tr class="success">';
				}else{
					text+='<tr>';
				}
				/*text+='<td>'+e.id+'</td>';*/
				text+='<td>'+e.name+'</td>';
				text+='<td>'+e.telphone+'</td>';
				text+='<td>'+e.spareTel+'</td>';
				text+='<td>'+e.address+'</td>';
				text+='<td>'+e.entryTime+'</td>';
				text+='<td>'+e.createUserId+'</td>';
				text+='<td>'+e.createTime+'</td>';
				text+='<td>'+e.updateUserId+'</td>';
				text+='<td>'+e.updateTime+'</td>';
				text+='<td><a class="padright10 nav-span" onclick="modifStaff(\''+e.id+'\');">编辑</a><a class="padright10 nav-span" onclick="deleteStaff(\''+e.id+'\');">删除</a>';
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

//修改员工信息
function modifStaff(id){
	alert(id);
	var dateValue = {"id" : id};
	$.ajax({
		type : "POST",
		url : "staff/"+id,
		dataType : "json",
		contentType : "application/json",
		data :"",
		success : function(data) {	
			alert(data);
				$("#nav-list").removeClass("disinline");
				$("#nav-list").addClass("disnone");
				$("#nav-add").removeClass("disnone");
				$("#nav-add").addClass("disinline");
				var name=$("#staffName").val(data.name);
				var telphone=$("#telphone").val(data.telphone);
				var spareTel=$("#spareTel").val(data.spareTel);
				var address=$("#address").val(data.address);
				var entryTime=$("#datepicker").val(data.entryTime);
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