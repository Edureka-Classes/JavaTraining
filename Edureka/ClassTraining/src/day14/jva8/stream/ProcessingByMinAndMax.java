package day14.jva8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ProcessingByMinAndMax {
    public static void main (String[] args) {
        List<Integer> marks = Arrays.asList(65, 82, 76, 60, 92, 81, 50);
        System.out.println("Marks Obtained = " +marks);

        Optional<Integer> optMin = marks.stream().min((n1, n2) -> n1 - n2);
        if(optMin.isPresent()){
            Integer minMark = optMin.get();
            System.out.println("Lowest mark obtained = " +minMark);
        }

        Integer maxMark = marks.stream().max((n1, n2) -> n1 - n2).get();
        System.out.println("Highest mark obtained = " +maxMark);
    }
}
