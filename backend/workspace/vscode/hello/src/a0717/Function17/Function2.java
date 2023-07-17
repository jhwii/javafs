package a0717.Function17;

@FunctionalInterface
interface Calculator2 {
    int sum(int a, int b);
}

public class Function2 {
    public static void main(String[] args) {
        // Calculator mc = (int a, int b) -> a+b;
        Calculator2 mc = (a,b) -> a+b;
        int result = mc.sum(3, 4);
        System.out.println(result);  // 7 출력
    }
}
// 괄호 사이의 int a, int b 는 Calculator 인터페이스의 sum 함수의 입력항목에 해당하고 -> 뒤의 a+b 가 리턴값에 해당한다.
// 이렇게 람다함수를 사용하면 myCalculator와 같은 실제 클래스 없이도 Calculator 객체를 생성할 수 있다.