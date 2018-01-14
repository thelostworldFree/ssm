<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
 <div style="width:500px;margin:0px auto;text-align:center">
	<table align='center' border='1' cellspacing='0'>
	    <tr>
	           <th>id</th>
	           <th>名字</th>
			   <th>描述</th>
			   <th>类型</th>
			   <th>存在与否</th>
	        <td>编辑</td>
	        <td>删除</td>
	    </tr>
	    <c:forEach items="${cs}" var="c" varStatus="st">
	        <tr>
	            <td>${c.t_id}</td>
	            <td>${c.name}</td>
	            <td>${c.words}</td>
	            <td>${c.types}</td>
	            <td>${c.exist}</td>
	            <td><a href="editCategory?t_id=${c.t_id}">编辑</a></td>
	            <td><a href="deleteCategory?t_id=${c.t_id}">删除</a></td>
	        </tr>
	    </c:forEach>
	</table>
	<div style="text-align:center">
		<a href="?start=0">首  页</a>
		<a href="?start=${page.start-page.count}">上一页</a>
		<a href="?start=${page.start+page.count}">下一页</a>
		<a href="?start=${page.last}">末  页</a>
	</div>
	
	
	<div style="text-align:center;margin-top:40px">
		
		<form method="get" action="addCategory">
			名字: <input name="name" value="" type="text"> <br><br>
			描述: <input name="words" value="" type="text"> <br><br>
			类型: <input name="types" value="" type="text"> <br><br>
			状态: <input name="exist" value="" type="text">  <br><br>
			<input type="submit" value="增加对象">
		</form>

	</div>	
 </div>
