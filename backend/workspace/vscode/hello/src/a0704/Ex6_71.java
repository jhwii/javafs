package a0704;

public class Ex6_71 {
    public static void main(String[] args) {
        MyMath2 mm = new MyMath2(); // 인스턴스를 생성
        mm.a = 200L;
        mm.b = 100L;
        // 인스턴스 메서드는 객체생성 후에만 호출이 가능함.
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());

        // 클래스 메서드 호출. 인스턴스(객체생성) 생성없이 호출가능.
        System.out.println(MyMath2.add(200L, 100L));
        System.out.println(MyMath2.subtract(200l, 100L));
        System.out.println(MyMath2.multiply(200l, 100L));
        System.out.println(MyMath2.divide(200l, 100L));
    }
}
class MyMath2 {
    long a, b;
    // 인스턴스 변수 a,b 만을 사용해서 작업하므로 매개변수가 필요없다.
    long add() {return a+b;}
    long subtract() {return a-b;}
    long multiply() {return a*b;}
    double divide() {return a/b;}
    // 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
    static long add(long a, long b) {return a+b;} // a,b는 지역변수
    static long subtract(long a, long b) {return a-b;}
    static long multiply(long a, long b) {return a*b;}
    static double divide(long a, long b) {return a/(double)b;}
}