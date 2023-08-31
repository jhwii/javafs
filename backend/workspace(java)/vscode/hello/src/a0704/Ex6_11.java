package a0704;

public class Ex6_11 {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car();

        c2.color = "red";
        c2.gearType = "auto";
        c2.door = 5;

        System.out.println("c1의 color="+c1.color+", gearType="+c1.gearType+", door="+c1.door);
        System.out.println("c2의 color="+c2.color+", gearType="+c2.gearType+", door="+c2.door);
    }
}

class Car{
    String color;
    String gearType;
    int door;
    // Car(){}
}