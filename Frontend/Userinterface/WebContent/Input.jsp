<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Filter Input</title>
<link rel="stylesheet" href="Design.css">
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<link rel="stylesheet" href="https://openlayers.org/en/v3.20.1/css/ol.css" type="text/css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="https://openlayers.org/en/v3.20.1/build/ol.js"></script>
<script>
 $(function() {
     $( "#datepicker1" ).datepicker({
         showOn: "both",
         buttonImage: "Kalender.png",
         buttonImageOnly: true,
         buttonText: "Kalender",
         dateFormat: 'dd-mm-yy'  
     });
 });
 
 $(function() {
     $( "#datepicker2" ).datepicker({
    	 showOn: "both",
         buttonImage: "C:/Users/lukas/workspace/Test1/Kalender.png",
         buttonImageOnly: true,
         buttonText: "Kalender",
         dateFormat: 'dd-mm-yy'  
     });
 });
 
 $(function() {
     $( "#datepicker3" ).datepicker({
    	 showOn: "both",
         buttonImage: "C:/Users/lukas/workspace/Test1/Kalender.png",
         buttonImageOnly: true,
         buttonText: "Kalender",
         dateFormat: 'dd-mm-yy'  
     });
 });
 
 $(function() {
     $( "#datepicker4" ).datepicker({
    	 showOn: "both",
         buttonImage: "C:/Users/lukas/workspace/Test1/Kalender.png",
         buttonImageOnly: true,
         buttonText: "Kalender",
         dateFormat: 'dd-mm-yy'  
     });
 });
 
 $(function() {
     $( "#datepicker5" ).datepicker({
    	 showOn: "both",
         buttonImage: "C:/Users/lukas/workspace/Test1/Kalender.png",
         buttonImageOnly: true,
         buttonText: "Kalender",
         dateFormat: 'dd-mm-yy'  
     });
 });
 
 $(function() {
     $( "#datepicker6" ).datepicker({
    	 showOn: "both",
         buttonImage: "C:/Users/lukas/workspace/Test1/Kalender.png",
         buttonImageOnly: true,
         buttonText: "Kalender",
         dateFormat: 'dd-mm-yy'  
     });
 });
 
 $(function() {
     $( "#datepicker7" ).datepicker({
    	 showOn: "both",
         buttonImage: "C:/Users/lukas/workspace/Test1/Kalender.png",
         buttonImageOnly: true,
         buttonText: "Kalender",
         dateFormat: 'dd-mm-yy'  
     });
 });
 
 $(function() {
     $( "#datepicker8" ).datepicker({
    	 showOn: "both",
         buttonImage: "C:/Users/lukas/workspace/Test1/Kalender.png",
         buttonImageOnly: true,
         buttonText: "Kalender",
         dateFormat: 'dd-mm-yy'  
     });
 });
</script>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

<form action="Success.jsp">
	<input type="text" name="eingabe">
	<button type="submit">Submit</button>
</form>

<form action="Success.jsp">
		<fieldset id="Fieldset_Flugzeuginformationen">
			<legend id="Legend_Flugzeuginformationen">Flugzeuginformationen</legend><br>
			<label>ID:</label> 
			<input type="text" id="Id" name="Id"><br>
			<label>Typ:</label>
			<input type="text" id="Typ"><br>
			<label>Spannweite:</label>
			<input type="text" id="Spannweite"><br>
			<label>Maximalgewicht:</label>
			<input type="text" id="Maximalgewicht"><br>
			<label>Minimalgewicht:</label>
			<input type="text" id="Minimalgewicht"><br>
		</fieldset><br>
		
		<fieldset id="Fieldset_Flugroute">
			<legend id="Legend_Flugroute">Flugroute</legend><br>
			
				<fieldset id="Fieldset_Abflugflughafen">
					<legend id="Legend_Abflugflughafen">Abflugflughafen</legend><br>
					<label> ID:</label>
					<input type="text" id="Id"><br>
					<label id="Label_Datum_Anfang">Startdatum:</label>
					<input type="text" id="datepicker1">
					<label id="Label_Uhrzeit_Anfang">Startuhrzeit:</label>
					<input type="text" id="Textfield_Uhrzeit_Anfang" placeholder="example: 15:30"><br>
					<label id="Label_Datum_Ende">Endedatum:</label>
					<input type="text" id="datepicker2">
					<label id="Label_Uhrzeit_Ende">Endeuhrzeit:</label>
					<input type="text" id="Textfield_Uhrzeit_Ende" placeholder="example: 17:30"><br>
					<label id="Flugregeln">Flugregeln:</label>
					<select id="Auswahl_Flugregeln">
 						<option value="IFR">IFR</option>
  						<option value=" VFR">VFR</option>
					</select><br><br>
					<label id="Wetterbedingungen">Wetterbedingungen:</label>
					<select id="Auswahl_Wetterbedingungen">
 						<option value="IMC">IMC</option>
  						<option value=" VMC">VMC</option>
					</select> 
				</fieldset><br>
				
				<fieldset id="Fieldset_Area">
					<legend id="Legend_Area">Area</legend><br>
					<label> ID:</label>
					<input type="text" id="Id"><br>
					<label id="Label_Datum_Anfang">Startdatum:</label>
					<input type="text" id="datepicker3">
					<label id="Label_Uhrzeit_Anfang">Startuhrzeit:</label>
					<input type="text" id="Textfield_Uhrzeit_Anfang" placeholder="example: 15:30"><br>
					<label id="Label_Datum_Ende">Endedatum:</label>
					<input type="text" id="datepicker4">
					<label id="Label_Uhrzeit_Ende">Endeuhrzeit:</label>
					<input type="text" id="Textfield_Uhrzeit_Ende" placeholder="example: 17:30"><br>
					<label id="Flugregeln">Flugregeln:</label>
					<select id="Auswahl_Flugregeln">
 						<option value="IFR">IFR</option>
  						<option value=" VFR">VFR</option>
					</select><br><br>
					<label id="Wetterbedingungen">Wetterbedingungen:</label>
					<select id="Auswahl_Wetterbedingungen">
 						<option value="IMC">IMC</option>
  						<option value=" VMC">VMC</option>
					</select> 
				</fieldset><br>
					
				<fieldset id="Fieldset_Segment">
					<legend id="Legend_Segment">Segment</legend><br>
					<label> ID:</label>
					<input type="text" id="Id"><br>
					<label id="Label_Datum_Anfang">Startdatum:</label>
					<input type="text" id="datepicker5">
					<label id="Label_Uhrzeit_Anfang">Startuhrzeit:</label>
					<input type="text" id="Textfield_Uhrzeit_Anfang" placeholder="example: 15:30"><br>
					<label id="Label_Datum_Ende">Endedatum:</label>
					<input type="text" id="datepicker6">
					<label id="Label_Uhrzeit_Ende">Endeuhrzeit:</label>
					<input type="text" id="Textfield_Uhrzeit_Ende" placeholder="example: 17:30"><br>
					<label id="Flugregeln">Flugregeln:</label>
					<select id="Auswahl_Flugregeln">
 						<option value="IFR">IFR</option>
  						<option value=" VFR">VFR</option>
					</select><br><br>
					<label id="Wetterbedingungen">Wetterbedingungen:</label>
					<select id="Auswahl_Wetterbedingungen">
 						<option value="IMC">IMC</option>
  						<option value=" VMC">VMC</option>
					</select> 
				</fieldset><br>
					
				<fieldset id="Fieldset_Zielflughafen">
					<legend id="Legend_Zielflughafen">Zielflughafen</legend><br>
					<label> ID:</label>
					<input type="text" id="Id"><br>
					<label id="Label_Datum_Anfang">Startdatum:</label>
					<input type="text" id="datepicker7">
					<label id="Label_Uhrzeit_Anfang">Startuhrzeit:</label>
					<input type="text" id="Textfield_Uhrzeit_Anfang" placeholder="example: 15:30"><br>
					<label id="Label_Datum_Ende">Endedatum:</label>
					<input type="text" id="datepicker8">
					<label id="Label_Uhrzeit_Ende">Endeuhrzeit:</label>
					<input type="text" id="Textfield_Uhrzeit_Ende" placeholder="example: 17:30"><br>
					<label id="Flugregeln">Flugregeln:</label>
					<select id="Auswahl_Flugregeln">
 						<option value="IFR">IFR</option>
  						<option value=" VFR">VFR</option>
					</select><br><br>
					<label id="Wetterbedingungen">Wetterbedingungen:</label>
					<select id="Auswahl_Wetterbedingungen">
 						<option value="IMC">IMC</option>
  						<option value=" VMC">VMC</option>
					</select> 
				</fieldset><br>
				
			<div id="Karte" class="Karte"></div><br>
			<label id="Label_Optionen">Optionen:</label>
      		<select id="Auswahl_Optionen">  
        		<option value="LineString">Linie</option>
        		<option value="Polygon">Polygon</option>
        		<option value="Circle">Kreis</option>
        		<option value="None">None</option>
      		</select>
     	</fieldset><br>
     	<button type="submit" id="Button_Filtern">Filtern</button>
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
    	     center: [-11000000, 4600000],
    	     zoom: 4
    	     })
    	});

    	var typeSelect = document.getElementById('Auswahl_Optionen');

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