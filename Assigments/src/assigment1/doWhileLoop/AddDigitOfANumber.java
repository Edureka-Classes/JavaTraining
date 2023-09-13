package assigment1.doWhileLoop;

public class AddDigitOfANumber {
    /* Write a programto add the digits of a number. */
    public static void main(String[] args) {
        int num = 5;
        int sum = 0;
        int i = 1;

        do {
            sum = sum + i;
            i++;
        }while (i <=num);
        System.out.println(sum);
    }
}
