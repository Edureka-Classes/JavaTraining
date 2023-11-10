package day6.except;

import java.util.Scanner;

public class VotingApp {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String req = " ";

        do {
            System.out.print("Enter gae of voter: ");
            try{
                int age = sc.nextInt();
                if(age >= 18)
                    System.out.println("$$$ ---- Voting Done ---- <beep><beep> ---- $$$");
                else
                    throw new InvalidAgeException("Age of voter should be >= 18");
            }catch (Exception e){
                System.err.println(e);
            }
            System.out.print("Anyone else to vote [y/n]: ");
            req = sc.next();
        }while(req.equalsIgnoreCase("Y"));
    }
}
