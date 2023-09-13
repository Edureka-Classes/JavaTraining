package assigment1.whileLoops;

public class Fibonacci {

    /* Write a program to generate 10 Fibonacci numbers */
    public static void main(String[] args) {

        int number = 6;
        int fib = 0;
        int num = 1, i = 1;

        while(i <= number){
            int temp = fib + num;
            fib = num;
            num = temp;
            System.out.print(fib+"\t");
            ++i;
        }
    }
}
