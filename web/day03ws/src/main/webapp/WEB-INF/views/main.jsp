<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>day03WS</title>
<style>
</style>
<link rel="stylesheet" href="css/main.css" >
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
	<aside id="left_aside">
		<div class="big_btn"><a href="#">I'm btn1</a></div>
		<div class="big_btn"><a href="#">I'm btn2</a></div>
		<div class="big_btn"><a href="#">I'm btn3</a></div>
		<div class="big_btn"><a href="#">I'm btn4</a></div>
	</aside>
	<aside id="center_aside">
		<article>
			<table id="table1">
				<thead>
					<tr><th>header1</th><th>header2</th><th>header3</th></tr>
				</thead>
				<tbody>
					<tr><td>hello1</td><td>hello2</td><td>hello3</td></tr>
					<tr><td>hello1</td><td>hello2</td><td>hello3</td></tr>
					<tr><td>hello1</td><td>hello2</td><td>hello3</td></tr>
				</tbody>
			</table>
		</article>
		<article></article>
	</aside>
	<aside id="right_aside">
		<div class="ad_section1">
			<a href ="https://web.dominos.co.kr"><img src="img/pizza1.png"></a>
		</div>
		<div class="ad_section1Text">
			<span >CLICK PIZZA</span>
		</div>
	</aside>
</section>
<footer></footer>
</body>
</html>