package a0706;

public class ChildExample1 {
    public static void main(String[] args) {
        // 객체 생성 및 자동 타입 반환
        Parent1 parent1 = new Child1();

        // Parent 타입으로 필드와 메소드 사용
        parent1.field1 = "data1";
        parent1.method1();
        parent1.method2();
        /*
        parent1.field2 = "data2"; // (불가능)
        parent1.method3();  // (불가능) 
        */
        
        // 강제 타입 변환
        Child1 child1 = (Child1)parent1;

        // Child 타입으로 필드와 메소드 사용
        child1.field2 = "data2";  // (가능)
        child1.method3();   // (가능)

    }
}
