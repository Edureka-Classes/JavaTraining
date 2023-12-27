package day6.except;

public class ThrowTest {

    void calc(int x, int y){
        if(y == 0)
            throw new ArithmeticException("Cannot divide a number by zero");

        int z = x / y;
        System.out.println("Result = " +z);
    }

    public static void main (String[] args) {
        ThrowTest obj = new ThrowTest();

        try {
            obj.calc(10, 0);
        }catch (Exception e){
            System.err.println("Message = " +e.getMessage());
            System.err.println(e.toString());
           // e.printStackTrace();
        }
    }
}
