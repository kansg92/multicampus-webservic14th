<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
	* {
		margin:0;
		padding:0;
	}
	#div1{
		width:200px;
		height: 200px;
		border: 3px dashed red;
		border-radius: 5px;
		text-align: center;
		margin:20px 10px 5px 50px;
		background-color: beige;
		padding: 10px;
	}
	/* display:none -> ȭ�鿡�� �����. 
		visibility : hidden; -> ȭ�鿡�� ������ �����, block�� ȭ�鿡�� ����.
		display: inline-block -> inline�� ���α��̸� �����Ҽ� �հ�����.
	*/
	p {
		display: inline-block;
		width:100px;
		font-family: 'Koulen', cursive;
	}	
	span{
		font-family: 'Open Sans', sans-serif;
	}
	
</style>
</head>
<body>
	
	<span>span1</span><span>span2</span>
	<p>paragraph</p>
	<span>span3</span><span>span4</span>

	<h1>P159</h1>
	<div id="div1"><span>div box</span></div>
</body>
</html>