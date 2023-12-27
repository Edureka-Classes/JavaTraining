package assigment1.forLoops.digitOfAnumber;

public class digitOfANumber {
    public static void main(String[] args) {

        /* Write a program to add the digits of a number. */
        int num = 5;
        int sum = 0;
        for(int i = 1; i <= num; i++){
             sum += i;
        }
        System.out.println(sum);
    }
}
