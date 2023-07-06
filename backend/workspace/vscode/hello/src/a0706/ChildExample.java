package a0706;
// p.309 // 오류
public class ChildExample {
    public static void main(String[] args) {
        // 자식 객체 생성
        Child child = new Child();

        // 자동 타입 반환
        Parent parent = child;

        // 메소드 호출
        parent.method1();
        parent.method2();
    }
}
