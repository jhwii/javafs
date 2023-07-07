package a0707.p_498;
// p.499
public class EqualsExample {
    public static void main(String[] args) {
        Member10 obj1 = new Member10("blue");
        Member10 obj2 = new Member10("blue");
        Member10 obj3 = new Member10("red");

        if(obj1.equals(obj2)){
            System.out.println("obj1과 obj2는 동등합니다.");
        }else {
            System.out.println("obj1과 obj2는 동등하지 않습니다.");
        }
        if(obj1.equals(obj3)){
            System.out.println("obj1과 obj3은 동등합니다.");
        }else {
            System.out.println("obj1과 obj3는 동등하지 않습니다.");
        }
    }
}
