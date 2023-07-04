package a0704;

public class Ex6_11_1 {
    public static void main(String[] args) {
        Cars c1 = new Cars("white", "auto", 4);  // 인수
        Cars c2 = new Cars("red", "auto", 5);   // 인수

        System.out.println("c1의 color="+c1.color+", gearType="+c1.gearType+", door="+c1.door);
        System.out.println("c2의 color="+c2.color+", gearType="+c2.gearType+", door="+c2.door);
    }
}

class Cars{
    String color;
    String gearType;
    int door;
    // Cars(){}
    Cars(String c, String g, int d){   // 매개변수
        color = c;
        gearType = g;
        door = d;
    }
}