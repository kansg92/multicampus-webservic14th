<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>p135</title>
<style>
	input[type="text"]{
		background-color:green;
		color:coral;
	}
	input[type="submit"]:hover{
		background-color:green;
		color:coral;
	}
	input:focus{
		background-color:coral;
		color:green;
	}
</style>
</head>
<body>
	<h1>Hello P135</h1>
	<form>
		ID<input type="text" name="id"><span>Mandatory</span><br>
		PWD<input type="password" name="pwd"><span>Mandatory</span><br>
		<input type="submit" value="login"><span>Mandatory</span><br>
	</form>
</body>
</html>