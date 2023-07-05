package a0705;

public class HeroTest {
    public static void main(String[] args) {
        // 1. 생성자 호출, 두 Hero 객체 만들기
        Hero ironman = new Hero("아이언맨", 100, 120);
        Hero hulk = new Hero("헐크", 200, 80);

        // 2. 생성자 정보 출력
        System.out.println(ironman.toStr());
        System.out.println(hulk.toStr());
    }
}
class Hero {
    String name; // 이름
    int power; // 힘
    int speed; // 속도
    // 생성자 정의
    Hero(String n, int p, int s) {
        name = n;
        power = p;
        speed = s;
    }
    // 객체 정보를 문자열로 반환
    String toStr() {
        return String.format("Hero{name: %s, power: %d, speed: %d}",name,power,speed);
        // Hero{name: 아이언맨, power: 100, speed: 120}
        // Hero{name: 헐크, power: 200, speed: 80}
    }
    
}
