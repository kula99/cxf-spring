package com.xavier.work.ws.weather;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-09-27T00:33:27.507+08:00
 * Generated source version: 3.1.5
 * 
 */
@WebService(targetNamespace = "http://www.webserviceX.NET", name = "GlobalWeatherSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface GlobalWeatherSoap {

    /**
     * Get weather report for all major cities around the world.
     */
    @WebResult(name = "GetWeatherResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "GetWeather", targetNamespace = "http://www.webserviceX.NET", className = "com.xavier.work.ws.weather.GetWeather")
    @WebMethod(operationName = "GetWeather", action = "http://www.webserviceX.NET/GetWeather")
    @ResponseWrapper(localName = "GetWeatherResponse", targetNamespace = "http://www.webserviceX.NET", className = "com.xavier.work.ws.weather.GetWeatherResponse")
    public String getWeather(
        @WebParam(name = "CityName", targetNamespace = "http://www.webserviceX.NET")
        String cityName,
        @WebParam(name = "CountryName", targetNamespace = "http://www.webserviceX.NET")
        String countryName
    );

    /**
     * Get all major cities by country name(full / part).
     */
    @WebResult(name = "GetCitiesByCountryResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "GetCitiesByCountry", targetNamespace = "http://www.webserviceX.NET", className = "com.xavier.work.ws.weather.GetCitiesByCountry")
    @WebMethod(operationName = "GetCitiesByCountry", action = "http://www.webserviceX.NET/GetCitiesByCountry")
    @ResponseWrapper(localName = "GetCitiesByCountryResponse", targetNamespace = "http://www.webserviceX.NET", className = "com.xavier.work.ws.weather.GetCitiesByCountryResponse")
    public String getCitiesByCountry(
        @WebParam(name = "CountryName", targetNamespace = "http://www.webserviceX.NET")
        String countryName
    );
}