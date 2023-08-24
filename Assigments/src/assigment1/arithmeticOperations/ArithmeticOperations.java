package assigment1.arithmeticOperations;

public class ArithmeticOperations {
    public static void main(String[] args) {
        /* Write a program to use all data types and given arithmetic operations */
        int num1 = 10;
        int num2 = 5;

        //Addition
        int sum = num1 + num2;
        System.out.println(sum);

        //Subtratipn
        int sub = num1 - num2;
        System.out.println(sub);

        //Multiplication
        int mult = num1 * num2;
        System.out.println(mult);

        //Division
        int div = num1 / num2;
        System.out.println(div);

        //Increment
        System.out.println("Increment");
        ++num1;
        System.out.println("Pre Increment: " +num1);

        num1++;
        System.out.println("Post Increment: " +num1);


        //Decrement
        System.out.println("Decrement");
        --num2;
        System.out.println("Pre Decrement: " +num2);

        num2--;
        System.out.println("Post Decrement: " + num2);

    }
}
