package day5.except;

public class Except2 {
    public static void main (String[] args) {
        method1();
    }

    private static void method1(){
        method2();
    }

    private static void method2 () {
        method3();
    }

    private static void method3 () {
        int x = 10;
        int y = 0;
        int z = x /y;

        System.out.println(x + " / " + y + " = " + z);
        System.out.println(" ---- Done ---- ");
    }
}
