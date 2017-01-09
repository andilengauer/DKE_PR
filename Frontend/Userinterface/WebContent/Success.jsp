<%@page import="frontend.AppController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Success</title>
</head>
<body>
<%
String eingabe = request.getParameter("Id_Flugzeug");

out.println("Sie haben folgende ID eingegeben: " + eingabe);
AppController controller = AppController.getInstance();
controller.setCurrentId(eingabe);

response.sendRedirect("FilterOutput.jsp");
%>
</body>
</html>