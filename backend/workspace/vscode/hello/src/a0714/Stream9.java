package a0714;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream9 {
  public static void main(String[] args) {
    List<String> strings = Arrays.asList("apple", "banana", "carrot", "dragonfruit", "eggplant");
    String result = strings.stream()
        .filter(s -> s.length() >= 5)
        .map(String::toUpperCase)
        .collect(Collectors.joining(", "));
    System.out.println(result); // APPLE, BANANA, CARROT, DRAGONFRUIT, EGGPLANT
  }
}
