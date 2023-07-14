package a0714;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream6 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "car", "dog");
        List<String> uppercaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppercaseWords); // [APPLE, BANANA, CAR, DOG]
    }
}
