import java.util.Scanner;

public class Main {

        static void factorialNumber(){
            int n = 5;
            int fact = 1;

            for(int i = 1; i<= n; i++){
                fact *= i;
//                System.out.print(fact);
            }
            System.out.println(fact);
        }

        public static void main (String [] args){

            // Scanner sc = new Scanner(System.in);

            // System.out.print("Enter a number: ");
            // int num = sc.nextInt();

            factorialNumber();

    }

}