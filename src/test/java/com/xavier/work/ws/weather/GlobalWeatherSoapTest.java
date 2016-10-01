package com.xavier.work.ws.weather;

import org.apache.cxf.feature.LoggingFeature;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Before;
import org.junit.Test;

public class GlobalWeatherSoapTest {
  
  private JaxWsProxyFactoryBean factory;
  private GlobalWeatherSoap weatherSoap;
  
  @Before
  public void setup() {
    factory = new JaxWsProxyFactoryBean();
    factory.setServiceClass(GlobalWeatherSoap.class);
    factory.setAddress("http://www.webservicex.net/globalweather.asmx");
    
    LoggingFeature loggingFeature = new LoggingFeature();
    loggingFeature.setPrettyLogging(true);
    factory.getFeatures().add(loggingFeature);
    
    weatherSoap = (GlobalWeatherSoap) factory.create();
  }

  @Test
  public void testGetCities() {
    String resp = weatherSoap.getCitiesByCountry("China");
    System.out.println(resp);
  }
  
  @Test
  public void testGetWeather() {
    String resp = weatherSoap.getWeather("Beijing", "China");
    System.out.println(resp);
  }

}
