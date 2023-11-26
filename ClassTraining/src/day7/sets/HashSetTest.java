package day7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
    public static void main (String[] args) {

        Set<String> names = new HashSet<String>();

        System.out.println(names.add("Buhari")); //true
        System.out.println(names.add("Buhari")); //false
        System.out.println(names.add("Maiwada")); //true

        names.add("Fatima");
        names.add("Aisha");
        names.add("Nasir");

        System.out.println(names);

        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            String name = it.next();
            System.out.println("\t--------> " +name);
        }
        System.out.println();

        names.add(null);
    }
}
