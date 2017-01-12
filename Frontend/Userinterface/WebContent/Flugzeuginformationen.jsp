<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.frequentis.semnotam.pr.AircraftTypeType"%>
<%@page import="com.frequentis.semnotam.pr.AerodromeType"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Flugzeuginformationen</title>
<link rel="stylesheet" href="Design.css">
</head>
<body>
	<form action="FilterInput.jsp">
		<fieldset id="Fieldset_Flugzeuginformationen">
			<legend id="Legend_Flugzeuginformationen">Flugzeuginformationen</legend><br>
			<label>ID:</label> 
			<input type="text" name="Id_Flugzeug" id="Id_Flugzeug"><br>
			<label>Typ:</label>
			<select onClick="this.form.Typ_Flugzeug.value=this.options[this.selectedIndex].text;" name="Typ_Flugzeug" id="Typ_Flugzeug">
 				<option value=<%=AircraftTypeType.HELICOPTER %>><%=AircraftTypeType.HELICOPTER %></option>
  				<option value=<%=AircraftTypeType.LANDPLANE %>><%=AircraftTypeType.LANDPLANE %></option>
			</select><br>
			<label>Spannweite:</label>
			<input type="text" name="Spannweite_Flugzeug" id="Spannweite_Flugzeug"><br>
			<label>Maximalgewicht:</label>
			<input type="text" name="Maximalgewicht_Flugzeug" id="Maximalgewicht_Flugzeug"><br>
			<label>Minimalgewicht:</label>
			<input type="text" name="Minimalgewicht_Flugzeug" id="Minimalgewicht_Flugzeug"><br>
		</fieldset><br>
		<input type="submit" id="Startseite" value="Zurück zur Startseite"></input>
		
	</form>

</body>
</html>