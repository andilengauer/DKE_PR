<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Area</title>
<link rel="stylesheet" href="Design.css">
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<link rel="stylesheet" href="https://openlayers.org/en/v3.20.1/css/ol.css" type="text/css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="https://openlayers.org/en/v3.20.1/build/ol.js"></script>
<script>
 $(function() {
     $( "#datepicker1_Abflugflughafen" ).datepicker({
         showOn: "both",
         buttonImage: "Kalender.png",
         buttonImageOnly: true,
         buttonText: "Kalender",
         dateFormat: 'dd-mm-yy'  
     });
 });
 
 $(function() {
     $( "#datepicker2_Abflugflughafen" ).datepicker({
    	 showOn: "both",
         buttonImage: "Kalender.png",
         buttonImageOnly: true,
         buttonText: "Kalender",
         dateFormat: 'dd-mm-yy'  
     });
 });
 
 $(function() {
     $( "#datepicker3_Area" ).datepicker({
    	 showOn: "both",
         buttonImage: "Kalender.png",
         buttonImageOnly: true,
         buttonText: "Kalender",
         dateFormat: 'dd-mm-yy'  
     });
 });
 
 $(function() {
     $( "#datepicker4_Area" ).datepicker({
    	 showOn: "both",
         buttonImage: "Kalender.png",
         buttonImageOnly: true,
         buttonText: "Kalender",
         dateFormat: 'dd-mm-yy'  
     });
 });
 
 $(function() {
     $( "#datepicker5_Segment" ).datepicker({
    	 showOn: "both",
         buttonImage: "Kalender.png",
         buttonImageOnly: true,
         buttonText: "Kalender",
         dateFormat: 'dd-mm-yy'  
     });
 });
 
 $(function() {
     $( "#datepicker6_Segment" ).datepicker({
    	 showOn: "both",
         buttonImage: "Kalender.png",
         buttonImageOnly: true,
         buttonText: "Kalender",
         dateFormat: 'dd-mm-yy'  
     });
 });
 
 $(function() {
     $( "#datepicker7_Zielflughafen" ).datepicker({
    	 showOn: "both",
         buttonImage: "Kalender.png",
         buttonImageOnly: true,
         buttonText: "Kalender",
         dateFormat: 'dd-mm-yy'  
     });
 });
 
 $(function() {
     $( "#datepicker8_Zielflughafen" ).datepicker({
    	 showOn: "both",
         buttonImage: "Kalender.png",
         buttonImageOnly: true,
         buttonText: "Kalender",
         dateFormat: 'dd-mm-yy'  
     });
 });
</script>
</head>
<body>
<form action="FilterInput.jsp">
				<fieldset id="Fieldset_Area">
					<legend id="Legend_Area">Area</legend><br>
					<label> ID:</label>
					<input type="text" name="Id_Area" id="Id_Area"><br>
					<label name="Label_Datum_Anfang_Area" id="Label_Datum_Anfang_Area">Startdatum:</label>
					<input type="text" name="Datum_Anfang_Area" id="datepicker3_Area">
					<label name="Label_Uhrzeit_Anfang_Area" id="Label_Uhrzeit_Anfang_Area">Startuhrzeit:</label>
					<input type="text" name="Uhrzeit_Anfang_Area" id="Textfield_Uhrzeit_Anfang_Area" placeholder="example: 15:30"><br>
					<label name="Label_Datum_Ende_Area" id="Label_Datum_Ende_Area">Endedatum:</label>
					<input type="text" name="Datum_Ende_Area" id="datepicker4_Area">
					<label name="Label_Uhrzeit_Ende_Area" id="Label_Uhrzeit_Ende_Area">Endeuhrzeit:</label>
					<input type="text" name="Uhrzeit_Ende_Area" id="Textfield_Uhrzeit_Ende_Area" placeholder="example: 17:30"><br>
					<label name="Flugregeln_Area" id="Flugregeln_Area">Flugregeln:</label>
					<select onClick="this.form.Textfield_Auswahl_Flugregeln_Area.value=this.options[this.selectedIndex].text;"name="Flugregeln_Area" id="Auswahl_Flugregeln_Area">
 						<option value="IFR">IFR</option>
  						<option value="VFR">VFR</option>
					</select><br><br>
					<input type="hidden" name="Textfield_Auswahl_Flugregeln_Area"></input>
					<label name="Wetterbedingungen_Area" id="Wetterbedingungen_Area">Wetterbedingungen:</label>
					<select onClick="this.form.Textfield_Auswahl_Wetterbedingungen_Area.value=this.options[this.selectedIndex].text;" name="Wetterbedingungen_Area" id="Auswahl_Wetterbedingungen_Area">
 						<option value="IMC">IMC</option>
  						<option value="VMC">VMC</option>
					</select> 
					<input type="hidden" name="Textfield_Auswahl_Wetterbedingungen_Area"></input>
				</fieldset><br>
				
				<input type="submit" id="Startseite" value="Zurück zur Startseite"></input>
			</form>
				
				

</body>
</html>