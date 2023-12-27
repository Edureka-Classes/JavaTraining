package co.edureka.services;

import co.edureka.model.Student;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/edureka")
public class StudentRestController {
    @POST
    @Produces("application/json")
    @Path("/register")
    public Student registrationNewStudent(@FormParam("name_field") String name, @FormParam("age-field") Integer age, @FormParam("addr_field") String address){
        //logic to save Student details tp DB
        Student st = new Student();
        st.setStudentName(name);
        st.setStudentAge(age);
        st.setStudentAddress(address);

        return st;
    }
}
