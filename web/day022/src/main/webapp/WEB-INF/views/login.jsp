<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Never login page</title>
<style>
	h1>a{
		color:coral;
	}
</style>

</head>
<body>
	<h1><a href="/">NEVER</a></h1>
	<form action="login" method="post">
	<fieldset>
		<legend>LOGIN</legend>
		<input type="text" name="id" placeholder="Input ID" required><br>
		<input type="password" name="pwd" placeholder="Input password" required><br>
		<input class="sub" type="submit" name="submit" value="Login" onclick="go()">
	</fieldset>
	
	</form>
</body>
</html>