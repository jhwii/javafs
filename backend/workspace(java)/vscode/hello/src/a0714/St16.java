package a0714;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class St16 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "PHP");

        Map<Boolean, List<String>> patition = stream.collect(Collectors.partitioningBy(s -> (s.length() % 2) == 0));

        List<String> oddLengthList = patition.get(false);
        System.out.println(oddLengthList);

        List<String> evenLengthList = patition.get(true);
        System.out.println(evenLengthList);
    }
}
