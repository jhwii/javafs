class Test {
    int field1;
    String field2;
    public void method1(){
        System.out.println("자바 프로그래밍 !!");
    }
}
public class Prog{
    public static void main(String[] args) {
        // 자바프로그램이 맨처음 main() 메소드를 찾아 실행
        // 클래스에 반드시 하나 존재
        Test myTest = new Test();
        myTest.method1();
    }
}
