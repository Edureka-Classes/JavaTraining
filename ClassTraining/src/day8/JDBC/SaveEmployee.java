package day8;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployee {
    public static void main (String[] args) throws Exception{
        Connection con = ConnectionFactory.getDbConnection();
        Statement st = con.createStatement();

        String sql = "insert into emp(empno, ename, sal) values (102, 'Fatima', 65589.76),(103, 'Nasir', .76),(104, 'Maiwada', 56758.76), (105, 'Maryam', 4567.76)";

        int employeeSaved = st.executeUpdate(sql);
        System.out.printf("employee(s) saved = %d ", employeeSaved);

        st.close();
        con.close();
    }
}
