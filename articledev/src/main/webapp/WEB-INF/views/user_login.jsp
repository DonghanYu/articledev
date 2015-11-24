<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
@import url('./css/site.css');
</style>
<script type="text/javascript" src='<c:url value="/js/jquery-2.1.4.js" />'></script>
<script type="text/javascript" src='<c:url value="/js/regist.js" />'></script>

</script>
</head>
<body>

<form id='regist' method='post' >  	
	<table border='1'>
		<caption>Login</caption>
		<tr>
			<th>e-mail</th>
			<td><input type='text' name='user_id' id='user_id' size="27px" placeholder="input your e-mail"/>
				<div id='check_name_result'	><br/></div>
				</td>
		</tr>
		<tr>
			<th>password</th>
			<td><input type='password' name='user_pw' id='user_pw' size="27px" placeholder="input your password"/>
				</td>
		</tr>
		
		<tr>
			<td colspan='2' align="center" >
			
			<input  type='button'  value='CANCEL' id="btnCancel" />
			
			<input type='submit'  value='SUBMIT' id="btnLogin" />
			</td>
		</tr>
	</table>
</form>
</body>
</html>
