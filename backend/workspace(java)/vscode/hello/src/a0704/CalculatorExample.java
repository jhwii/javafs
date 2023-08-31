package a0704;
// p.247
public class CalculatorExample {
    public static void main(String[] args) {
        double result1 = 10*10*Calculator.pi;
        int result2 = Calculator.plus(10, 5); // 정적메서드, 클래스메서드, static메서드
        int result3 = Calculator.minus(10, 5);

        System.out.println("result1:"+result1);
        System.out.println("result2:"+result2);
        System.out.println("result3:"+result3);
    }
}
