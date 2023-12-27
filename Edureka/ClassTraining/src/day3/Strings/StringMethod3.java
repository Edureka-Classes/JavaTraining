package day3.Strings;

import org.w3c.dom.ls.LSOutput;

public class StringMethod3 {
    public static void main (String[] args) {

        String s1 = "ABC";
        String s2 = "ABC";

        int n = s1.compareTo(s2);// return 0 if both Strings are equal; otherwise it return
                                // the numerical difference between the first natching character

        System.out.println(n);
    }



}
