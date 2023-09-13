package assigment1.whileLoops;

public class AddDigitsOfNumber {
    /* Write a programto add the digits of a number */

    public static void main(String[] args) {
        int num = 10;
        int sum = 0;
        int i = 1;

        while(i <= num){
            sum = sum + i;
            i++;
        }
        System.out.println("The sum of digits of "+num+ " = "+ sum);
    }
}
