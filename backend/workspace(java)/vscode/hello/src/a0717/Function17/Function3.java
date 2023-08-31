package a0717.Function17;

@FunctionalInterface
interface Calculator3 {
    int sum(int a, int b);
}

public class Function3 {
    public static void main(String[] args) {
        // Calculator mc = (int a, int b) -> a+b;
        Calculator3 mc = Integer::sum;
        int result = mc.sum(3, 4);
        System.out.println(result);  // 7 출력
    }
}