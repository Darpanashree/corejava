package streamprogram;

import java.util.Arrays;
import java.util.stream.Stream;

public class Streamoperations {

    public static void main(String[] args) {
        Integer[] values = new Integer[]{1, 2, 3, 4, 5};
        System.out.println("Original values: " + Arrays.toString(values));
        
        // Creating a stream from the array and mapping each number to its square
        Stream.of(values).map(num -> num * num).forEach(System.out::println);
    }
}
