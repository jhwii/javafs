package a0714.p_712;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        Member m1 = person.getMember1(Member::new);
        // Member::new는 create 메소드가 요구하는 생성자를 참조하여 새로운 Member 객체를 생성하는 역할
        System.out.println(m1);
        System.out.println();

        Member m2 = person.getMember2(Member::new);
        System.out.println(m2);
    }
}
