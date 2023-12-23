package day14.jva8.lambda;

import javax.xml.namespace.QName;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest1 {
    public static void main (String[] args) {
        Consumer<String> conRef = (name) -> System.out.println("Hi " + name.toUpperCase() + ", Welcome to edureka");
        conRef.accept("Buhari");
        System.out.println();

        List<String> names = Arrays.asList("Aisha", "Fatima", "Maryam", "Nasir", "Maiwada");
        names.forEach(conRef); //Performs one given action for each element of the Iterable until all elements have been processed.
        System.out.println();

        names.forEach(name -> System.out.print(name+ ", "));

    }
}
