<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
.box{
	width:100px;
	height:100px;
	position:absolute;
	/* float:right; */
}
.box:nth-child(1){
	background-color: red;
	left:10px;
	top:10px;
	z-index:100;
}
.box:nth-child(2) {
	background-color: green;	
	left:50px;
	top:50px;
	z-index:10;
}
.box:nth-child(3) {
	background-color: orange;	
	left:90px;
	top:90px;
	z-index:20;
}

</style>
</head>
<body>
	<div class="box"></div>
	<div class="box"></div>
	<div class="box"></div>
</body>
</html>