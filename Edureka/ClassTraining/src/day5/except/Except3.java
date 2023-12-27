package day5.except;

import org.w3c.dom.ls.LSOutput;

public class Except3 {
    public static void main (String[] args) {
        String str = "675";
        System.out.println(str + 25); //67525

        int n = Integer.parseInt(str);
        System.out.println(n + 25); //700

        str = "AA";
        n = Integer.parseInt(str); //java.lang.NumberFormatException
        System.out.println(n);
    }


}
