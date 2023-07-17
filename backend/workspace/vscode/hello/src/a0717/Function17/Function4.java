package a0717.Function17;

import java.util.function.BiFunction;

public class Function4 {
    public static void main(String[] args) {
        // Calculator mc = (int a, int b) -> a+b;
        BiFunction<Integer, Integer, Integer> mc = (a, b) -> a + b;
        int result = mc.apply(3, 4);
        System.out.println(result); // 7 출력
    }
}
// BiFunction의 <Integer, Integer, Integer> 제네릭스는 순서대로 입력항목 2개, 출력항목 1개를 의미한다.
// 그리고 BiFunction 인터페이스의 apply 메서드를 호출하면 람다함수 (a,b)->a+b가 실행된다