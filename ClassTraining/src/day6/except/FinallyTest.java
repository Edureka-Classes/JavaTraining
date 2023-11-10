package day6.except;

import java.util.Scanner;

public class FinallyTest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int x = sc.nextInt();

            System.out.print("Enter another number: ");
            int y = sc.nextInt();

            int z = x / y;
            System.out.println(x + " / " + y + " = " + z);
        } catch (ArithmeticException e) {
            System.out.println("Inside catch block");
            System.err.println(e.toString());
        }finally {
            System.out.println("Application designed and developed by ");
            System.out.println("\t team @ edureka ");
            sc.close();
        }
        System.out.println("Application completed");
    }
}
