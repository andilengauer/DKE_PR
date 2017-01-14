<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Abflugflughafen</title>
<link rel="stylesheet" href="Design.css">
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<link rel="stylesheet" href="https://openlayers.org/en/v3.20.1/css/ol.css" type="text/css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="https://openlayers.org/en/v3.20.1/build/ol.js"></script>
<script>
//Hier sind die Funktionen, welche den Datepicker realisieren, implementiert
 $(function() {
     $( "#datepicker1_Abflugflughafen" ).datepicker({
         showOn: "both",	//Mit "both" ist es möglich, dass der Kalender angezeigr wird, wenn man auf das Kalender-Icon drückt oder auf das Textfeld
         buttonImage: "Kalender.png",	//Ist das eigentliche Kalender-Icon
         buttonImageOnly: true,	//Mit true wird das Bild angezeigt. MIt false würde das Bild nicht angezeigt werden
         buttonText: "Kalender",	//Wenn man die Maus auf das Icon hält, dann wird der Text "Kalender angezeigt
         dateFormat: 'dd-mm-yy'	//Hier wird das Ausgabeformat definiert
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
<!-- 	Im nachfolgenden wird ein Fieldset generiert.
		In diesem Fieldset werden die Eingabefelder, Labels, Auswahllisten, Datepickers und Button definiert.
		Der Datepicker ist eine Hilfestellung zur leichteren Auswahl eines Datums. Der Datepicker wird über ein CSS-File
		und ein Java-Script-File im Header eingebunden.
		Der Button dient dazu, dass wieder auf die Startseite zurückgesprungen werden kann.
-->
		<form action="FilterInput.jsp">
				<fieldset id="Fieldset_Abflugflughafen">	
					<legend id="Legend_Abflugflughafen">Abflugflughafen</legend><br>
					<label> ID:</label>
					<input type="text" name="Id_Abflugflughafen" id="Id_Abflugflughafen"><br>
					<label name="Label_Datum_Anfang_Abflugflughafen" id="Id_Abflugflughafen">Startdatum:</label>
					<input type="text" name="Datum_Anfang_Abflugflughafen" id="datepicker1_Abflugflughafen">
					<label name="Label_Uhrzeit_Anfang_Abflugflughafen" id="Label_Uhrzeit_Anfang_Abflugflughafen">Startuhrzeit:</label>
					<input type="text" name="Uhrzeit_Anfang_Abflugflughafen" id="Textfield_Uhrzeit_Anfang_Abflugflughafen" placeholder="example: 15:30"><br>
					<label name="Label_Datum_Ende_Abflugflughafen" id="Label_Datum_Ende_Abflugflughafen">Endedatum:</label>
					<input type="text" name="Datum_Ende_Abflugflughafen" id="datepicker2_Abflugflughafen">
					<label name="Label_Uhrzeit_Ende_Abflugflughafen" id="Label_Uhrzeit_Ende_Abflugflughafen">Endeuhrzeit:</label>
					<input type="text" name="Uhrzeit_Ende_Abflugflughafen" id="Textfield_Uhrzeit_Ende_Abflugflughafen" placeholder="example: 17:30"><br>
					<label name="Flugregeln_Abflugflughafen" id="Flugregeln_Abflugflughafen">Flugregeln:</label>
					<select onClick="this.form.Textfield_Auswahl_Flugregeln_Ablugflughafen.value=this.options[this.selectedIndex].text;" name="Flugregel_Abflugflughafen" id="Auswahl_Flugregeln_Abflugflughafen">
 						<option value="IFR">IFR</option>
  						<option value="VFR">VFR</option>
					</select><br><br>
					<input type="hidden" name="Textfield_Auswahl_Flugregeln_Ablugflughafen"></input>
					<label name="Wetterbedingungen_Abflugflughafen" id="Wetterbedingungen_Abflugflughafen">Wetterbedingungen:</label>
					<select onClick="this.form.Textfield_Auswahl_Wetterbedingungen_Ablugflughafen.value=this.options[this.selectedIndex].text;" name="Wetter_Abflugflughafen" id="Auswahl_Wetterbedingungen_Abflugflughafen">
 						<option value="IMC">IMC</option>
  						<option value="VMC">VMC</option>
					</select> 
					<input type="hidden" name="Textfield_Auswahl_Wetterbedingungen_Ablugflughafen"></input>
				</fieldset><br>
				
				<input type="submit" id="Startseite" value="Zurück zur Startseite"></input>
			</form>

</body>
</html>