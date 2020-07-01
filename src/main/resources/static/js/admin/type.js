$(function(){
	jQuery("#addtypeForm").validate({
		highlight: function(element){
			jQuery(element).closest('.form-group').removeClass('has-success').addClass('has-error');
		},
		success: function(element){
			jQuery(element).closest('.form-group').removeClass('has-error');
		},
		rules:{
			typeName:{required : true},
			},
		messages:{
			typeName : '请输入角色名',
		}
	});	
	$("#addtypeForm").on("submit",function(){
		var typeName = $("#typeName").val();
		if(typeName==""){
			alert("角色不能为空");
			return false;
		}else{
			return true;
		}
	});
	//验证角色名是否可用
	$("#typeName").on("blur",function(){
		var typeName = $(this).val();//获取用户输入的信息
		$.ajax({
			type:"get",
			url:$("#rootPath").val()+"/admin/typeServlet.do?opr=checkTypeName&typeName="+typeName,
			dataType:"text",
			success:function(result){
				var $info = $("#typeNameInfo");//获取提示信息的存储对象
				if(result=="true"){
					//可以使用
					$info.html("<i class=\"glyphicon glyphicon-ok\"></i> 分类名可用!");
					$info.css("color","green");
				}else{
					//角色名已存在，不可以使用
					$info.html("<i class=\"glyphicon glyphicon-remove\"></i> 分类名已存在!请更换分类名!");
					$info.css("color","red");
				}
			}
		});
	});
});