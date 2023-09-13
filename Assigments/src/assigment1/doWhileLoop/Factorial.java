package assigment1.doWhileLoop;

public class Factorial {
    /* Write a programto find factorial of a number. */
    public static void main(String[] args) {
        int num = 5;
        int factorial = 1;
        int i = 1;
        do{
            factorial = factorial * i;
            System.out.print(factorial+"\t");
            i++;
        }while(i <= num);
    }
}
