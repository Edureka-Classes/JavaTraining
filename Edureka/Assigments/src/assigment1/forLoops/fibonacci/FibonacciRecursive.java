package assigment1.forLoops.fibonacci;

import java.util.Scanner;

public class FibonacciRecursive {
    static int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n - 2 ) + fib(n - 1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int f = sc.nextInt();

        for(int i = 0; i <= f; i++){
            System.out.print(fib(i) + "  ");
        }
    }
}
