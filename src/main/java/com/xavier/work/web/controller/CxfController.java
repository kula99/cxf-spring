package com.xavier.work.web.controller;

import javax.inject.Inject;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Qualifier;

import com.xavier.work.ws.weather.GlobalWeatherSoap;

/**
 * @author Xavier
 * @version 1.0
 *
 */
public class CxfController {
  
  @Inject
  @Qualifier("globalWeatherSoapClient")
  private GlobalWeatherSoap globalWatherSoapClient;
  
  @GET
  @Path("/getcities/{countryName}")
  public String getCities(@PathParam("countryName") String countryName) {
    return globalWatherSoapClient.getCitiesByCountry(countryName);
  }
  
  @POST
  @Path("/getweather")
  public String getWeather(@FormParam("countryName") String countryName, @FormParam("cityName") String cityName) {
    return globalWatherSoapClient.getWeather(cityName, countryName);
  }

}
