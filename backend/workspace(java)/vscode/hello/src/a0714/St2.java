package a0714;

import java.util.stream.Stream;

public class St2 {
    public static void main(String[] args) {
        // 가변 매개변수에서 스트림 생성
        Stream<Double> stream = Stream.of(4.2, 2.5, 3.1, 1.9 );

        stream.forEach(System.out::println);
    }
}
