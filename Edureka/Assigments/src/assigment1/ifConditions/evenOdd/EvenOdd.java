package assigment1.ifConditions.evenOdd;

public class EvenOdd {
    public static void main(String[] args) {

        /* Write a program to check given number is evenor odd. */

        int num = 575;

        if(num % 2 == 0){
            System.out.println(num + " is an Even Number");
        } else if (num % 2 != 0 ){
            System.out.println(num + " is an Odd Number");
        } else {
            System.out.println("Invalid selection");
        }
    }
}
