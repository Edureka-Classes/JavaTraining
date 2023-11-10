package day6.except;

import java.io.IOException;
import java.sql.SQLException;

public class UserService {
    public String findUserNameById(int id) throws SQLException, IOException {
        if(id == 101)
            return "Buhari";
        return null;
    }
}
