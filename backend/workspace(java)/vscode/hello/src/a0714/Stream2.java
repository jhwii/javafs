package a0714;

import java.util.Arrays;
import java.util.List;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
                .filter(number -> number > 2)
                .forEach(number -> System.out.println(number));
    }
}
