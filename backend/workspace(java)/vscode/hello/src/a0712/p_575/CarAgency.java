package a0712.p_575;

public class CarAgency implements Rentable<Car>{
    @Override
    public Car rent(){
        return new Car();
    }
}
// CarAgency, HomeAgency는 Rentable인터페이스를 구현합니다.
// CarAgency 클래스는 Car 객체를 생성하여 반환
// HomeAgency 클래스는 Home 객체를 생성하여 반환
