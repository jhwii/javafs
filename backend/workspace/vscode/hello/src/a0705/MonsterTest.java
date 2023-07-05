package a0705;

public class MonsterTest {
    public static void main(String[] args) {
        Monster orc = new Monster("오크"); 
        Monster skeleton = new Monster("해골");
        Monster.battle(orc, skeleton);
    }
}
class Monster {
    private String name;  // 몬스터 이름
    private int hp;  // 몬스처 체력
    private static int maxHp = 30;  // 모든 몬스터의 최대 체력

    public Monster(String s) {
        name = s;
        hp = maxHp;
    }
    
    public void attack(Monster enemy) {
        System.out.printf("[%s]의 공격 ->",name);
        enemy.hp -=10;
        System.out.printf("%s의 체력: %d/%d\n",enemy.name,enemy.hp,Monster.maxHp);
    }

    public static void battle(Monster a, Monster b) {
        while(a.hp > 0 && b.hp >0) {
            Monster attaker = (Math.random() < 0.5) ? a:b;
            Monster defender = (attaker == a) ? b:a;
            attaker.attack(defender);
        }
    }
}