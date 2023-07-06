package a0706;
// p.303
public class B {
    // 메소드 선언
    public void method(){
        A a = new A(); // O
        a.field = "value"; // O
        a.method(); // O
    }
}
