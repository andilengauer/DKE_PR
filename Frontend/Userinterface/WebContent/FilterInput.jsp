<?xml version="1.0" encoding="utf-8" ?>
<%@page import="com.frequentis.semnotam.pr.AircraftTypeType"%>
<%@page import="com.frequentis.semnotam.pr.AerodromeType"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta charset="utf-8" />
<!--  <meta charset="ISO-8859-1"> -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="width=device-width, initial-scale=1"/>
<title>FilterInput</title>
<link rel="stylesheet" href="Design.css"></link>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css"></link>
<link rel="stylesheet" href="/resources/demos/style.css"></link>
<link rel="stylesheet" href="https://openlayers.org/en/v3.20.1/css/ol.css" type="text/css"></link>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="https://openlayers.org/en/v3.20.1/build/ol.js"></script>
<script>
//Hier sind die Funktionen, welche den Datepicker realisieren, implementiert
$(function() {
    $( "#datepicker1_Abflugflughafen" ).datepicker({
        showOn: "both",	//Mit "both" wird das Icon und der buttonText "Kalender" angezeigt.
        buttonImage: "Kalender.png",	//Der URL, wo das Bild gespeichert ist
        buttonImageOnly: true,	//Mit true wird das Bild angezeigt. MIt false würde das Bild nicht angezeigt werden
        buttonText: "Kalender", //Wenn man die Maus auf das Icon hält, dann wird der Text "Kalender angezeigt
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
 
 $(function() {
     $( "#Zeitintervall_Begindate" ).datepicker({
    	 showOn: "both",
         buttonImage: "Kalender.png",
         buttonImageOnly: true,
         buttonText: "Kalender",
         dateFormat: 'dd-mm-yy'  
     });
 });
 
 $(function() {
     $( "#Zeitintervall_Enddate" ).datepicker({
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
		In diesem Fieldset werden die Eingabefelder, Labels, Auswahllisten, Datepickers und Buttons definiert.
		Der Datepicker ist eine Hilfestellung zur leichteren Auswahl eines Datums. Der Datepicker wird über ein CSS-File
		und ein Java-Script-File im Header eingebunden.
-->

		<form action="Submit.jsp" method ="get" id="InputForm">
		
		<ul>
			<li><a href="javascript:{}" onclick="document.getElementById('InputForm').submit()">Filterung abschließen</a></li>
		</ul><br></br><br>
		
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
		
		<fieldset class="fieldset">
			<legend class="legend">Zeitintervall</legend><br>
			<label style="position:relative; left:5.5cm; top:-0.5cm; ">Datum</label><label style="position:relative; left:8.5cm; top:-0.5cm; ">Uhrzeit</label>
			<label style="position:absolute; left:1cm;">Anfang:</label>
			<input type="text" name="Zeitintervall_Begindate" id="Zeitintervall_Begindate" class="datepicker">
			<input type="text" name="Zeitintervall_Begintime" id="Zeitintervall_Begintime" class="uhrzeit" placeholder="example: 15:30" value="00:00">
			<br></br>
			<label style="position:relative; left:5.5cm; top:-0.5cm; ">Datum</label><label style="position:relative; left:8.5cm; top:-0.5cm; ">Uhrzeit</label>
			<label style="position:absolute; left:1cm;">Ende:</label>
			<input type="text" name="Zeitintervall_Enddate" id="Zeitintervall_Enddate" class="datepicker">
			<input type="text" name="Zeitintervall_Endtime" id="Zeitintervall_Endtime" class="uhrzeit" placeholder="example: 15:30" value="00:00"><br>
			
		</fieldset>
		<fieldset id="Fieldset_Flugroute">
			<legend id="Legend_Flugroute">Flugroute</legend><br>
			<label>Routenname:</label>
			<input type="text" name="Route_name" id="Route_name"></input><br></br>
				<fieldset id="Fieldset_Abflugflughafen">
					<legend id="Legend_Abflugflughafen">Abflugflughafen</legend><br>
					<label> ID:</label>
					<input type="text" name="Id_Abflugflughafen" id="Id_Abflugflughafen"><br>
					<label name="Label_Datum_Anfang_Abflugflughafen" id="Id_Abflugflughafen">Startdatum:</label>
					<input type="text" name="Datum_Anfang_Abflugflughafen" id="datepicker1_Abflugflughafen">
					<label name="Label_Uhrzeit_Anfang_Abflugflughafen" id="Label_Uhrzeit_Anfang_Abflugflughafen">Startuhrzeit:</label>
					<input type="text" name="Uhrzeit_Anfang_Abflugflughafen" id="Textfield_Uhrzeit_Anfang_Abflugflughafen" placeholder="example: 15:30" value="00:00"><br>
					<label name="Label_Datum_Ende_Abflugflughafen" id="Label_Datum_Ende_Abflugflughafen">Endedatum:</label>
					<input type="text" name="Datum_Ende_Abflugflughafen" id="datepicker2_Abflugflughafen">
					<label name="Label_Uhrzeit_Ende_Abflugflughafen" id="Label_Uhrzeit_Ende_Abflugflughafen">Endeuhrzeit:</label>
					<input type="text" name="Uhrzeit_Ende_Abflugflughafen" id="Textfield_Uhrzeit_Ende_Abflugflughafen" placeholder="example: 17:30" value="00:00"><br>
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
					<input type="text" name="Uhrzeit_Anfang_Area" id="Textfield_Uhrzeit_Anfang_Area" placeholder="example: 15:30" value="00:00"><br>
					<label name="Label_Datum_Ende_Area" id="Label_Datum_Ende_Area">Endedatum:</label>
					<input type="text" name="Datum_Ende_Area" id="datepicker4_Area">
					<label name="Label_Uhrzeit_Ende_Area" id="Label_Uhrzeit_Ende_Area">Endeuhrzeit:</label>
					<input type="text" name="Uhrzeit_Ende_Area" id="Textfield_Uhrzeit_Ende_Area" placeholder="example: 17:30" value="00:00"><br>
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
					<input type="hidden" name="Textfield_Auswahl_Wetterbedingungen_Area"></input><br></br><br>
					<div id="Karte_Area" class="Karte_Area"></div><br>
					<label>Startpunkt:</label>
					<input type="text" name="Startpunkt_Area" id="Startpunkt_Area"></input><br>
					<label>Endpunkt:</label>
					<input type="text" name="Endpunkt_Area" id="Endpunkt_Area"></input><br></br>
				</fieldset><br>
					
				<fieldset id="Fieldset_Segment">
					<legend id="Legend_Segment">Segment</legend><br>
					<label> ID:</label>
					<input type="text" name="Id_Segment" id="Id_Segment"><br>
					<label name="Label_Datum_Anfang_Segment" id="Label_Datum_Anfang_Segment">Startdatum:</label>
					<input type="text" name="datepicker5_Segment" id="datepicker5_Segment">
					<label name="Label_Uhrzeit_Anfang_Segment" id="Label_Uhrzeit_Anfang_Segment">Startuhrzeit:</label>
					<input type="text" name="Textfield_Uhrzeit_Anfang_Segment" id="Textfield_Uhrzeit_Anfang_Segment" placeholder="example: 15:30" value="00:00"><br>
					
					<label name="Label_Datum_Ende_Segment" id="Label_Datum_Ende_Segment">Endedatum:</label>
					<input type="text" name="datepicker6_Segment" id="datepicker6_Segment">
					<label name="Label_Uhrzeit_Ende_Segment" id="Label_Uhrzeit_Ende_Segment">Endeuhrzeit:</label>
					<input type="text" name="Textfield_Uhrzeit_Ende_Segment" id="Textfield_Uhrzeit_Ende_Segment" placeholder="example: 17:30" value="00:00"><br>
					
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
					<input type="hidden" name="Textfield_Auswahl_Wetterbedingungen_Segment"></input><br></br><br>
					
      				<!--	Es wird eine Karte eingefügt.
						Es kann in einer Auswahlliste eine Option ausgewählt werden.
						Mit Auswahl einer der folgenden Optionen kann dann auf der Karte gezeichnet werden.
						Optionen sind: Zeichnen von Linie, Polygon und nichts zeichnen
				 	-->
					<div id="Karte_Segment" class="Karte_Segment"></div><br>
					<label>Startpunkt:</label>
					<input type="text" name="Startpunkt_Segment" id="Startpunkt_Segment"></input><br>
					<label>Endpunkt:</label>
					<input type="text" name="Endpunkt_Segment" id="Endpunkt_Segment"></input><br></br>
					<!--	Es wird eine Tabelle generiert.
							Diese Tabelle enthält Informationen über die eingefügten Segmente.
							Es werden die Tectfelder befüllt und mit anschließendenm Klick auf den Button werden die 
							Informationen in einer Tabelle gespeichert. Diese Tabelle wird dann an die Business Rule Engine übergeben
					 -->
					 <select name="Segmentkarte_type" id="Segmentkarte_type">  
        		<option value="LineString">Linie</option>
        		<option value="Polygon">Polygon</option>
        		<option value="None">None</option>
      		</select>
					<button type="button" id="Segment_speichern" onclick="addRow(), anzeigenSegmentTabelle()">Segment hinzufügen</button><br></br>
					<table id="Segment_Tab" name="Segment_Tab">
					<input type="hidden" name="SegmentList" id="SegmentList"></input>
					<tr>
						<th>ID</th>
						<th>Startpunkt</th>
						<th>Endpunkt</th>
					</tr>
					</table>
				</fieldset><br>
					
				<fieldset id="Fieldset_Zielflughafen">
					<legend id="Legend_Zielflughafen">Zielflughafen</legend><br/>
					<label> ID:</label>
					<input type="text" name="Id_Zielflughafen" id="Id_Zielflughafen"/><br/>
					<label name="Label_Datum_Anfang_Zielflughafen" id="Label_Datum_Anfang_Zielflughafen">Startdatum:</label>
					<input type="text" name="Datum_Anfang_Zielflughafen" id="datepicker7_Zielflughafen">
					<label name="Label_Uhrzeit_Anfang_Zielflughafen" id="Label_Uhrzeit_Anfang_Zielflughafen">Startuhrzeit:</label>
					<input type="text" name="Uhrzeit_Anfang_Zielflughafen" id="Textfield_Uhrzeit_Anfang_Zielflughafen" placeholder="example: 15:30" value="00:00"><br>
					<label name="Label_Datum_Ende_Zielflughafen" id="Label_Datum_Ende_Zielflughafen">Endedatum:</label>
					<input type="text" name="Datum_Ende_Zielflughafen" id="datepicker8_Zielflughafen">
					<label name="Label_Uhrzeit_Ende_Zielflughafen" id="Label_Uhrzeit_Ende_Zielflughafen">Endeuhrzeit:</label>
					<input type="text" name="Uhrzeit_Ende_Zielflughafen" id="Textfield_Uhrzeit_Ende_Zielflughafen" placeholder="example: 17:30" value="00:00"><br>
					<label name="Flugregeln_Zielflughafen" id="Flugregeln_Zielflughafen">Flugregeln:</label>
					<select onClick="this.form.Textfield_Auswahl_Flugregeln_Zielflughafen.value=this.options[this.selectedIndex].text;" name="Flugregel_Zielflughafen" id="Auswahl_Flugregeln_Zielflughafen">
 						<option value="IFR">IFR</option>
  						<option value="VFR">VFR</option>
					</select><br><br>
					<input type="hidden" name="Textfield_Auswahl_Flugregeln_Zielflughafen"></input>
					<label name="Wetterbedingungen_Zielflughafen" id="Wetterbedingungen_Zielflughafen">Wetterbedingungen:</label>
					<select onClick="this.form.Textfield_Auswahl_Wetterbedingungen_Zielflughafen.value=this.options[this.selectedIndex].text;" name="Wetter_Zielflughafen" id="Auswahl_Wetterbedingungen_Zielflughafen">
 						<option value="IMC">IMC</option>
  						<option value="VMC">VMC</option>
					</select> 
					<input type="hidden" name="Textfield_Auswahl_Wetterbedingungen_Zielflughafen"></input>
				</fieldset><br>
     	</fieldset><br>
     	
    
    </form>
    
    <script>
    	//Karte Segment
  		//Im nachfolden wird beschrieben, wie die Map generiert wird und wie das Zeichnen funktioniert.
		var raster = new ol.layer.Tile({	//Ein neuer layer mit einem Tile wird defininert
		source: new ol.source.OSM()
    	});

    	var source = new ol.source.Vector({wrapX: false});

    	var vector = new ol.layer.Vector({	//Ein neuer layer mit einem Vector wird defininert
            source: source	
 	    });

    	//Hier wird die Map erstellt
  	    var map1 = new ol.Map({	//Ein neues Map - Objekt wird erstellt
    	     layers: [raster, vector],	//Hier werden die vorher definierten Objekte (Raster und Vector) dem Layer zugewiesen
    	     target: 'Karte_Segment',	//Mit "target" wird das Ziel, wo dann die Karte eingefügt wird, festgelegt. Im Body - Bereich wird dann mit dem namen "Karte-Segment" die Karte eingefügt.
    	     view: new ol.View({	//Eine sich wird eingefügt, d.h.  welcher Punkt in der Map beim Laden angezeogt wird
    	     center: ol.proj.fromLonLat([16.37, 48.209]),	//In diesem Fall habe ich alternativ die Stadt Wien als view gewählt
    	     zoom: 4	//Der Zoomfaktor, welcher beim Laden angezeigt wird
    	     })
    	});

  	  var typeSelect = document.getElementById('Segmentkarte_type');	//Es wird das Option von der Auswahlliste in die Variable "typeSelect" gespeichert
	//typeSelect.value = "LineString";
  	//Mit Hilfe dieser Function kann dann auf der Karte gezeichnet werden
  	var draw;
  	function addInteraction() {
   		var value = typeSelect.value;
  	    if (value !== 'None') {	//Es wird überprüft, ob die Option nicht "None" ist
  	    	draw = new ol.interaction.Draw({	//Bei einer anderen Auswahl als "None" kann auf der Karte gezeichnet werden
  	       		source: source,
  	        	type: (typeSelect.value)
  	        });
  	        map1.addInteraction(draw);
  	    }
  	}

    	typeSelect.onchange = function() {
    	map1.removeInteraction(draw);
    	addInteraction();
   		};

    	addInteraction();
    	
    	
       
    	//Es wird ein Click-Handler generiert, der es ermöglicht mit einem Klick auf die Karte die Koordinaten anzuzeigen
      	map1.on('click', function(evt) {
        	var coordinate = evt.coordinate;
        	var lonlat = ol.coordinate.toStringXY(ol.proj.toLonLat(
            coordinate, 'EPSG:3857', 'EPSG:4326'),7);	//Mit einem Klick auf die Karte werden die Koordinaten in die Variable "lonlat" gespeichert
			
            if(document.getElementById('Startpunkt_Segment').value != "")
			{    		
				document.getElementById('Endpunkt_Segment').value = lonlat;	//Die Koordinaten werden in das Textfeld geschrieben
			}
			else 
			{
			    document.getElementById('Startpunkt_Segment').value = lonlat;	//Die Koordinaten werden in das Textfeld geschrieben
			}	
      	});
       
   	</script>	
   	
   	<!--  
   	<script>
   	//Karte Area
   	var raster = new ol.layer.Tile({
		source: new ol.source.OSM()
	});

	var source = new ol.source.Vector({wrapX: false});

	var vector = new ol.layer.Vector({
        source: source
	    });

	    var map2 = new ol.Map({
	     layers: [raster, vector],
	     target: 'Karte_Area',
	     view: new ol.View({
	     center: ol.proj.fromLonLat([16.37, 48.209]),
	     zoom: 4
	     })
	});

	var typeSelect = document.getElementById('Auswahl_Optionen_Karte_Area');
	typeSelect = "LineString";
	var draw;
	function addInteraction() {
 		var value = typeSelect.value;
	    if (value !== 'None') {
	    	draw = new ol.interaction.Draw({
	        source: source,
	        type: (typeSelect.value)
	        });
	        map2.addInteraction(draw);
	    }
	}

	typeSelect.onchange = function() {
	map2.removeInteraction(draw);
	addInteraction();
		};

	addInteraction();
	
	
  	map2.on('click', function(evt) {
    	var coordinate = evt.coordinate;
    	var lonlat = ol.coordinate.toStringXY(ol.proj.toLonLat(
        coordinate, 'EPSG:3857', 'EPSG:4326'));
		if(document.getElementById('Startpunkt_Area').value != "")
		{    		
			document.getElementById('Endpunkt_Area').value = lonlat;
		}
		else 
		{
		    document.getElementById('Startpunkt_Area').value = lonlat;
		}	
  	});
   	</script>
   	-->
   	<script>
   	var segments = [];
  	//Mit Hilfe dieser Function wird eine neue Zeile in einer Tabelle hinzugefügt und die Zellen mit den Werten von der Textbox befüllt
   	function addRow() {
   			var tabelle = document.getElementById("Segment_Tab");	//Die Tabelle wird in die Variable "Tabelle" gespeichert
   	   		var reihe = tabelle.insertRow(-1);	//Es wird eine neue Reihe in der Tabelle unterhalb hinzugefügt
   	   		var id = reihe.insertCell(0);	//Es wird eine neue Zelle hinzugefügt
   	   		var startpunkt = reihe.insertCell(1);	//Es wird eine neue Zelle hinzugefügt
   	 		var endpunkt = reihe.insertCell(2);	//Es wird eine neue Zelle hinzugefügt
   	   		
   	 		var inputId = document.getElementById("Id_Segment").value;	
   	 		var inputStart = document.getElementById("Startpunkt_Segment").value;	
   	 		var inputEnd = document.getElementById("Endpunkt_Segment").value;	
   	 		
   	 		//push into segment array
   	 		var segment = {"id":inputId,start:inputStart,end:inputEnd};
   	   		segments.push(segment);
   	   		document.getElementById("SegmentList").value = JSON.stringify(segments);
   	   		
   	   		id.innerHTML = document.getElementById("Id_Segment").value;	//Es wird die Zelle "id" mit dem Inhalt der Textbox befüllt
   	   		startpunkt.innerHTML = document.getElementById("Startpunkt_Segment").value;	//Es wird die Zelle "Startpunkt" mit dem Inhalt der Textbox befüllt
   	 		endpunkt.innerHTML = document.getElementById("Endpunkt_Segment").value;	//Es wird die Zelle "Endpunkt" mit dem Inhalt der Textbox befüllt
   	 		
   	 		
   	 		document.getElementById("Id_Segment").value = "";	//Nach Klick auf den Button werden dann auch noch die Textfelder geleert, damit sie wieder befüllt werden können
   	 		document.getElementById("Startpunkt_Segment").value = "";	// Nach Klick auf den Button werden dann auch noch die Textfelder geleert, damit sie wieder befüllt werden können
   	 		document.getElementById("Endpunkt_Segment").value = "";	// Nach Klick auf den Button werden dann auch noch die Textfelder geleert, damit sie wieder befüllt werden können
   		}
   	
   	</script>
   	
   	<script>
   		function anzeigenSegmentTabelle() {
   			
   			document.getElementById('Segment_Tab').style.display = "block";
   		}
   		
		function anzeigenSegmentKarte() {
   			
   			document.getElementById('Auswahl_Optionen_Karte_Segment').style.display = "block";
   			document.getElementById('Label_Optionen_Karte_Segment').style.display = "block";
   			document.getElementById('Karte_Segment').style.display = "block";
   		}
		
		function anzeigenAreaKarte() {
   			
   			document.getElementById('Auswahl_Optionen_Karte_Area').style.display = "block";
   			document.getElementById('Label_Optionen_Karte_Area').style.display = "block";
   			document.getElementById('Karte_Area').style.display = "block";
   		}
   	
   	</script>
   	
</body>
</html>