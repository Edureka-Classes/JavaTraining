package assigment1.reverseDigits;

public class ReverseDigits {
    public static void main(String[] args) {
        int digit = 1678;
        int rev = 0;

        for (; digit != 0; digit/=10  ){
            int temp = digit % 10;
            rev = rev * 10 + temp;
        }
        System.out.println(rev);
    }
}
