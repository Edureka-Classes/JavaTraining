package day7.sets;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest2 {
    public static void main (String[] args) {
        Set<String> names = new TreeSet<>(new NamesComparator());
        System.out.println(names.add("Buhari")); //true
        System.out.println(names.add("Buhari")); //false
        System.out.println(names.add("Maiwada")); //true

        names.add("Fatima");
        names.add("Aisha");
        names.add("Nasir");

        System.out.println(names);

    }
}

class NamesComparator implements Comparator<String>{
    @Override
    public  int compare (String o1, String o2) {
        //return 0;
        //return 1;
        //return -1;

        int n = o1.compareTo(o2);
        if(n > 0)
            return -1;
        else if (n < 0)
            return 1;
        return 0;
    }
}
