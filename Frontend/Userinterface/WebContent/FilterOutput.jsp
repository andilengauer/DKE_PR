<?xml version="1.0" encoding="ISO-8859-1" ?>
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
<link rel="stylesheet" href="Design.css">
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<link rel="stylesheet" href="https://openlayers.org/en/v3.20.1/css/ol.css" type="text/css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="https://openlayers.org/en/v3.20.1/build/ol.js"></script>

<%
	//Flugzeuginformationen
	String idflugzeug = "";
	String typflugzeug = "";
	String spannweiteflugzeug = "";
	String maximalgewichtflugzeug = "";
	String minimalgewichtflugzeug = "";
	
	//Abflugflughafen
	String idabflughafen = "";
	String datepicker1abflughafen ="";
	String startuhrzeitabflughafen = "";
	String datepicker2abflughafen = "";
	String endeuhrzeitabflughafen ="";
	String flugregelnabflugflughafen = "";
	String wetterbedingungenabflugflughafen = "";

	//Area
	String idarea = "";
	String datepicker3area ="";
	String startuhrzeitarea = "";
	String datepicker4area = "";
	String endeuhrzeitarea ="";
	String flugregelnarea = "";
	String wetterbedingungenarea ="";
	
	//Segment
	String idsegment = "";
	String datepicker5segment ="";
	String startuhrzeitsegment = "";
	String datepicker6segment = "";
	String endeuhrzeitsegment ="";
	String flugregelnsegment = "";
	String wetterbedingungensegment ="";
	
	//Zielflughafen
	String idzielflughafen = "";
	String datepicker7zielflughafen ="";
	String startuhrzeitzielflughafen = "";
	String datepicker8zielflughafen = "";
	String endeuhrzeitzielflughafen = "";
	String flugregelnzielflughafen = "";
	String wetterbedingungenzielflughafen = "";
	
	if (request.getParameter("Submit") != null)
	{
		//Flugzeuginformationen
		idflugzeug = request.getParameter("Id_Flugzeug");
		typflugzeug = request.getParameter("Typ_Flugzeug");
		spannweiteflugzeug = request.getParameter("Spannweite_Flugzeug");
		maximalgewichtflugzeug = request.getParameter("Maximalgewicht_Flugzeug");
		minimalgewichtflugzeug = request.getParameter("Minimalgewicht_Flugzeug");
		
		//Abflugflughafen
		idabflughafen = request.getParameter("Id_Abflugflughafen");
		datepicker1abflughafen = request.getParameter("datepicker1_Abflugflughafen");
		startuhrzeitabflughafen = request.getParameter("Textfield_Uhrzeit_Anfang_Abflugflughafen");
	 	datepicker2abflughafen = request.getParameter("datepicker2_Abflugflughafen");
	 	endeuhrzeitabflughafen = request.getParameter("Textfield_Uhrzeit_Ende_Abflugflughafen");
	 	flugregelnabflugflughafen = request.getParameter("Textfield_Auswahl_Flugregeln_Ablugflughafen");
	 	wetterbedingungenabflugflughafen = request.getParameter("Textfield_Auswahl_Wetterbedingungen_Ablugflughafen");
	 	
	 	//Area
	 	idarea = request.getParameter("Id_Area");
		datepicker3area = request.getParameter("datepicker3_Area");
		startuhrzeitarea = request.getParameter("Textfield_Uhrzeit_Anfang_Area");
	 	datepicker4area = request.getParameter("datepicker4_Area");
	 	endeuhrzeitarea = request.getParameter("Textfield_Uhrzeit_Ende_Area");
	 	flugregelnarea = request.getParameter("Textfield_Auswahl_Flugregeln_Area");
	 	wetterbedingungenarea = request.getParameter("Textfield_Auswahl_Wetterbedingungen_Area");
	 	
	 	//Segment
	 	idsegment = request.getParameter("Id_Segment");
		datepicker5segment = request.getParameter("datepicker5_Segment");
		startuhrzeitsegment = request.getParameter("Textfield_Uhrzeit_Anfang_Segment");
	 	datepicker6segment = request.getParameter("datepicker6_Segment");
	 	endeuhrzeitsegment = request.getParameter("Textfield_Uhrzeit_Ende_Segment");
	 	flugregelnsegment = request.getParameter("Textfield_Auswahl_Flugregeln_Segment");
	 	wetterbedingungensegment = request.getParameter("Textfield_Auswahl_Wetterbedingungen_Segment");
	 	
	 	//Zielflughafen
	 	idzielflughafen = request.getParameter("Id_Zielflughafen");
		datepicker7zielflughafen = request.getParameter("datepicker7_Zielflughafen");
		startuhrzeitzielflughafen = request.getParameter("Textfield_Uhrzeit_Anfang_Zielflughafen");
	 	datepicker8zielflughafen = request.getParameter("datepicker8_Zielflughafen");
	 	endeuhrzeitzielflughafen = request.getParameter("Textfield_Uhrzeit_Ende_Zielflughafen");
	 	flugregelnzielflughafen = request.getParameter("Textfield_Auswahl_Flugregeln_Zielflughafen");
	 	wetterbedingungenzielflughafen = request.getParameter("Textfield_Auswahl_Wetterbedingungen_Zielflughafen");
	}
%>

</head>
<body>
	<%
	out.println("ID des Flugzeuges" + AppController.getInstance().getCurrentId());
	%>
	<form>
		<fieldset id="Fieldset_Flugzeuginformationen">
			<legend id="Legend_Flugzeuginformationen">Flugzeuginformationen</legend><br>
			<label>ID:</label> 
			<input type="text" name="Id_Flugzeug" id="Id_Flugzeug" value=<%=idflugzeug %>><br>
			<label>Typ:</label>
			<input type="text" name="Typ_Flugzeug" id="Typ_Flugzeug" value=<%=typflugzeug %>><br>
			<label>Spannweite:</label>
			<input type="text" name="Spannweite_Flugzeug" id="Spannweite_Flugzeug" value=<%=spannweiteflugzeug %>><br>
			<label>Maximalgewicht:</label>
			<input type="text" name="Maximalgewicht_Flugzeug" id="Maximalgewicht_Flugzeug" value=<%=maximalgewichtflugzeug %>><br>
			<label>Minimalgewicht:</label>
			<input type="text" name="Minimalgewicht_Flugzeug" id="Minimalgewicht_Flugzeug" value=<%=minimalgewichtflugzeug %>><br>
		</fieldset><br>
		
		<fieldset id="Fieldset_Flugroute">
			<legend id="Legend_Flugroute">Flugroute</legend><br>
			
				<fieldset id="Fieldset_Abflugflughafen">
					<legend id="Legend_Abflugflughafen">Abflugflughafen</legend><br>
					<label> ID:</label>	
					<input type="text" name="Id_Abflugflughafen" id="Id_Abflugflughafen" value=<%=idabflughafen %>><br>
					<label name="Label_Datum_Anfang_Abflugflughafen" id="Id_Abflugflughafen">Startdatum:</label>
					<input type="text" name="datepicker1_Abflugflughafen" id="datepicker1_Abflugflughafen" value=<%=datepicker1abflughafen %>>
					<label name="Label_Uhrzeit_Anfang_Abflugflughafen" id="Label_Uhrzeit_Anfang_Abflugflughafen">Startuhrzeit:</label>
					<input type="text" name="Textfield_Uhrzeit_Anfang_Abflugflughafen" id="Textfield_Uhrzeit_Anfang_Abflugflughafen" placeholder="example: 15:30" value=<%=startuhrzeitabflughafen %> ><br>
					<label name="Label_Datum_Ende_Abflugflughafen" id="Label_Datum_Ende_Abflugflughafen">Endedatum:</label>
					<input type="text" name="datepicker2_Abflugflughafen" id="datepicker2_Abflugflughafen" value=<%=datepicker2abflughafen %>>
					<label name="Label_Uhrzeit_Ende_Abflugflughafen" id="Label_Uhrzeit_Ende_Abflugflughafen">Endeuhrzeit:</label>
					<input type="text" name="Textfield_Uhrzeit_Ende_Abflugflughafen" id="Textfield_Uhrzeit_Ende_Abflugflughafen" placeholder="example: 17:30" value=<%=endeuhrzeitabflughafen %>><br>
					<label name="Flugregeln_Abflugflughafen" id="Flugregeln_Abflugflughafen">Flugregeln:</label>
					<input type="text" name="Textfield_Auswahl_Flugregeln_Ablugflughafen" id="Textfield_Auswahl_Flugregeln_Ablugflughafen" value=<%=flugregelnabflugflughafen %>></input><br></br>
					<label name="Wetterbedingungen_Abflugflughafen" id="Wetterbedingungen_Abflugflughafen">Wetterbedingungen:</label>
					<input type="text" name="Textfield_Auswahl_Wetterbedingungen_Ablugflughafen" id="Textfield_Auswahl_Wetterbedingungen_Ablugflughafen" value=<%=wetterbedingungenabflugflughafen %>></input><br></br>
				</fieldset><br>
				
				<fieldset id="Fieldset_Area">
					<legend id="Legend_Area">Area</legend><br>
					<label> ID:</label>
					<input type="text" name="Id_Area" id="Id_Area" value=<%=idarea %>><br>
					<label name="Label_Datum_Anfang_Area" id="Label_Datum_Anfang_Area">Startdatum:</label>
					<input type="text" name="datepicker3_Area" id="datepicker3_Area" value=<%=datepicker3area %>>
					<label name="Label_Uhrzeit_Anfang_Area" id="Label_Uhrzeit_Anfang_Area">Startuhrzeit:</label>
					<input type="text" name="Textfield_Uhrzeit_Anfang_Area" id="Textfield_Uhrzeit_Anfang_Area" placeholder="example: 15:30" value=<%=startuhrzeitarea %>><br>
					<label name="Label_Datum_Ende_Area" id="Label_Datum_Ende_Area">Endedatum:</label>
					<input type="text" name="datepicker4_Area" id="datepicker4_Area" value=<%=datepicker4area %>>
					<label name="Label_Uhrzeit_Ende_Area" id="Label_Uhrzeit_Ende_Area">Endeuhrzeit:</label>
					<input type="text" name="Textfield_Uhrzeit_Ende_Area" id="Textfield_Uhrzeit_Ende_Area" placeholder="example: 17:30" value=<%=endeuhrzeitarea %>><br>
					<label name="Flugregeln_Area" id="Flugregeln_Area">Flugregeln:</label>
					<input type="text" name="Textfield_Auswahl_Flugregeln_Area" id="Textfield_Auswahl_Flugregeln_Area" value=<%=flugregelnarea %>></input><br></br>
					<label name="Wetterbedingungen_Area" id="Wetterbedingungen_Area">Wetterbedingungen:</label>
					<input type="text" name="Textfield_Auswahl_Wetterbedingungen_Area" id="Textfield_Auswahl_Wetterbedingungen_Area" value=<%=wetterbedingungenarea %>></input><br></br>
				</fieldset><br>
					
				<fieldset id="Fieldset_Segment">
					<legend id="Legend_Segment">Segment</legend><br>
					<label> ID:</label>		
					<input type="text" name="Id_Segment" id="Id_Segment" value=<%=idsegment %>><br>
					<label name="Label_Datum_Anfang_Segment" id="Label_Datum_Anfang_Segment">Startdatum:</label>
					<input type="text" name="datepicker5_Segment" id="datepicker5_Segment" value=<%=datepicker5segment %>>
					<label name="Label_Uhrzeit_Anfang_Segment" id="Label_Uhrzeit_Anfang_Segment">Startuhrzeit:</label>
					<input type="text" name="Textfield_Uhrzeit_Anfang_Segment" id="Textfield_Uhrzeit_Anfang_Segment" placeholder="example: 15:30" value=<%=startuhrzeitsegment %>><br>
					<label name="Label_Datum_Ende_Segment" id="Label_Datum_Ende_Segment">Endedatum:</label>
					<input type="text" name="datepicker6_Segment" id="datepicker6_Segment" value=<%=datepicker6segment %>>
					<label name="Label_Uhrzeit_Ende_Segment" id="Label_Uhrzeit_Ende_Segment">Endeuhrzeit:</label>
					<input type="text" name="Textfield_Uhrzeit_Ende_Segment" id="Textfield_Uhrzeit_Ende_Segment" placeholder="example: 17:30" value=<%=endeuhrzeitsegment %>><br>
					<label name="Flugregeln_Segment" id="Flugregeln_Segment">Flugregeln:</label>
					<input type="text" name="Textfield_Auswahl_Flugregeln_Segment" id="Textfield_Auswahl_Flugregeln_Segment" value=<%=flugregelnsegment %>></input><br></br>
					<label name="Wetterbedingungen_Segment" id="Wetterbedingungen_Segment">Wetterbedingungen:</label>
					<input type="text" name="Textfield_Auswahl_Wetterbedingungen_Segment" id="Textfield_Auswahl_Wetterbedingungen_Segment" value=<%=wetterbedingungensegment %>></input><br></br>
				</fieldset><br>
					
				<fieldset id="Fieldset_Zielflughafen">
					<legend id="Legend_Zielflughafen">Zielflughafen</legend><br>
					<label> ID:</label>
					<input type="text" name="Id_Zielflughafen" id="Id_Zielflughafen" value=<%=idzielflughafen %>><br>
					<label name="Label_Datum_Anfang_Zielflughafen" id="Label_Datum_Anfang_Zielflughafen">Startdatum:</label>
					<input type="text" name="datepicker7_Zielflughafen" id="datepicker7_Zielflughafen" value=<%=datepicker7zielflughafen %>>
					<label name="Label_Uhrzeit_Anfang_Zielflughafen" id="Label_Uhrzeit_Anfang_Zielflughafen">Startuhrzeit:</label>
					<input type="text" name="Textfield_Uhrzeit_Anfang_Zielflughafen" id="Textfield_Uhrzeit_Anfang_Zielflughafen" placeholder="example: 15:30" value=<%=startuhrzeitzielflughafen %>><br>
					<label name="Label_Datum_Ende_Zielflughafen" id="Label_Datum_Ende_Zielflughafen">Endedatum:</label>
					<input type="text" name="datepicker8_Zielflughafen" id="datepicker8_Zielflughafen" value=<%=datepicker8zielflughafen %>>
					<label name="Label_Uhrzeit_Ende_Zielflughafen" id="Label_Uhrzeit_Ende_Zielflughafen">Endeuhrzeit:</label>
					<input type="text" name="Textfield_Uhrzeit_Ende_Zielflughafen" id="Textfield_Uhrzeit_Ende_Zielflughafen" placeholder="example: 17:30" value=<%=endeuhrzeitzielflughafen %>><br>
					<label name="Flugregeln_Zielflughafen" id="Flugregeln_Zielflughafen">Flugregeln:</label>
					<input type="text" name="Textfield_Auswahl_Flugregeln_Zielflughafen" id="Textfield_Auswahl_Flugregeln_Zielflughafen" value=<%=flugregelnzielflughafen %>></input><br></br>
					<label name="Wetterbedingungen_Zielflughafen" id="Wetterbedingungen_Zielflughafen">Wetterbedingungen:</label>
					<input type="text" name="Textfield_Auswahl_Wetterbedingungen_Zielflughafen" id="Textfield_Auswahl_Wetterbedingungen_Zielflughafen" value=<%=wetterbedingungenzielflughafen %>></input><br></br>
				</fieldset><br>
				
			<div id="Karte" class="Karte"></div>
     	</fieldset><br>
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