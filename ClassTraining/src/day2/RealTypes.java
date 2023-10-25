package day2;

public class RealTypes {

    public static void main(String[] args) {
       // float sal = 2500.75; // Type mismatch: cannot convert from double to float
        //float sal = 2500.75f;
        //float sal = 2500.75F;
        // Type-casting
        float sal = (float) 2500.75;
        System.out.println("My salary = " +sal);

        double data = 2500.75;
        System.out.println(data);

        sal = 2754.85472f;
        System.out.println(sal);
        // System.out.printf("%f", sal);
        // System.out.printf("%.0f", sal);
        System.out.printf("%.1f", sal);
        System.out.printf("%.2f", sal);
    }
}
