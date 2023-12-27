package assignment;

import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");

        int value = sc.nextInt();

//        if(value % 2 == 0)
//            System.out.println(value + " is EVEN number.");
//        else if(value % 2 != 0)
//            System.out.println(value + " is ODD number.");
//        else
//            System.err.println(value +" INVALID ");


        // Using Ternary
        String result = (value % 2 == 0 )? "Even" : "Odd";

        System.out.println(result);
    }
}
