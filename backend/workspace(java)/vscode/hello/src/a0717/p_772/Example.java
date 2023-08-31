package a0717.p_772;
// p.772 6번

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
            new Member("홍길동", 30),
            new Member("신용권", 40),
            new Member("감자바", 26)
        );
        double avg = list.stream()
        .mapToInt(Member::getAge)  // Member 객체의 나이(age)를 int 값으로 매핑한다.
        .average()  // .average() 메소드 호출하여 스트림요소의 평균값을 
        .getAsDouble();  // 실제 평균값을 double형태로 가지고 온다.

        System.out.println("평균 나이:"+avg);
    }
}
