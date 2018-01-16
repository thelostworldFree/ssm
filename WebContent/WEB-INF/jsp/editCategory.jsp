<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
 <div style="width:500px;margin:0px auto;text-align:center">
	
	
	<div style="text-align:center;margin-top:40px">
		
		<form method="put" action="putCategory">
			名字: <input name="name" value="${c.name}" type="text"> <br><br>
			描述: <input name="words" value="${c.words}" type="text"> <br><br>
			类型: <input name="types" value="${c.types}" type="text"> <br><br>
			状态: <input name="exist" value="${c.exist}" type="text">  <br><br>
			<input type="hidden" value="${c.t_id}" name="t_id">
			
			<input type="submit" value="修改分类">
		</form>

	</div>	
 </div>
