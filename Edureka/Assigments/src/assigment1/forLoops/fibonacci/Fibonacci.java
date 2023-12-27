package assigment1.forLoops.fibonacci;

public class Fibonacci {
    public static void main(String[] args) {

        /* Write a program to generate 10 Fibonacci numbers */
        int number = 10, num1 = 0, num2 =1;

        for(int i = 1; i <= number; ++i){
             int temp = num1 + num2;
             num1 = num2;
             num2 = temp;
            System.out.print(num1 + ", ");
        }

    }
}
