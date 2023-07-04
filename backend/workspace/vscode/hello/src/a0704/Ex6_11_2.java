package a0704;

public class Ex6_11_2 {
    public static void main(String[] args) {
        Carss c1 = new Carss("white", "auto", 4); // 인수
        Carss c2 = new Carss("red", "auto", 5); // 인수

        Carss c3 = new Carss();
        
        c3.color = "orange";
        c3.gearType = "manual";
        c3.door = 3;

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
    }
}

class Carss{
    String color;
    String gearType;
    int door;
    Carss(){}
    Carss(String c, String g, int d){   // 매개변수
        color = c;
        gearType = g;
        door = d;
    }
    // 인스턴스변수의 초기화
    // 생성자의 이름은 클래스의 이름과 같아야 한다.
    // 생성자는 리턴값이 없다.
}