<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>never register page</title>
<style>
	h1>a{
		color:coral;
	}
</style>
</head>
<body>
	<h1><a href="/">NEVER</a></h1>
	<form action="register" method="post">
	<fieldset>
		<legend>ȸ������</legend>
		ID<br><input type="text" placeholder="input ID" name="id" required><br>
		PWD<br><input type="password" placeholder="input password" name="pwd" required><br>
		PWDCHECK<br><input type="password" placeholder="input password" name="pwdcheck" required><br>
		NAME<br><input type="text" placeholder="input name" name="name" required><br>
		BIRTH<br><input type="date" name="birth" required><br>
		GENDER<br>
		<select name="gender">
			<option value="male">male</option>
			<option value="female">male</option>
		</select><br>
		Check e-mail<br>
		<input type="email" placeholder="input e-mail" name="email"><br>
		Phone<br>
		<input type="tel" placeholder="010-xxxx-xxxx" name="phone"
		pattern="[0-1]{3}-[0-9]{4}-[0-9]{4}" required><small>Format:010-1234-4567</small><br>
		
		HOBBY<br>
		<!-- checkbox : n���� n�� ���� ����.(���콺 üũ���ؼ�) ���߼���O -->			
		<input type="checkbox" name="hobby" value="study">Study<br>
		<input type="checkbox" name="hobby" value="train">Train<br>
		<input type="checkbox" name="hobby" value="eating">Eat<br>
	</fieldset>
	<!-- submit : ������ ������..  -->
	<input type="submit" value="REGISTER">
	<!-- reset : �ۼ��� ���� ��� �����.  -->
	<input type="reset" value="RESET">
	</form>	
	
</body>
</html>