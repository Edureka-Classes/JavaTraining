package day14.jva8.stream;

import java.util.stream.*;
import java.util.Arrays;
import java.util.List;

public class ProcessingByCount {
    public static void main (String[] args) {
        List<String> names = Arrays.asList("Buhari", "Fatima", "Nasir", "Aisha", "Maryam");

        System.out.println("No of participants = " + names.size());
        System.out.println("No of participants = " + names.stream().count());
        System.out.println();

        // -- number of participants whose name got more than 5ncharacter length
        long noOfPartGreThan5 = names.stream().filter(name -> name.length() > 5).count();
        System.out.println("No of participants whose name is > 5 character length = " + noOfPartGreThan5);
    }
}
