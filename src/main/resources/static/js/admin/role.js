$(function(){
	jQuery("#addroleForm").validate({
		highlight: function(element){
			jQuery(element).closest('.form-group').removeClass('has-success').addClass('has-error');
		},
		success: function(element){
			jQuery(element).closest('.form-group').removeClass('has-error');
		},
		rules:{
			roleName:{required : true},
			},
		messages:{
			roleName : '请输入角色名',
		}
	});	
	$("#addroleForm").on("submit",function(){
		var roleName = $("#roleName").val();
		if(roleName==""){
			alert("角色不能为空");
			return false;
		}else{
			return true;
		}
	});
	//验证角色名是否可用
	$("#roleName").on("blur",function(){
		var roleName = $(this).val();//获取用户输入的信息
		$.ajax({
			type:"get",
			url:$("#rootPath").val()+"/admin/roleServlet.do?opr=checkRoleName&roleName="+roleName,
			dataType:"text",
			success:function(result){
				var $info = $("#roleNameInfo");//获取提示信息的存储对象
				if(result=="true"){
					//可以使用
					$info.html("<i class=\"glyphicon glyphicon-ok\"></i> 角色名可用!");
					$info.css("color","green");
				}else{
					//角色名已存在，不可以使用
					$info.html("<i class=\"glyphicon glyphicon-remove\"></i> 角色名已存在!请更换角色名!");
					$info.css("color","red");
				}
			}
		});
	});
});