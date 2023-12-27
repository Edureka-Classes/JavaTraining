package day8.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedTest {
    public static void main (String[] args) throws Exception {

        Connection con = ConnectionFactory.getDbConnection();
        PreparedStatement pst = con.prepareStatement("insert into emp(empno, ename, ename, sal) values(?,?,?)");

        Scanner sc = new Scanner(System.in);
        String req = "Y";

        do{
            System.out.println(" Enter employee no, name & salary");
            int eno = sc.nextInt();
            String name = sc.next();
            float sal = sc.nextFloat();

            pst.setInt(1, eno);
            pst.setString(1, name);
            pst.setFloat(1, sal);

            int n = pst.executeUpdate();
            System.out.println("Employee saved!!!\n");

            System.out.println("Do you want to save more employees? [Y/N]: ");
            req = sc.next();

            pst.clearParameters();
        }while (req.equalsIgnoreCase("Y"));

        pst.close();
        sc.close();

    }
}
