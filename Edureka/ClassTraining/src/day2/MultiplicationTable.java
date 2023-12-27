package day2;

import java.util.Scanner;

public class MultiplicationTable {

    static void printTable(int num){

        int i = 1;
        while(i <= num){

            int mult = i * num;

            System.out.printf("%d X %d = %d %n", i, num , mult);

            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int num = sc.nextInt();

        printTable(num);
    }
}
