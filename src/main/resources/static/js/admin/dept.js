$(function(){
	loadLeaf(0,$("#all"));//初始化一级栏目
	//jquery事件委托 好处：未出生的元素出生后也可以同时拥有这个方法。
    $('.tree').on('click','li.parent_li > span', function (e) {
    	$("#editDeptName").text($(this).attr("data-pname"));//用于新增修改删除
    	$("#deptId").val($(this).attr("data-cid"));//用于新增修改删除  这里稍作修改，，原来是pid因为新增要用所有这里把pId 改成cid表示当前栏目的Id
    	$("#pId").val($(this).attr("data-pid"));
    	var children = $(this).parent('li.parent_li').find(' > ul > li');
        if (children.is(":visible")) {
            children.hide('fast');
            $(this).find(' > i').addClass('glyphicon-plus').removeClass('glyphicon-minus');
        } else {
            $(this).next().remove();//避免重复追加子代
            var pid = $(this).attr("data-cid");//这里稍作修改，，原来是pid因为新增要用所有这里把pId 改成cid表示当前栏目的Id
	    	loadLeaf(pid,$(this));
            children.show('fast');
            $(this).find(' > i').addClass('glyphicon-minus').removeClass('glyphicon-plus');
        }
    	
        e.stopPropagation();
    });
});
//加载子节点
function loadLeaf(pid,obj){
	$.ajax({
		url:$("#rootPath").val()+"/admin/deptServlet.do",
		type:"get",
		data:{"pid":pid,"opr":"findleaf"},
	dataType:"json",
	success:function(result){
		var html="<ul>";
		$(result).each(function(){
			html+="<li>"
				+"<span data-cid=\""+this.id+"\"  data-pid=\""+this.pId+"\" data-pname=\""+this.deptName+"\"><i class=\"glyphicon glyphicon-plus\"></i> "+this.deptName
				+"</span></li>";
		});
		$(obj).after(html+"</ul>");	
	    $('.tree li').addClass('parent_li');
	}
	});
}
$(function(){
	//添加子节点
	$("#add").on("click",function(){
		var cId = $("#deptId").val();//当前栏目的Id是其子栏目的父id
		var deptName = $("#deptName").val();
		var pId = $("#pId").val();
		$.ajax({
			 url:$("#rootPath").val()+"/admin/deptServlet.do",
			 type:"get",
			 data:{"pid":cId,"opr":"addChildLeaf","deptName":deptName},
			 dataType:"text",
			 success:function(result){
				 if(result=="true"){
					 $("span[data-cid="+cId+"]").click();//新增让当前节点单击，就可以刷新新增的子节点
					 $("#editDeptName").text("");
					 $("#deptId").val("");//操作完要清空避免重复
					 $("#deptName").val("");
					 $("#pId").val("");
				 }
			}
		});
	});
	//编辑当前节点
	$("#editCurrDept").on("click",function(){
		var cId = $("#deptId").val();//修改当前栏目要传当前栏目的id到数据库去查
		var deptName = $("#deptName").val();
		var pId = $("#pId").val();
		$.ajax({
			 url:$("#rootPath").val()+"/admin/deptServlet.do",
			 type:"get",
			 data:{"cId":cId,"opr":"editCurrDept","deptName":deptName},
			 dataType:"text",
			 success:function(result){
				 if(result=="true"){
					 var $p=$("span[data-cid="+pId+"]");//修改需要刷新当前节点的父节点，才可以看到修改后的当前节点
					 $p.next().remove();//避免重复追加子代
		             var pid = $p.attr("data-cid");//这里稍作修改，，原来是pid因为新增要用所有这里把pId 改成cid表示当前栏目的Id
			    	 loadLeaf(pid,$p);
					 $("#editDeptName").text("");
					 $("#deptId").val("");//操作完要清空避免重复
					 $("#deptName").val("");
					 $("#pId").val("");
				 }
			}
		});
	});
	//删除当前节点
	$("#delok").on("click",function(){
		var cId = $("#deptId").val();//删除当前栏目要传当前栏目的id到数据库去查
		var pId = $("#pId").val();
		$.ajax({
			 url:$("#rootPath").val()+"/admin/deptServlet.do",
			 type:"get",
			 data:{"cId":cId,"opr":"delCurrDept"},
			 dataType:"text",
			 success:function(result){
				 if(result=="true"){
					 var $p=$("span[data-cid="+pId+"]");//删除需要刷新当前节点的父节点，才可以看到当前节点被删除
					 $p.next().remove();//避免重复追加子代
		             var pid = $p.attr("data-cid");//这里稍作修改，，原来是pid因为新增要用所有这里把pId 改成cid表示当前栏目的Id
			    	 loadLeaf(pid,$p);
					 $("#editDeptName").text("");
					 $("#deptId").val("");//操作完要清空避免重复
					 $("#deptName").val("");
					 $("#pId").val("");
				 }
			}
		});
	});
});