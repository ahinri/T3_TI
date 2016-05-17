package integracion.clases.ejemplo;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import net.webservicex.Airport;
import net.webservicex.AirportSoap;
import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

//this is a class annotation (also, here are for the method and for the param)
@WebService(serviceName = "mi_webservice")
public class mi_webservice {
    
    
    @WebMethod(operationName = "servicio_tarea")
    //el nombre del pais debe estar en ingles
    public String[] servicio_tarea(@WebParam(name = "pais") String pais) {
        
        //when i imported the WSDL(new/WebService from wsdl), the IDE imported this class(client)
        GlobalWeather gw =new GlobalWeather();
        Airport air=new Airport();
        
        //client instances
        GlobalWeatherSoap gws= gw.getGlobalWeatherSoap();
        AirportSoap airs = air.getAirportSoap();
                
        
        String ciudades=gws.getCitiesByCountry(pais);
        String aeropuertos= airs.getAirportInformationByCountry(pais);
      
       
        String[] result={ciudades,aeropuertos};
        return result;
    }
}
