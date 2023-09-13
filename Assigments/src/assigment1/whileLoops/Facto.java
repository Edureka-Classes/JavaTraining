package assigment1.whileLoops;

public class Facto {
    /* Write a programto find factorial of a number. */
    public static void main(String[] args) {
        int num = 5;
        int fact  = 1;

        int i = 1;
        while(i <= num){
            fact *= i;
            i++;
        }
        System.out.printf("The Factorial of %d = %d ", num, fact);
    }
}
