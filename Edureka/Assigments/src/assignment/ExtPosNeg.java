package assignment;

import java.util.Scanner;

public class ExtPosNeg {

    // Extend the previous program to check if the number is positive, zero or negative

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = sc.nextInt();

        if(num < 0 )
            System.out.println(num + " is a NEGETIVE number.");
        else if (num > 0)
            System.out.println(num + " is a POSITIVE number.");
        else
            System.out.println(num + " is ZERO.");
    }
}
