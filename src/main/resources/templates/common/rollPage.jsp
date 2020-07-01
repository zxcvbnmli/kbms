<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!-- 工具：首页，下一页，上一页，尾页 -->
<script type="text/javascript">
		function page_nav(num){
			$("#pageIndex").val(num);
			$("#pageForm").submit();
			
		}
		function jump_to(pageIndex){
			var pageIndex = $("#goPage").val();
			var regexp = /^[1-9]\d*/;
			var totalPage = $("#totalPageCount").val();
			if(!regexp.test(pageIndex)){
				alart("请输入正确的数字");
				return false;
			}
			else if((pageIndex-totalPage)>0){
				alart("总页码一共"+totalPage+"页，请输入正确的页码");
			}
			else{
				page_nav(pageIndex);
			}
		}
	</script>
<ul class="pagination pagination-split">
	<li><span>第${param.currPage}页/共${param.totalPageCount}页</span></li>
	<li <c:if test="${param.currPage <= 1}"> class="disabled"</c:if>>
		<a href="javascript:page_nav(1)">首页</a>
	</li>
	<li <c:if test="${param.currPage <= 1}"> class="disabled"</c:if>>
		<a href="javascript:page_nav(${param.currPage-1})">上一页</a>
	</li>
	<c:forEach var="item" items="${param.pagerNums}"> <!-- 中间数字[1 2 3 4 5] -->
		<c:set var="itemshow" value="${fn:trim(fn:replace(fn:replace(item,'[',''),']',''))}"/>
		<li>
			<a href="javascript:page_nav(${itemshow})" <c:if test="${param.currPage == itemshow}"> class="current"</c:if>>${itemshow}</a>
		</li>
	</c:forEach>
	<li <c:if test="${param.currPage>=param.totalPageCount}"> class="disabled" </c:if> >
		<a href="javascript:page_nav(${param.currPage+1})">下一页</a>
	</li>
	<li <c:if test="${param.currPage>=param.totalPageCount}"> class="disabled" </c:if>>
		<a href="javascript:page_nav(${param.totalPageCount})">尾页</a>
	</li>
	<li>
		<span>跳转至</span>
	</li>
	<li>
		<input type="text" class="form-control" size="1" id="goPage"/>
	</li>
	<li>
		<span>页</span>
		<a onclick="jump_to();">Go</a>
	</li>
</ul>
