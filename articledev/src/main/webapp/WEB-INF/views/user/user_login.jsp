<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
@import url('css/login_form.css');
</style>
<!-- <script type="text/javascript" src="/js/styles.js"></script> -->
<%-- <script type="text/javascript" src='<c:url value="/js/jquery-2.1.4.js" />'></script> --%>
</script>
</head>
<body>
<div class="login-form">
<h1>Login</h1>
<form action="#">
        <input type="text" name="user_id" placeholder="user_id">
        <input type="password" name="user_pw" placeholder="user_pw">
        <span>
            <input type="checkbox" name="checkbox">
            <label for="checkbox">remember</label>
        </span>
        <input type="submit" value="log in">
    </form>
</div>
</form>
</body>
</html>
