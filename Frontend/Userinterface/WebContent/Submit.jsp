<%@page import="frontend.AppController,java.util.*,com.frequentis.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Submit</title>
</head>
<body>
<%
String eingabe = request.getParameter("Id_Flugzeug");
Map<String,String[]> params = request.getParameterMap();

out.println("Sie haben folgende ID eingegeben: " + eingabe);
AppController controller = AppController.getInstance();
try{
controller.handleInputData(params);
}
catch(Exception e)
{
	e.printStackTrace();
}
response.sendRedirect("FilterOutput.jsp");

%>
</body>
</html>