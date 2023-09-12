package assigment1.whileLoops.evenOdds;

public class Facto {
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
