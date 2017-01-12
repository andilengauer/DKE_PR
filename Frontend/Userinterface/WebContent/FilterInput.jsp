<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="com.frequentis.semnotam.pr.AircraftTypeType"%>
<%@page import="com.frequentis.semnotam.pr.AerodromeType"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>FilterInput</title>
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
	<form action="Success.jsp" method ="get">
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
		
		<fieldset id="Fieldset_Flugroute">
			<legend id="Legend_Flugroute">Flugroute</legend><br>
			
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
					
				<fieldset id="Fieldset_Segment">
					<legend id="Legend_Segment">Segment</legend><br>
					<table border="3px">
					<tr><td>Bezeichnung</td><td>Startpunkt</td><td>Endpunkt</td></tr>
					<tr><td><input type="text"></input></td><td></td><td></td></tr>
					</table>
					<label>Bezeichnung:</label>
					<input type="text" name="Segment_bezeichnung" id="Id_Segment"><br>
					<label>Startpunkt:</label>
					<input type="text" name="Segment_startpunkt" id="Segment_startpunkt"><br>
					<label>Endpunkt:</label>
					<input type="text" name="Segment_endpunkt" id="Segment_endpunkt">
					</fieldset><br>
					
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
				
			<div id="Karte" class="Karte"></div><br>
			<label name="Label_Optionen_Karte" id="Label_Optionen_Karte">W�hlen&nbsp;Sie&nbsp;bitte&nbsp;die&nbsp;gew�nschte&nbsp;Option&nbsp;aus:</label>
      		<select name="Auswahl_Optionen_Karte" id="Auswahl_Optionen_Karte">  
        		<option value="LineString">Linie</option>
        		<option value="Polygon">Polygon</option>
        		<option value="Circle">Kreis</option>
        		<option value="None">None</option>
      		</select>
     	</fieldset><br>
     	
     	<input type="submit" name="Submit" id="Submit" value="Filtern">
    
    </form>
    
    <script>
    	var raster = new ol.layer.Tile({
    		source: new ol.source.OSM()
    	});

    	var source = new ol.source.Vector({wrapX: false});

    	var vector = new ol.layer.Vector({
            source: source
 	    });

  	    var map = new ol.Map({
    	     layers: [raster, vector],
    	     target: 'Karte',
    	     view: new ol.View({
    	     center: ol.proj.fromLonLat([16.37, 48.209]),
    	     zoom: 4
    	     })
    	});

    	var typeSelect = document.getElementById('Auswahl_Optionen_Karte');

    	var draw;
    	function addInteraction() {
     		var value = typeSelect.value;
    	    if (value !== 'None') {
    	    	draw = new ol.interaction.Draw({
    	        source: source,
    	        type: (typeSelect.value)
    	        });
    	        map.addInteraction(draw);
    	    }
    	}

    	typeSelect.onchange = function() {
    	map.removeInteraction(draw);
    	addInteraction();
   		};

    	addInteraction();
   	</script>	
   	
</body>
</html>