package co.edureka.services;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/edureka")
public class EdurekaServices {

    @GET
    @Produces("text/plain")
    public String indiaCustomerService() {
        return "welcome to edureka india customer service";
    }

    @GET
    @Produces("text/html")
    @Path("/intl1")
    public String internationalCustomerService() {
        return "<p style=color:blue;font-size:30px> welcome to edureka international customer service </p>";
    }
}
