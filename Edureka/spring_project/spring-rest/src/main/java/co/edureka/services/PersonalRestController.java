package co.edureka.services;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

import java.time.LocalDate;

@Path("/personal")
public class PersonalRestController {
    @GET
    @Produces("text/plain")
    @Path("/age/{name}/{yob}")
    public String eligibilityCheckForInsurance(@PathParam("name") String name, @PathParam("yob") Integer yob){
        if(yob < currentYear()){
            int age = currentYear() - yob;
            return String.format("Hi %s, your are eligible for this Insurance as you are %d years of age completed.", name, age);
        } else {
            return String.format("Hi %s, your submitted birth year (%d) is NOT VALID", name, yob);
        }
    }

    private int currentYear() {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        return year;
    }
}
