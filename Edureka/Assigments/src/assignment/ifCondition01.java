package assignment;

import java.util.Scanner;

public class ifCondition01 {
    // Write a program to check if a candidate is eligible for voting or not
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");

        int age = sc.nextInt();

        if(age < 18)
            System.out.println("You are NOT eligible to VOTE.");
         else
            System.out.println("You are eligible to VOTE.");

    }
}
