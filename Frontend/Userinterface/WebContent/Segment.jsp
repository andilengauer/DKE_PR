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
<!-- 	Im nachfolgenden wird ein Fieldset generiert.
		In diesem Fieldset werden die Eingabefelder, Labels, Auswahllisten, Datepickers und Button definiert.
		Der Datepicker ist eine Hilfestellung zur leichteren Auswahl eines Datums. Der Datepicker wird über ein CSS-File
		und ein Java-Script-File im Header eingebunden.
		Der Button dient dazu, dass wieder auf die Startseite zurückgesprungen werden kann.
-->
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
					
					<!--	Es wird eine Tabelle generiert.
							Diese Tabelle enthält Informationen über die eingefügten Segmente.
							Es werden die Tectfelder befüllt und mit anschließendenm Klick auf den Button werden die 
							Informationen in einer Tabelle gespeichert. Diese Tabelle wird dann an die Business Rule Engine übergeben
					 -->
					<button type="button" id="Segment_speichern" onclick="addRow()">Segment hinzufügen</button><br></br>
					<table id="Tabelle">
					<tr>
						<th>ID</th>
						<th>Startpunkt</th>
						<th>Endpunkt</th>
					</tr>
					</table>
				</fieldset><br>
				
				<!--	Es wird eine Karte eingefügt.
						Es kann in einer Auswahlliste eine Option ausgewählt werden.
						Mit Auswahl einer der folgenden Optionen kann dann auf der Karte gezeichnet werden.
						Optionen sind: Zeichnen von Linie, Polygon und nichts zeichnen
				 -->
				<div id="Karte" class="Karte"></div><br>
				<label name="Label_Optionen_Karte" id="Label_Optionen_Karte">Wählen&nbsp;Sie&nbsp;bitte&nbsp;die&nbsp;gewünschte&nbsp;Option&nbsp;aus:</label>
      			<select name="Auswahl_Optionen_Karte" id="Auswahl_Optionen_Karte">  
        			<option value="LineString">Linie</option>
        			<option value="Polygon">Polygon</option>
        			<option value="None">None</option>
      			</select><br></br><br></br>
     	
     	
				<input type="submit" id="Startseite" value="Zurück zur Startseite"></input>
			</form>
				
				<script>
				//Im nachfolden wird beschrieben, wie die Map generiert wird und wie das Zeichnwn funktioniert.
    			var raster = new ol.layer.Tile({	//Ein neuer layer mit einem Tile wird defininert
    				source: new ol.source.OSM()
    			});

    			var source = new ol.source.Vector({wrapX: false});	

    			var vector = new ol.layer.Vector({	//Ein neuer layer mit einem Vector wird defininert
           			source: source
 	    		});
				
		  	    var map = new ol.Map({	//Hier wird die Map erstellt
		    	     layers: [raster, vector],
		    	     target: 'Karte',
		    	     view: new ol.View({	//Eine sich wird eingefügt, d.h.  welcher Punkt in der Map beim Laden angezeogt wird
		    	     center: ol.proj.fromLonLat([16.37, 48.209]),	//In diesem Fall habe ich alternativ die Stadt Wien als view gewählt
		    	     zoom: 4	//Der Zoomfaktor, welcher beim Laden angezeigt wird
		    	     })
		    	});
		
		    	var typeSelect = document.getElementById('Auswahl_Optionen_Karte');	//Es wird das Option von der Auswahlliste in die Variable "typeSelect" gespeichert
		
		    	//Mit Hilfe dieser Function kann dann auf der Karte gezeichnet werden
		    	var draw;
		    	function addInteraction() {
		     		var value = typeSelect.value;
		    	    if (value !== 'None') {	//Es wird überprüft, ob die Option nicht "None" ist
		    	    	draw = new ol.interaction.Draw({	//Bei einer anderen Auswahl als "None" kann auf der Karte gezeichnet werden
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
		   
		    	//Es wird ein Click-Handler generiert, der es ermöglicht mit einem Klick auf die Karte die Koordinaten anzuzeigen
		      	map.on('click', function(evt) {
		        	var coordinate = evt.coordinate;
		        	var lonlat = ol.coordinate.toStringXY(ol.proj.toLonLat(
		            coordinate, 'EPSG:3857', 'EPSG:4326'));	//Mit einem Klick auf die Karte werden die Koordinaten in die Variable "lonlat" gespeichert
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
   	
			   	<script>
			   	//Mit Hilfe dieser Function wird eine neue Zeile in einer Tabelle hinzugefügt und die Zellen mit den Werten von der Textbox befüllt
			   	function addRow() {
			   		var tabelle = document.getElementById("Tabelle");	//Die Tabelle wird in die Variable "Tabelle" gespeichert
			   	   	var reihe = tabelle.insertRow(-1);	//Es wird eine neue Reihe in der Tabelle unterhalb hinzugefügt
			   	   	var id = reihe.insertCell(0);	//Es wird eine neues Zelle hinzugefügt
			   	   	var startpunkt = reihe.insertCell(1);	//Es wird eine neues Zelle hinzugefügt
			   	 	var endpunkt = reihe.insertCell(2);	//Es wird eine neues Zelle hinzugefügt
			   	   		
			   	   	id.innerHTML = document.getElementById("Id_Segment").value;	//Es wird die Zelle "id" mit dem Inhalt der Textbox befüllt
			   	   	startpunkt.innerHTML = document.getElementById("Startpunkt_Segment").value; //Es wird die Zelle "Startpunkt" mit dem Inhalt der Textbox befüllt
			   	 	endpunkt.innerHTML = document.getElementById("Endpunkt_Segment").value;	//Es wird die Zelle "Endpunkt" mit dem Inhalt der Textbox befüllt
			   	 		
			   		document.getElementById("Id_Segment").value = "";	// Nach Klick auf den Button werden dann auch noch die Textfelder geleert, damit sie wieder befüllt werden können
		 	 		document.getElementById("Startpunkt_Segment").value = "";	// Nach Klick auf den Button werden dann auch noch die Textfelder geleert, damit sie wieder befüllt werden können
		  	 		document.getElementById("Endpunkt_Segment").value = "";	// Nach Klick auf den Button werden dann auch noch die Textfelder geleert, damit sie wieder befüllt werden können
			   	}
			   			
			   	</script>

</body>
</html>