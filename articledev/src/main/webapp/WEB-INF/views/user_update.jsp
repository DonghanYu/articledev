<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
@IMPORT url("../js/jquery-ui/jquery-ui.css");
</style>
<script src="../js/jquery-2.1.4.js"></script>
<script src="../js/jquery-ui/jquery-ui.js"></script>
</head>
<body>
	<form:form action="update" method="post">
		<table border="1px">
			<caption>Update info</caption>
			<tr>
				<th>email</th>
				<td><input type="hidden" name="user_nick"
					value="${userVO.user_id}" /></td>

			</tr>

			<tr>
				<th>nickname</th>
				<td><input type='text' name='user_nick' id='user_nick' size="27px"  value="${userVO.user_nick}"/>
					<div id='check_id_result'>
						<br />
					</div>
				</td>
			</tr>
			<tr>
				<th>password</th>
				<td><input type='password' name='user_pw' id='user_pw'
					size="27px" placeholder="input your password" /></td>
			</tr>

			<tr>
				<th>confirm password</th>
				<td><input type='password' name='user_pw_confirm'
					id='user_pw_confirm' size="27px"
					placeholder="input your password again" /></td>
			</tr>


			<tr>
				<td colspan='2' align="center"><input type='button'
					value='CANCEL' id="btnCancel" /> <input type='submit'
					value='SUBMIT' id="btnRegistOk" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>