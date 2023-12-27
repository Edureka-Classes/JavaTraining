package day6.except;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsTest {
    public static void main (String[] args) throws InterruptedException {
        int uid = 101;
        UserService service = new UserService();

        try {
            String userName = service.findUserNameById(uid);
            if(userName != null)
                System.out.println("Welcom " + userName);
            else
                System.out.println("Welcome Guest");
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nPlease wait for 5 seconds");
        Thread.sleep(5000);
        System.out.println("Thanks for waiting");

    }
}
