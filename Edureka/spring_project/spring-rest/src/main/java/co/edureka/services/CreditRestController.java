package co.edureka.services;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;

@Path("/credit")
public class CreditRestController {

    @GET
    @Path("/score")
    @Produces("text/plain")
    public String getCreditScore(@QueryParam("name") String customerName, @QueryParam("scores") String pan){
        if(pan != null && pan.length()==10 )
            return String.format("Hello %s, your CREDIT Score is 812", customerName);
        return String.format("Hello %s, sub,itted PAN is not invalid", customerName);
    }
}
