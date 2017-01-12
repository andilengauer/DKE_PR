<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Segment</title>
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
<fieldset id="Fieldset_Segment">
					<legend id="Legend_Segment">Segment</legend><br>
					<label> ID:</label>
					<input type="text" name="Id_Segment" id="Id_Segment"><br></br>
					<label name="Label_Datum_Anfang_Segment" id="Label_Datum_Anfang_Segment">Startdatum:</label>
					<input type="text" name="datepicker5_Segment" id="datepicker5_Segment">
					<label name="Label_Uhrzeit_Anfang_Segment" id="Label_Uhrzeit_Anfang_Segment">Startuhrzeit:</label>
					<input type="text" name="Textfield_Uhrzeit_Anfang_Segment" id="Textfield_Uhrzeit_Anfang_Segment" placeholder="example: 15:30"><br>
					<label>Startpunkt:</label>
					<input type="text" name="Startpunkt_Segment" id="Startpunkt_Segment"></input><br></br>
					<label name="Label_Datum_Ende_Segment" id="Label_Datum_Ende_Segment">Endedatum:</label>
					<input type="text" name="datepicker6_Segment" id="datepicker6_Segment">
					<label name="Label_Uhrzeit_Ende_Segment" id="Label_Uhrzeit_Ende_Segment">Endeuhrzeit:</label>
					<input type="text" name="Textfield_Uhrzeit_Ende_Segment" id="Textfield_Uhrzeit_Ende_Segment" placeholder="example: 17:30"><br>
					<label>Endpunkt:</label>
					<input type="text" name="Endpunkt_Segment" id="Endpunkt_Segment"></input><br></br>
					<label name="Flugregeln_Segment" id="Flugregeln_Segment">Flugregeln:</label>
					<select onClick="this.form.Textfield_Auswahl_Flugregeln_Segment.value=this.options[this.selectedIndex].text;" name="Auswahl_Flugregeln_Segment" id="Auswahl_Flugregeln_Segment">
 						<option value="IFR">IFR</option>
  						<option value="VFR">VFR</option>
					</select><br><br>
					<input type="hidden" name="Textfield_Auswahl_Flugregeln_Segment"></input>
					<label name="Wetterbedingungen_Segment" id="Wetterbedingungen_Segment">Wetterbedingungen:</label>
					<select onClick="this.form.Textfield_Auswahl_Wetterbedingungen_Segment.value=this.options[this.selectedIndex].text;" name="Auswahl_Wetterbedingungen_Segment" id="Auswahl_Wetterbedingungen_Segment">
 						<option value="IMC">IMC</option>
  						<option value="VMC">VMC</option>
					</select> 
					<input type="hidden" name="Textfield_Auswahl_Wetterbedingungen_Segment"></input><br></br><br></br>

					<button type="button" id="Segment_speichern" onclick="addRow()">Segment hinzufügen</button><br></br>
					<table id="Tabelle">
					<tr>
						<th>ID</th>
						<th>Startpunkt</th>
						<th>Endpunkt</th>
					</tr>
					</table>
				</fieldset><br>
				
				<div id="Karte" class="Karte"></div><br>
			<label name="Label_Optionen_Karte" id="Label_Optionen_Karte">Wählen&nbsp;Sie&nbsp;bitte&nbsp;die&nbsp;gewünschte&nbsp;Option&nbsp;aus:</label>
      		<select name="Auswahl_Optionen_Karte" id="Auswahl_Optionen_Karte">  
        		<option value="LineString">Linie</option>
        		<option value="Polygon">Polygon</option>
        		<option value="Circle">Kreis</option>
        		<option value="None">None</option>
      		</select><br></br><br></br>
     	
     	
				<input type="submit" id="Startseite" value="Zurück zur Startseite"></input>
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
    	
    	/**
       	* Add a click handler to the map to render the popup.
       */
       
       
      	map.on('click', function(evt) {
        	var coordinate = evt.coordinate;
        	var lonlat = ol.coordinate.toStringXY(ol.proj.toLonLat(
            coordinate, 'EPSG:3857', 'EPSG:4326'));
			if(document.getElementById('Startpunkt_Segment').value != "")
			{    		
				document.getElementById('Endpunkt_Segment').value = lonlat;
			}
			else 
			{
			    document.getElementById('Startpunkt_Segment').value = lonlat;
			}	
      	});
       
   	</script>	
   	
   	<script>
   		function addRow() {
   			var tabelle = document.getElementById("Tabelle");
   	   		var reihe = tabelle.insertRow(-1);
   	   		var id = reihe.insertCell(0);
   	   		var startpunkt = reihe.insertCell(1);
   	 		var endpunkt = reihe.insertCell(2);
   	   		
   	   		id.innerHTML = document.getElementById("Id_Segment").value;
   	   		startpunkt.innerHTML = document.getElementById("Startpunkt_Segment").value;
   	 		endpunkt.innerHTML = document.getElementById("Endpunkt_Segment").value;
   	 		
   	 		document.getElementById("Id_Segment").value = "";
   	 		document.getElementById("Startpunkt_Segment").value = "";
   	 		document.getElementById("Endpunkt_Segment").value = "";
   		}
   		
   		
   	</script>

</body>
</html>