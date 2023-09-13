package assigment1.doWhileLoop;

public class Fibonacci {
    /* Write a program to generate 10 Fibonacci numbers.*/
    public static void main(String[] args) {

        int number = 10;
        int num1 = 0;
        int num2 = 1, i = 1;

        do {
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
            System.out.print(num1 + " \t");

            i++;

        }while (i <= number);

    }
}

