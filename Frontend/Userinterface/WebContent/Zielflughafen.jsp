<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Zielflughafen</title>
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
<<<<<<< .merge_file_IKyeFK
=======
<!-- 	Im nachfolgenden wird ein Fieldset generiert.
		In diesem Fieldset werden die Eingabefelder, Labels, Auswahllisten, Datepickers und Button definiert.
		Der Datepicker ist eine Hilfestellung zur leichteren Auswahl eines Datums. Der Datepicker wird über ein CSS-File
		und ein Java-Script-File im Header eingebunden.
		Der Button dient dazu, dass wieder auf die Startseite zurückgesprungen werden kann.
-->
>>>>>>> .merge_file_CBd2MP
			<form action="FilterInput.jsp">
				<fieldset id="Fieldset_Zielflughafen">
					<legend id="Legend_Zielflughafen">Zielflughafen</legend><br>
					<label> ID:</label>
					<input type="text" name="Id_Zielflughafen" id="Id_Zielflughafen"><br>
					<label name="Label_Datum_Anfang_Zielflughafen" id="Label_Datum_Anfang_Zielflughafen">Startdatum:</label>
					<input type="text" name="datepicker7_Zielflughafen" id="datepicker7_Zielflughafen">
					<label name="Label_Uhrzeit_Anfang_Zielflughafen" id="Label_Uhrzeit_Anfang_Zielflughafen">Startuhrzeit:</label>
					<input type="text" name="Textfield_Uhrzeit_Anfang_Zielflughafen" id="Textfield_Uhrzeit_Anfang_Zielflughafen" placeholder="example: 15:30"><br>
					<label name="Label_Datum_Ende_Zielflughafen" id="Label_Datum_Ende_Zielflughafen">Endedatum:</label>
					<input type="text" name="datepicker8_Zielflughafen" id="datepicker8_Zielflughafen">
					<label name="Label_Uhrzeit_Ende_Zielflughafen" id="Label_Uhrzeit_Ende_Zielflughafen">Endeuhrzeit:</label>
					<input type="text" name="Textfield_Uhrzeit_Ende_Zielflughafen" id="Textfield_Uhrzeit_Ende_Zielflughafen" placeholder="example: 17:30"><br>
					<label name="Flugregeln_Zielflughafen" id="Flugregeln_Zielflughafen">Flugregeln:</label>
					<select onClick="this.form.Textfield_Auswahl_Flugregeln_Zielflughafen.value=this.options[this.selectedIndex].text;" name="Auswahl_Flugregeln_Zielflughafen" id="Auswahl_Flugregeln_Zielflughafen">
 						<option value="IFR">IFR</option>
  						<option value="VFR">VFR</option>
					</select><br><br>
					<input type="hidden" name="Textfield_Auswahl_Flugregeln_Zielflughafen"></input>
					<label name="Wetterbedingungen_Zielflughafen" id="Wetterbedingungen_Zielflughafen">Wetterbedingungen:</label>
					<select onClick="this.form.Textfield_Auswahl_Wetterbedingungen_Zielflughafen.value=this.options[this.selectedIndex].text;" name="Auswahl_Wetterbedingungen_Zielflughafen" id="Auswahl_Wetterbedingungen_Zielflughafen">
 						<option value="IMC">IMC</option>
  						<option value="VMC">VMC</option>
					</select> 
					<input type="hidden" name="Textfield_Auswahl_Wetterbedingungen_Zielflughafen"></input>
				</fieldset><br>
				
				<input type="submit" id="Startseite" value="Zurück zur Startseite"></input>
			</form>

</body>
</html>