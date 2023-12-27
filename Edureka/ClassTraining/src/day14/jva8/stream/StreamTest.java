package day14.jva8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main (String[] args) {

        List<String> names = Arrays.asList("Buhari", "Fatima", "Nasir", "Asiah", "Maryam");

        System.out.println("No of participants = " + names.size());
        System.out.println("No of participants = " + names.stream().count());
        System.out.println();

        Stream<String> namesStream = names.stream();
        Stream<String> filteredStream = namesStream.filter(name -> name.length() > 5);
        System.out.println("No of participants whose name size is > 5 = " +filteredStream.count());
    }
}
