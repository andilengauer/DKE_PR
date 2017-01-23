<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="com.frequentis.semnotam.pr.AircraftType"%>
<%@page import="com.frequentis.semnotam.pr.SegmentPropertyType"%>
<%@page import="com.frequentis.semnotam.pr.FilterInputType"%>
<%@page import="com.frequentis.semnotam.pr.AircraftTypeType"%>
<%@page import="com.frequentis.semnotam.pr.AerodromeType"%>
<%@page import="frontend.AppController"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>FilterOutput</title>
<link rel="stylesheet" href="OutputDesign.css">
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<link rel="stylesheet" href="https://openlayers.org/en/v3.20.1/css/ol.css" type="text/css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="https://openlayers.org/en/v3.20.1/build/ol.js"></script>

<%
FilterInputType input = AppController.getInstance().inputType;

AircraftType flugzeug;
if (input != null)
	flugzeug = input.getHasAircraft().getAircraft();




//---- get values from FilterOutput -----

AppController.getInstance().getFilterOutput();

%>

</head>
<body>
	
	<ul>
			<li><a href="FilterInput.jsp">neue Filterung</a></li>
			</ul><br></br><br></br>
		
		<fieldset id="Fieldset_Flugzeuginformationen">
			<legend id="Legend_Flugzeuginformationen">Flugzeuginformationen</legend><br>
			<label>ID:</label> 
			<input type="text" name="Flugzeug_ID" id="Flugzeug_ID" class="Flugzeug_Text" value=<%= ""%>></input><br>
			<label>Typ:</label>
			<select name="Typ_Flugzeug" id="Typ_Flugzeug" class="Flugzeug_Text" disabled>
 				<option value=<%=AircraftTypeType.HELICOPTER %>><%=AircraftTypeType.HELICOPTER %></option>
  				<option value=<%=AircraftTypeType.LANDPLANE %>><%=AircraftTypeType.LANDPLANE %></option>
			</select><br>
			<label>Spannweite:</label>
			<input type="text" name="Spannweite_Flugzeug" id="Spannweite_Flugzeug" class="Flugzeug_Text" value=<%= "" %>><br>
			<label>Maximalgewicht:</label>
			<input type="text" name="Maximalgewicht_Flugzeug" id="Maximalgewicht_Flugzeug" class="Flugzeug_Text"><br>
			<label>Minimalgewicht:</label>
			<input type="text" name="Minimalgewicht_Flugzeug" id="Minimalgewicht_Flugzeug" class="Flugzeug_Text"><br>
		</fieldset><br>
		
		<fieldset id="Fieldset_Flugroute">
			<legend id="Legend_Flugroute">Flugroute</legend><br>
			<label>Routenname:</label><input type="text" name="Route_name" class="Flugroute_input"></input>
				<fieldset id="Fieldset_Abflugflughafen">
					<legend id="Legend_Abflugflughafen">Abflugflughafen</legend><br>
					<label>ID:</label>
					<input type="text" name="Id_Abflugflughafen" id="Id_Abflugflughafen" class="Flugroute_input"><br>
					<label name="Label_Datum_Anfang_Abflugflughafen" id="Id_Abflugflughafen">Startdatum:</label>
					<input type="text" name="Datum_Anfang_Abflugflughafen" id="datepicker1_Abflugflughafen" class="Flugroute_input">
					<label name="Label_Uhrzeit_Anfang_Abflugflughafen" id="Label_Uhrzeit_Anfang_Abflugflughafen">Startuhrzeit:</label>
					<input type="text" name="Uhrzeit_Anfang_Abflugflughafen" id="Textfield_Uhrzeit_Anfang_Abflugflughafen" placeholder="example: 15:30" class="Flugroute_input"><br>
					<label name="Label_Datum_Ende_Abflugflughafen" id="Label_Datum_Ende_Abflugflughafen">Endedatum:</label>
					<input type="text" name="Datum_Ende_Abflugflughafen" id="datepicker2_Abflugflughafen" class="Flugroute_input">
					<label name="Label_Uhrzeit_Ende_Abflugflughafen" id="Label_Uhrzeit_Ende_Abflugflughafen">Endeuhrzeit:</label>
					<input type="text" name="Uhrzeit_Ende_Abflugflughafen" id="Textfield_Uhrzeit_Ende_Abflugflughafen" placeholder="example: 17:30" class="Flugroute_input"><br>
					<label name="Flugregeln_Abflugflughafen" id="Flugregeln_Abflugflughafen">Flugregeln:</label>
					<select name="Flugregel_Abflugflughafen" id="Auswahl_Flugregeln_Abflugflughafen" class="Auswahl_Flugregel">
 						<option value="IFR">IFR</option>
  						<option value="VFR">VFR</option>
					</select><br><br>
					<input type="hidden" name="Textfield_Auswahl_Flugregeln_Ablugflughafen"></input>
					<label name="Wetterbedingungen_Abflugflughafen" id="Wetterbedingungen_Abflugflughafen">Wetterbedingungen:</label>
					<select name="Wetter_Abflugflughafen" id="Auswahl_Wetterbedingungen_Abflugflughafen" class="Auswahl_Wetter">
 						<option value="IMC">IMC</option>
  						<option value="VMC">VMC</option>
					</select> 
					<input type="hidden" name="Textfield_Auswahl_Wetterbedingungen_Ablugflughafen"></input>
				</fieldset><br>
				
				<fieldset id="Fieldset_Area">
					<legend id="Legend_Area">Area</legend><br>
					<label> ID:</label>
					<input type="text" name="Id_Area" id="Id_Area" class="Flugroute_input"><br>
					<label name="Label_Datum_Anfang_Area" id="Label_Datum_Anfang_Area">Startdatum:</label>
					<input type="text" name="Datum_Anfang_Area" id="datepicker3_Area" class="Flugroute_input">
					<label name="Label_Uhrzeit_Anfang_Area" id="Label_Uhrzeit_Anfang_Area">Startuhrzeit:</label>
					<input type="text" name="Uhrzeit_Anfang_Area" id="Textfield_Uhrzeit_Anfang_Area" placeholder="example: 15:30" class="Flugroute_input"><br>
					<label name="Label_Datum_Ende_Area" id="Label_Datum_Ende_Area">Endedatum:</label>
					<input type="text" name="Datum_Ende_Area" id="datepicker4_Area" class="Flugroute_input">
					<label name="Label_Uhrzeit_Ende_Area" id="Label_Uhrzeit_Ende_Area">Endeuhrzeit:</label>
					<input type="text" name="Uhrzeit_Ende_Area" id="Textfield_Uhrzeit_Ende_Area" placeholder="example: 17:30" class="Flugroute_input"><br>
					<label name="Flugregeln_Area" id="Flugregeln_Area">Flugregeln:</label>
					<select name="Flugregeln_Area" id="Auswahl_Flugregeln_Area" class="Auswahl_Flugregel">
 						<option value="IFR">IFR</option>
  						<option value="VFR">VFR</option>
					</select><br><br>
					<input type="hidden" name="Textfield_Auswahl_Flugregeln_Area"></input>
					<label name="Wetterbedingungen_Area" id="Wetterbedingungen_Area">Wetterbedingungen:</label>
					<select name="Wetterbedingungen_Area" id="Auswahl_Wetterbedingungen_Area" class="Auswahl_Wetter">
 						<option value="IMC">IMC</option>
  						<option value="VMC">VMC</option>
					</select> 
					<input type="hidden" name="Textfield_Auswahl_Wetterbedingungen_Area"></input>
				</fieldset><br>
					
				<fieldset id="Fieldset_Segment">
					<legend id="Legend_Segment">Segment</legend><br>
					<div id="Karte" class="Karte"></div><br>
					<table id="Segment_Tab">
					<tr>
						<th>ID</th>
						<th>Startpunkt</th>
						<th>Endpunkt</th>
					</tr>
					<%
					if(input != null && input.getHasFlightPath().getFlightPath() != null && input.getHasFlightPath().getFlightPath().getHasSegment() != null)
					{
					for(SegmentPropertyType s :input.getHasFlightPath().getFlightPath().getHasSegment()) 
					{
						String startPoint;
						String endPoint;
						
						startPoint = s.getSegment().getStartPoint().getPoint().getValue().getPos().getValue().toString();
						endPoint = s.getSegment().getEndPoint().getPoint().getValue().getPos().getValue().toString();
						
					%>
					<tr>
					<td><%=s.getSegment().getDesignator() %></td>
					<td><%=startPoint %></td>
					<td><%=endPoint %></td>
					</tr>
					<%}
					}
					%>
					</table>
				</fieldset><br>
					
				<fieldset id="Fieldset_Zielflughafen">
					<legend id="Legend_Zielflughafen">Zielflughafen</legend><br/>
					<label> ID:</label>
					<input type="text" name="Id_Zielflughafen" id="Id_Zielflughafen"/ class="Flugroute_input"><br/>
					<label name="Label_Datum_Anfang_Zielflughafen" id="Label_Datum_Anfang_Zielflughafen">Startdatum:</label>
					<input type="text" name="Datum_Anfang_Zielflughafen" id="datepicker7_Zielflughafen" class="Flugroute_input">
					<label name="Label_Uhrzeit_Anfang_Zielflughafen" id="Label_Uhrzeit_Anfang_Zielflughafen">Startuhrzeit:</label>
					<input type="text" name="Uhrzeit_Anfang_Zielflughafen" id="Textfield_Uhrzeit_Anfang_Zielflughafen" placeholder="example: 15:30" class="Flugroute_input"><br>
					<label name="Label_Datum_Ende_Zielflughafen" id="Label_Datum_Ende_Zielflughafen">Endedatum:</label>
					<input type="text" name="Datum_Ende_Zielflughafen" id="datepicker8_Zielflughafen" class="Flugroute_input">
					<label name="Label_Uhrzeit_Ende_Zielflughafen" id="Label_Uhrzeit_Ende_Zielflughafen">Endeuhrzeit:</label>
					<input type="text" name="Uhrzeit_Ende_Zielflughafen" id="Textfield_Uhrzeit_Ende_Zielflughafen" placeholder="example: 17:30" class="Flugroute_input"><br>
					<label name="Flugregeln_Zielflughafen" id="Flugregeln_Zielflughafen">Flugregeln:</label>
					<select name="Flugregel_Zielflughafen" id="Auswahl_Flugregeln_Zielflughafen" class="Auswahl_Flugregel">
 						<option value="IFR">IFR</option>
  						<option value="VFR">VFR</option>
					</select><br><br>
					<input type="hidden" name="Textfield_Auswahl_Flugregeln_Zielflughafen"></input>
					<label name="Wetterbedingungen_Zielflughafen" id="Wetterbedingungen_Zielflughafen">Wetterbedingungen:</label>
					<select name="Wetter_Zielflughafen" id="Auswahl_Wetterbedingungen_Zielflughafen" class="Auswahl_Wetter">
 						<option value="IMC">IMC</option>
  						<option value="VMC">VMC</option>
					</select> 
					<input type="hidden" name="Textfield_Auswahl_Wetterbedingungen_Zielflughafen"></input>
				</fieldset><br>
				
			
			<label name="Label_Optionen_Karte" id="Label_Optionen_Karte">Wählen&nbsp;Sie&nbsp;bitte&nbsp;die&nbsp;gewünschte&nbsp;Option&nbsp;aus:</label>
      		<select name="Auswahl_Optionen_Karte" id="Auswahl_Optionen_Karte">  
        		<option value="LineString">Linie</option>
        		<option value="Polygon">Polygon</option>
        		<option value="Circle">Kreis</option>
        		<option value="None">None</option>
      		</select>
     	</fieldset><br>
     	
     	<fieldset id="Ouput_fieldset">
			<legend id="Legend_Output">Filter Output</legend><br>
     	
     	<input type="submit" name="Submit" id="Submit" value="Filtern">
    
    
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
   	var segments = [];
   	
   	function addRow() {
   			var tabelle = document.getElementById("Segment_Tab");
   	   		var reihe = tabelle.insertRow(-1);
   	   		var id = reihe.insertCell(0);
   	   		var startpunkt = reihe.insertCell(1);
   	 		var endpunkt = reihe.insertCell(2);
   	   		
   	 		var inputId = document.getElementById("Id_Segment").value;
   	 		var inputStart = document.getElementById("Startpunkt_Segment").value;
   	 		var inputEnd = document.getElementById("Endpunkt_Segment").value;
   	 		
   	 		//push into segment array
   	 		var segment = {"id":inputId,start:inputStart,end:inputEnd};
   	   		segments.push(segment);
   	   		document.getElementById("SegmentList").value = JSON.stringify(segments);
   	   		
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