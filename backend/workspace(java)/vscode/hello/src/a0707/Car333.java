/* package a0707;

public class Car333 {
    public static void main(String[] args) {
        Car3 car01 = new Car3();
        Car3 car02 = new Car3();

        System.out.println(car01.toString());
        System.out.println(car02.toString());
        System.out.println(car01.equals(car02));
        
        car01 = car02;  // 두 참조 변수가 같은 주소를 가리킴.
        System.out.println(car01.equals(car02));
    }
}
// toString() 메소드는 해당 인스턴스에 대한 정보를 문자열로 반환
// 클래스 이름과 함께 구분자로 @가 사용되며, 그뒤로 해시코드가 추가 된다. */