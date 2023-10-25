package day2;

import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first No: ");
        int fno = sc.nextInt();

        System.out.print("Enter second No: ");
        int sno = sc.nextInt();

        int sum = fno + sno;
        System.out.println("sum = " +sum);
        System.out.printf("%d + %d = %d ", fno, sno, sum);


    }
}
