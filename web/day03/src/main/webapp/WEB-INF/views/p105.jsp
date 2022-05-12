<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>p105</title>
<style>
	<!-- * : body태그 전체 css적용. -->
	* {
		margin:0px;
		padding:0px;
	}
	h1 {
		color:red;
		background-color:gray;
	}
	#hh1 {
		color:coral;
		background-color:beige;
	}
	.c1 {
		color:orange;
		background-color:green;
	}
	a, p {
		color : red;
	}
	a:hover{
		color:white;
		background-color:red;
	}
</style>
</head>
<body>
	<h1>p105</h1>
	<h1 id="hh1">Header1</h1>
	<h1 class="c1">Header1</h1>
	<h2>Header2</h2>
	<h2 class="c1">Header2</h2>
	<a href="#">Click</a>
	<span class="c1">Span1</span>
	<span>Span2</span>
	<p>Paragraph</p>
</body>
</html>