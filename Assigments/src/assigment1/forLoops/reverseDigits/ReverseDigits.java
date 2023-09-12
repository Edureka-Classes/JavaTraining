package assigment1.forLoops.reverseDigits;

public class ReverseDigits {
    public static void main(String[] args) {

        /* Write a program to reverse the digits of a number. */
        int digit = 1678;
        int rev = 0;

        for (; digit != 0; digit/=10  ){
            int temp = digit % 10;
            rev = rev * 10 + temp;
        }
        System.out.println(rev);
    }
}
