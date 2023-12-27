package assigment1.doWhileLoop;

import java.util.function.DoubleToIntFunction;

public class DiitsOfANumber {
    /*  Write a programto add the digits of a number. */

    public static void main(String[] args) {
        int digits = 789;
        int rev = 0;

        do {
            int temp = digits % 10;
            rev = rev * 10 + temp;
            digits /= 10;
        }while (digits != 0);

        System.out.println(rev);
    }
}
