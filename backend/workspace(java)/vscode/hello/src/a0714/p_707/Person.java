package a0714.p_707;

public class Person {
    public void action(Calcuable calcuable){
        double result = calcuable.calc(10, 4);
        System.out.println("결과:"+result);
    }
}