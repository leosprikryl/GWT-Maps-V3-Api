package com.google.gwt.maps.client.services;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * The directions response retrieved from the directions server. You can render these using a DirectionsRenderer or parse this object and render it yourself. You must display the warnings and copyrights as noted in the Maps API terms of service. Note that though this result is "JSON-like," it is not strictly JSON, as it indirectly includes LatLng objects.
 * <br><br>
 * See <a href="https://developers.google.com/maps/documentation/javascript/reference#DirectionsResult">DirectionsResult API Doc</a>
 */
public class DirectionsResult extends JavaScriptObject {
  
  /**
   * use newInstance();
   */
  protected DirectionsResult() {}
  
  /**
   * An array of DirectionsRoutes, each of which contains information about the legs and steps of which it is composed. There will only be one route unless the DirectionsRequest was made with provideRouteAlternatives set to true. (This property was formerly known as "trips".)
   */
  public static final DirectionsResult newInstance() {
    return JavaScriptObject.createObject().cast();
  }
 
  /**
   * An array of DirectionsRoutes, each of which contains information about the legs and steps of which it is composed. There will only be one route unless the DirectionsRequest was made with provideRouteAlternatives set to true. (This property was formerly known as "trips".)
   * @param routes
   */
  public final native void setRoutes(JsArray<DirectionsRoute> routes) /*-{
    this.routes = routes;
  }-*/;
  
  /**
   * An array of DirectionsRoutes, each of which contains information about the legs and steps of which it is composed. There will only be one route unless the DirectionsRequest was made with provideRouteAlternatives set to true. (This property was formerly known as "trips".)
   */
  public final native JsArray<DirectionsRoute> getRoutes() /*-{
    return this.routes;
  }-*/;
  
}
