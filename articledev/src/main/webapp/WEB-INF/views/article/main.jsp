<%@ page contentType="text/html; charset=UTF-8" language="java"
	import="java.sql.*" errorPage=""%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<!-- TemplateBeginEditable name="doctitle" -->
<title>Untitled Document</title>
<!-- TemplateEndEditable -->
<!-- TemplateBeginEditable name="head" -->
<!-- TemplateEndEditable -->
<style type="text/css">
<!--
body {
	font: 100%/1.4 "Noto Sans CJK TC Black", "Noto Sans CJK TC Bold",
		"Noto Sans CJK TC DemiLight", "Noto Sans CJK TC Light",
		"Noto Sans CJK TC Medium", "Noto Sans CJK TC Regular",
		"Noto Sans CJK TC Thin", cursiveVerdana, Arial, Helvetica, sans-serif;
	background-color: #323D49;
	margin: 0;
	padding: 0;
	color: #000;
}

ul, ol, dl {
	color: #FFF padding: 50;
	margin: 50;
}

h1, h2, h3, h4, h5, h6, p {
	margin-top: 0;
	padding-right: 15px;
	padding-left: 15px;
}

a img {
	border: none;
}

a:link {
	color: #42413C;
	text-decoration: underline;
}

a:visited {
	color: #6E6C64;
	text-decoration: underline;
}

a:hover, a:active, a:focus {
	text-decoration: none;
}

.container {
	width: 960px;
	background-color: #323D49;
	margin: 0 auto;
}

.header {
	background-color: #323D49
}

.sidebar1 {
	float: left;
	width: 180px;
	background-color: #323D49;
	color: #FFF;
	font-size: 15px;
	font-weight: bold;
	text-height: 30px;
	text-align: center;
}

.content {
	padding: 10px 0;
	width: 780px;
	float: left;
	background-color: #313D48;
}

.content ul, .content ol {
	padding: 10px 15px 15px 15px;
}

ul.nav {
	list-style: none;
}

ul.nav li {
	border-bottom: 1px solid;
	padding: 10px;
}

ul.nav a, ul.nav a:visited {
	padding: 0px;
	display: block;
	width: 100px;
	text-decoration: none;
	color: #FFF;
}

ul.nav a:hover, ul.nav a:active, ul.nav a:focus {
	background-color: #262E39;
}

/* ~~ The footer ~~ */
.footer {
	position: relative;
	clear: both;
	color: #FFF;
	font-size: 15px;
	text-align: center;
	background-color: #434e60;
}

.fltrt {
	float: right;
	margin-left: 8px;
}

.fltlft {
	float: left;
	margin-right: 8px;
}

.clearfloat {
	clear: both;
	height: 0;
	font-size: 1px;
	line-height: 0px;
}
</style>

</head>
<body>
	<div style="height: 40px"></div>
	<div class="container">
		<div class="header">
			<a href="#"> <img src="img/topmenu.png" width="960" height="90" usemap="#Insert_logoMap"
				style="background-color: #C6D580; display: block;" border="0" />
				<map name="Insert_logoMap" id="Insert_logoMap">
					<area id="all" shape="rect" coords="400,43,500,88" href="#" onfocus="this.blur();"/>
					<area id="news" shape="rect" coords="530,44,630,89" href="#" onfocus="this.blur();"/>
					<area id="opinion" shape="rect" coords="663,44,762,96" href="#" onfocus="this.blur();"/>
					<area shape="rect" coords="13,3,297,89" href="#" />
					<area shape="rect" coords="294,85,298,86" href="#" />
				</map>
			</a>
			<!-- end .header -->
		</div>
		<div class="sidebar1">
			<div style="height: 50px"></div>
			<ul class="nav">
				<li><a href="#">POLITICS</a></li>
				<li><a href="#">ECONOMICS</a></li>
				<li><a href="#">SOCIETY</a></li>
				<li><a href="#">CULTURE</a></li>
				<li><a href="#">IT</a></li>
			</ul>
		</div>
	</div>


	<div class="content">
		<p>&nbsp;</p>
	</div>

	<div class="container">
		<iframe src="list.jsp" width="775px" height="400px" frameborder="1">
		</iframe>
	</div>
	<div class="footer">
		<p>언론으로부터 우리를 지켜주는 ㅣ 우리의 기사</p>
		<!-- end .footer -->
	</div>
	<!-- end .container -->
</body>
</html>
