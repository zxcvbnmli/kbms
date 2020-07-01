$(function(){
	$("#pwdForm").on("submit",function(){
		if($("#oldpwd").attr("isok")=="false"){
			return false;
		}else{
			return true;
		}
	});
	//原始密码的文本框失去焦点时ajax异步验证原始密码是否正确
	$("oldpwd").on("blur",function(){
		//获取用户输入的原始密码
		var oldpwd=$("oldpwd").val();
		$.ajax({
			url:$("#rootPath").val()+"/admin/dologin.html",
			type:"post",
			data:"oldpwd="+oldpwd,
			dataType:"text",
			success:function(result){
				if(result=="true"){
					$("#oldpwd").attr("isok","true");
				}else{
					$("#oldpwd").attr("isok","false");
					$("#oldpwd").val("");
					$("#oldpwd").attr("placeholder","原始密码输入不正确");
				}
			}
		});
	});
	//初始化验证参数
	jQuery("#pwdForm").validate({
		highlight: function(element){
			jQuery(element).closest('.form-group').removeClass('has-success').addClass('has-error');
		},
		success: function(element){
			jQuery(element).closest('.form-group').removeClass('has-error');
		},
		rules:{
			oldpwd:{
				required : true,
				maxlength:18
			},
			newpwd : {
				required : true,
				maxlength:18
			},
			renewpwd : {
				equalTo:"#newpwd"
			}
		},
		messages:{
			oldpwd : {
				required : '请输入原始密码',
				maxlength:"密码不能超过18位"
			},
			newpwd : {
				required : '请输入新密码',
				maxlength:"密码不能超过18位"
			},
			renewpwd:"密码不一致",
		}
	});
	
});
