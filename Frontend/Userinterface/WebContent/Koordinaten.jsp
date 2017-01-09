<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
<meta name="apple-mobile-web-app-capable" content="yes">
<title>Insert title here</title>
<script src="http://www.openlayers.org/api/OpenLayers.js"></script>
        
        <style type="text/css">
          html, body, #mapdiv {
              width:100%; height:100%; margin:0;
          }
          
          .olImageLoadError { display: none; } /* no pink tiles */ 
        </style>
  
        <script type="text/javascript">
        
            //Set up a click handler
            OpenLayers.Control.Click = OpenLayers.Class(OpenLayers.Control, {                
                defaultHandlerOptions: {
                    'single': true,
                    'double': false,
                    'pixelTolerance': 0,
                    'stopSingle': false,
                    'stopDouble': false
                },

                initialize: function(options) {
                    this.handlerOptions = OpenLayers.Util.extend(
                        {}, this.defaultHandlerOptions
                    );
                    OpenLayers.Control.prototype.initialize.apply(
                        this, arguments
                    ); 
                    this.handler = new OpenLayers.Handler.Click(
                        this, {
                            'click': this.trigger
                        }, this.handlerOptions
                    );
                }, 

                trigger: function(e) {
                    //A click happened!
                    var lonlat = map.getLonLatFromViewPortPx(e.xy)
                    
                    lonlat.transform(
                      new OpenLayers.Projection("EPSG:900913"), 
                      new OpenLayers.Projection("EPSG:4326")
                    );
                    
                    
                    document.getElementById("long").value = lonlat.lon;
                    document.getElementById("lat").value = lonlat.lat;
                }

            });
            
            var map;
            function init(){
                map = new OpenLayers.Map('mapdiv');
                
                map.addLayer(new OpenLayers.Layer.OSM());
                map.zoomToMaxExtent();
                
                var click = new OpenLayers.Control.Click();
                map.addControl(click);
                click.activate();

            }
        </script>
</head>
<body onload="init()">
    <div id="mapdiv"></div><br>
    
    Long: <input type="text" id="long">
    
    Lat: <input type="text" id="lat">

</body>
</html>