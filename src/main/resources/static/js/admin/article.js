$(function(){
	jQuery("#addarticleForm").validate({
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
			title : '请输入标题',
			summary :  '请输入摘要'
		}
	});	
	$("#addarticleForm").on("submit",function(){
		var categoryId = $("#categoryId").val();
		var typeId = $("#typeId").val();
		if(categoryId==""){
			alert("栏目不能为空");
			return false;
		}else if(typeId==""){
			alert("分类不能为空");
			return false;
		}else{
			return true;
		}
	});
	//验证用户名是否可用
	$("#title").on("blur",function(){
		var title = $(this).val();//获取用户输入的信息
		$.ajax({
			type:"get",
			url:$("#rootPath").val()+"/admin/articleServlet.do?opr=checkTitle&title="+title,
			dataType:"text",
			success:function(result){
				var $info = $("#titleInfo");//获取提示信息的存储对象
				if(result=="true"){
					//可以使用
					$info.html("<i class=\"glyphicon glyphicon-ok\"></i> 标题可用!");
					$info.css("color","green");
				}else{
					//用户名已存在，不可以使用
					$info.html("<i class=\"glyphicon glyphicon-remove\"></i> 标题已存在!请更换标题!");
					$info.css("color","red");
				}
			}
		});
	});
});