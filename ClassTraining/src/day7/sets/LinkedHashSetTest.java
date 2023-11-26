package day7;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
    //maintain the order of elements
    public static void main (String[] args) {

        Set<String> names = new LinkedHashSet<>();

        System.out.println(names.add("Buhari")); //true
        System.out.println(names.add("Buhari")); //false
        System.out.println(names.add("Maiwada")); //true

        names.add("Fatima");
        names.add("Aisha");
        names.add("Nasir");

        System.out.println(names);
    }
}
