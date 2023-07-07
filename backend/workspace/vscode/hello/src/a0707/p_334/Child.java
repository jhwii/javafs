package a0707.p_334;
// p.334 6번
public class Child extends Parent{
    public int studentNo;

    public Child(String name, int studentNo){
        super(name);  // 부모 클래스 생성자 먼저 super를 통해 정의
        this.name = name;
        this.studentNo = studentNo;
    }
}
