
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.xavier.work.ws.weather;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-09-27T00:33:27.451+08:00
 * Generated source version: 3.1.5
 * 
 */

@WebService(
    serviceName = "GlobalWeather",
    portName = "GlobalWeatherSoap12",
    targetNamespace = "http://www.webserviceX.NET",
    wsdlLocation = "classpath:xsd/globalweather.wsdl",
    endpointInterface = "com.xavier.work.ws.weather.GlobalWeatherSoap")
                      
public class GlobalWeatherSoap12Impl implements GlobalWeatherSoap {

    private static final Logger LOG = LoggerFactory.getLogger(GlobalWeatherSoap12Impl.class);

    /* (non-Javadoc)
     * @see com.xavier.work.ws.weather.GlobalWeatherSoap#getWeather(String  cityName ,)String  countryName )*
     */
    public String getWeather(String cityName,String countryName) { 
        LOG.info("Executing operation getWeather");
        System.out.println(cityName);
        System.out.println(countryName);
        try {
            String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.xavier.work.ws.weather.GlobalWeatherSoap#getCitiesByCountry(String  countryName )*
     */
    public String getCitiesByCountry(String countryName) { 
        LOG.info("Executing operation getCitiesByCountry");
        System.out.println(countryName);
        try {
            String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
