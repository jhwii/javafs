package a0705;

public class AvengerTest {
    public static void main(String[] args) {
        Avenger thor = new Avenger("토르", 150);
        Avenger thanos = new Avenger("타노스", 160);
    
        thor.punch(thanos);
        thor.punch(thanos);
        thanos.punch(thor);
    }
}

class Avenger {
    String name;
    int hp;
    public Avenger(String s, int i) {
        name = s;
        hp = i;
    }
    void punch(Avenger enemy){
        // Avenger 클래스 이름 enemy 매개변수의 이름
        System.out.printf("[%s]의 펀치!",name);
        enemy.hp -=10;
        System.out.printf("-> %s의 체력: %d\n",enemy.name, enemy.hp);
    }

}