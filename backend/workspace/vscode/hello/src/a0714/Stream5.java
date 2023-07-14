package a0714;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "car", "dog", "elephant");
        List<String> longWords = words.stream()
                .filter(word -> word.length() >= 5)
                .collect(Collectors.toList());
        System.out.println(longWords); // [apple, banana, elephant]
    }
}
