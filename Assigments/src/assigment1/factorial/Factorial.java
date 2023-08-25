package assigment1.factorial;

public class Factorial {
    public static void main(String[] args) {

        /* Write a program to find factorial ofa number */
        int num = 5;
        int fact = 1;

        for(int i = 1; i <= num; i++){
            fact *= i;
        }

        System.out.printf("The Factorial of %d = %d ", num, fact);
    }
}
