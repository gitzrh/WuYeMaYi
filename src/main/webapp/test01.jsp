<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	%>
	
<title>Insert title here</title>
<script type="text/javascript" src="${APP_PATH }/static/jquery-2.0.3.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("a").click(function(){
			
			window.location.href="${APP_PATH }/toadmin";
		})
	})

</script>
</head>

<body>

	
	<a>To Admin</a>
	
</body>
</html>