package day2;

import org.w3c.dom.ls.LSOutput;

public class ConditionalOperator {

    public static void main(String[] args) {

        int x = 17;
        int y = 12;
        int lar;

        lar = (x > y) ? x : y;
        System.out.println("largest of (" + x + ", " + y + ") = " + lar);
        System.out.printf("largest of (%d, %d) = %d", x, y, lar);
    }


}
