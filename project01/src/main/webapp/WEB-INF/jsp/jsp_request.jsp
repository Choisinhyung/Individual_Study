<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>request 객체</title>
</head>
<body>
	<h2>getMethod()</h2>
	<p>
		request.getMethod() <%= request.getMethod() %>
	</p>
	<form action = "./jsp_request" method = "get">
		<button type = "submit">GET 전송</button>
	</form>
	<form action = "./jsp_request" method = "post">
		<button type = "submit">POST 전송</button>
	</form>
	<hr>
	<h2>getParameter(name)</h2>
	<p>
		request.getParameter(name) : <%= request.getParameter("param_name") %>
	</p>
	<form action = "./jsp_request" method = "get">
		<div>
			<input type = "text" name = "param_name">
		</div>
		<div>
			<button type = "submit">전송</button>
		</div>
	</form>
	<hr>
	<h2>getParameterValues(name)</h2>
	<p>
		request.getParameterValues(name) : <%= request.getParameterValues("param_check") %>
	</p>
	<form action = "./jsp_request" method = "get">
		<div>
			<input type = "checkbox" value = "a" name = "param_check">
			<input type = "checkbox" value = "b" name = "param_check">
			<input type = "checkbox" value = "c" name = "param_check">
			<input type = "checkbox" value = "d" name = "param_check">
		</div>
		<div>
			<button type = "submit">전송</button>
		</div>
	</form>
	<hr>
	<h2>getParameterValues(name)</h2>
	<p>
		request.getParameterValues(name) : 
		<%
			if(request.getParameterValues("param_chk") != null) {
		%>
			<%=Arrays.asList(request.getParameterValues("param_chk")) %>
		<%
			}
		%>
		<br>a
		name 은 input 태그 등에 사용하는 name 속성의 값을 지칭한다.
	</p>
	<form action="./jsp_request" method="get">
		<div>
			<input type="checkbox" value="a" name="param_chk">
			<input type="checkbox" value="b" name="param_chk">
			<input type="checkbox" value="c" name="param_chk">
			<input type="checkbox" value="d" name="param_chk">
		</div>
		<div>
			<button type="submit">전송</button>
		</div>
	</form>
	<hr>
</body>
</html>