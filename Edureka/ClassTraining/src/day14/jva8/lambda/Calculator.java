package day14.jva8.lambda;

public class Calculator {
    public static void main (String[] args) {
    // --- through anonymous class
        Nums numsRef = new Nums(){
            @Override
            public int add(int x, int y){
                int s = x + y;
                return s;
            }
        };

        System.out.println("Sum = " +numsRef.add(10, 12));

        // ---- Through lambdas
        Nums numsRef1 = (int x, int y) -> {
            int s = x + y;
            return s;
        };
        System.out.println("Sum = " +numsRef.add(11, 12));

        // --- Through lambdas
        Nums numsRef2 = (x, y) -> {
            int s = x + y;
            return s;
        };
        System.out.println("Sum = " +numsRef.add(12, 12));

        // --- Through lambdas
        Nums numsRef3 = (x, y) -> {return x + y; };
        System.out.println("Sum = " +numsRef3.add(13, 12));

        // --- Through lambdas
        Nums numsRef4 = (x, y) -> x + y;
        System.out.println("Sum = " + numsRef4.add(14, 12));
    }
}
