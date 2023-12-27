package day7.sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main (String[] args) {
        Set<String> names = new TreeSet<>();
        System.out.println(names.add("Buhari")); //true
        System.out.println(names.add("Buhari")); //false
        System.out.println(names.add("Maiwada")); //true

        names.add("Fatima");
        names.add("Aisha");
        names.add("Nasir");

        System.out.println(names);

        names.add(null); //java.lang.NullPointerException
        System.out.println(names);
    }
}
