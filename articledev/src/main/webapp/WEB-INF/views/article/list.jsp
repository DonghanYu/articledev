<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <style type="text/css">
@import url('<c:url value="/resources/css/table.css"/>');
</style> -->
</head>
<body>
<table style="width: 750px;'">
<tr>
<td colspan="7" align="left">
<input type="button" value="white">
</td>
</tr>
<tr>
	<th>no</th>
	<th>section</th>
	<th>category</th>
	<th>title</th>
	<th>name</th>
	<th>count</th>
	<th>like</th>
</tr>
<c:forEach items="${list}" var="vo" varStatus="vs">
<tr>
	<td>${vo.no}</td>
	<td><a href="${vo.sno}">${vo.sno}</a></td>
	<td>${vo.cno}</td>
	<td>${vo.user_id}</td>
	<td>${vo.count}</td>
	<td>${vo.like}</td>
</tr>
</c:forEach>
</table>

<form>
	<select name="section">
		<optgroup label="SECTION">
			<option>OPINION</option>
			<option>NEWS</option>
		</optgroup>
	</select>
<select name="category">
		<optgroup label="CATEGORY">
		<option>POLITICS</option>
		<option>ECONOMICS</option>
		<option>SOCIETY</option>
		<option>CULTURE</option>
		<option>IT</option>
		</optgroup>
	</select>
<input type="text">
<input type="submit" value="OK">
</form>


</body>
</html>