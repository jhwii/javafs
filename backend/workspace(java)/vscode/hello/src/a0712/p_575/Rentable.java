package a0712.p_575;

public interface Rentable<P> {
    P rent();
}
// Rentable이라는 인터페이스는 제네릭타입 P를 받아서 rent() 메서드를 선언
// rent() 메서드는 P타입의 객체를 반환
