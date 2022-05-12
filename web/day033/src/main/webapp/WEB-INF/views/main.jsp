<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
/* Global CSS start................................... */
*{
	margin:0;
	padding:0;
}
a{
	text-decoration: none;
	color:black;
}
ul,ol{
	list-style: none;
}
/* Global CSS end................................... */

/* header CSS start................................... */
header{
	width:600px;
	height:100px;
	background-color: green;
	margin:0 auto;
}

header > h1{
	text-align: center;
	line-height: 100px;
}
/* header CSS end................................... */

/* nav CSS start................................... */
nav{
	width:600px;
	height:40px;
	background-color: orange;
	margin:0 auto;
}
nav > ul {
	width:500px;
	margin:0 auto;
}
nav > ul > li {
	float:left;
	width: 25%;
	line-height: 40px;
}
nav > ul > li > a{
	display: block;
	text-align:center;
}

/*nav CSS end................................... */

/* section CSS start................................... */
section{
	width:600px;
	height:500px;
	background-color: gray;
	margin:0 auto;
}
section > aside{
	float:left;
}
section > #left_aside{
	width:100px;
	height:500px;
	background-color: yellow;
}
section > #center_aside{
	width:400px;
	height:500px;
	background-color: beige;
}
section > #right_aside{
	width:100px;
	height:500px;
	background-color: gray;
}

/* section CSS end................................... */

/* footer CSS start................................... */
footer{
	width:600px;
	height:40px;
	background-color: black;
	margin:0 auto;
}
/* footer CSS end................................... */




</style>
</head>
<body>
<header>
	<h1>HTML5 & CSS3.0</h1>
</header>
<nav>
	<ul>
		<li><a href="#">HTML5</a></li>
		<li><a href="#">CSS3</a></li>
		<li><a href="#">javscript</a></li>		
		<li><a href="#">Ajax</a></li>	
	</ul>
</nav>
<section>
	<aside id="left_aside"></aside>
	<aside id="center_aside"></aside>
	<aside id="right_aside"></aside>
</section>
<footer></footer>
</body>
</html>