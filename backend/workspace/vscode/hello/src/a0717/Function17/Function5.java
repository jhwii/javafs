package a0717.Function17;

import java.util.function.BinaryOperator;

public class Function5 {
    public static void main(String[] args) {
        // Calculator mc = (int a, int b) -> a+b;
        BinaryOperator<Integer> mc = (a, b) -> a + b;
        int result = mc.apply(3, 4);
        System.out.println(result); // 7 출력
    }
}