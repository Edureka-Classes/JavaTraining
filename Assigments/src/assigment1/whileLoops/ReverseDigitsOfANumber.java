package assigment1.whileLoops;

public class ReverseDigitsOfANumber {
    /* Write a program to reverse the digits of a number. */

    public static void main(String[] args) {
        int digits = 1879;
        int reverse = 0;
//    int i = 1;

        while(digits != 0 ){
            int temp = digits % 10;
            reverse = reverse * 10 + temp;
            digits /= 10;
        }
        System.out.println(reverse);
    }


}
