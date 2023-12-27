public class FunctionOverlaoding {
    static int squre(int x){
        return x * x;
    }

    static double square(double x){
        return x * x;
    }

    public static void main(String[] args) {
        int y = FunctionOverlaoding.squre(10);
        double z = FunctionOverlaoding.square(12.12);

        System.out.println("The squre of 10 is: " + y);
        System.out.printf("The square of 12.12 " + z);
    }
}
