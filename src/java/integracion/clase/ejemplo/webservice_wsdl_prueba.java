package integracion.clase.ejemplo;

import javax.jws.WebService;


@WebService(serviceName = "GlobalWeather", portName = "GlobalWeatherSoap", endpointInterface = "net.webservicex.GlobalWeatherSoap", targetNamespace = "http://www.webserviceX.NET", wsdlLocation = "WEB-INF/wsdl/webservice_wsdl_prueba/globalweather.asmx.wsdl")
public class webservice_wsdl_prueba {

    public java.lang.String getWeather(java.lang.String cityName, java.lang.String countryName) {
        //TODO implement this method
        //** this is actually implemented within by NetBeans
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String getCitiesByCountry(java.lang.String countryName) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
