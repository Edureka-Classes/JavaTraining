package assignment;

import java.util.Scanner;

public class LargestOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first value: ");
        int value1 = scanner.nextInt();

        System.out.println("Enter a first value: ");
        int value2 = scanner.nextInt();

        if(value1 > value2)
            System.out.println(value1+ " is LARGEST.");
        else if (value1 < value2)
            System.out.println(value2+ " is LARGEST");
        else
            System.out.println("Both Equal");

    }
}
