package assigment1.ifConditions.ifElseConditions;

public class PosNegNumber {

    public static void main(String[] args) {
        /* Write a program to check if the number is positive ornegative */
        int num = -34;
        if(num >= 0){
            System.out.println("Positibe Number.");
        } else {
            System.out.println("Negative Number.");
        }

        /* Extend the previous program to check whether the given number
        is positive, zero or negative */

        int num2 = 0;
        if(num2 > 0){
            System.out.println("Positibe Number.");
        } else if( num2 != 0) {
            System.out.println("Negative Number.");
        } else {
            System.out.println("Zero");
        }
    }

}
