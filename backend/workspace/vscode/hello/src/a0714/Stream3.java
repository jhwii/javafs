package a0714;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers); // [2,4,6,8,10]
    }
}
