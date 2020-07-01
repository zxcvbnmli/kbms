$(function(){
	jQuery("#adduserForm").validate({
		highlight: function(element){
			jQuery(element).closest('.form-group').removeClass('has-success').addClass('has-error');
		},
		success: function(element){
			jQuery(element).closest('.form-group').removeClass('has-error');
		},
		rules:{
			userName:{required : true},
			realName :{required : true},
			},
		messages:{
			userName : '请输入用户名',                                
			newpwd :  '请输入昵称'
		}
	});	
	$("#adduserForm").on("submit",function(){
		var roleId = $("#roleId").val();
		var deptId = $("#deptId").val();
		if(roleId==""){
			alert("角色不能为空");
			return false;
		}else if(deptId==""){
			alert("部门不能为空");
			return false;
		}else{
			return true;
		}
	});
	//验证用户名是否可用
	$("#userName").on("blur",function(){
	    var userName = $(this).val();//获取用户输入的用户名信息p
	    $.ajax({
	        type:"get",
	        url:$("#rootPath").val()+"/user/checkusername.html/"+userName,
	        dataType:"json",
	        success:function(result){
	            var $info=$("#userNameInfo");//获取提示信息的存储对象
	            if(result=="true"){
	            	//可以使用
	            	$info.html("<i class=\"glyphicon glyphicon-ok\"></i> 用户名可用!");
	            	$info.css("color","green");
	            }else{
	            	//用户名被占用不可用
	            	$("#userName").val("");
	            	$info.html("<i class=\"glyphicon glyphicon-remove\"></i> 用户名已存在，请更换用户名!");
	            	$info.css("color","red");
	            }
	        }
	    });
	});
});