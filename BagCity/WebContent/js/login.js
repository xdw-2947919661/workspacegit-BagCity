$(function() {
	$("#submit").click(function() {
		var username = $("#username").val();
		var password = $("#password").val();
		var data = {
			"userName" : username,
			"password" : password
		};
		if (username == "" || password == "") {
			$("#ls-validate").show();
			window.setTimeout("reset()", 3000);
		}

		$.ajax({
			type : "POST",
			url : "login",
			dataType : "json",
			contentType : "application/json",
			data : JSON.stringify(data),
			success : function(data) {
				if(data.returnCode=="success"){
					window.location.href="hello.jsp";
				}else if(data.returnCode=="failure"){
					window.setTimeout("reset()", 3000);
				}
			},
			error : {

			}
		});

	});

});
function reset() {
	$("#username").val("");
	$("#password").val("");
	$('#ls-validate').hide(1000)
}