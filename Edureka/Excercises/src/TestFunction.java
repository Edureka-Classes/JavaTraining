import java.util.Scanner;

public class TestFunction {

    // Program to find the square of a given number
    public static int func(int x){
        int y = x * x;
        return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value");
        int n = sc.nextInt();

        int result = TestFunction.func(n);

        System.out.println("Square of " +n + " is "+result);
    }
}
