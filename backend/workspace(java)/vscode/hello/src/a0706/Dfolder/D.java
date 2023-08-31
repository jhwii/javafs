/* package a0706.Dfolder;
// p.304
import a0706.A;

public class D extends A {
    // 생성자 선언
    public D(){
        // A() 생성자 호출
        super();  // O
    }
    // D클래스는 A클래스와 다른 패키지에 있으나 A의 자식 클래스이르모 A의 필드, 메소드, 생성자 접근이 가능하다.

    // 메소드 선언
    public void method1(){
        // A 필드값 변경
        this.field = "value";  // O
        // A 메소드 호출
        this.method();  // O
    }
    // 메소드 선언
    public void method2(){
        A a = new A();  // X
        a.field = "value";  // X
        a.method();  // X
    }
    // 직접 개체생성해서 사용은 안된다.
}
 */