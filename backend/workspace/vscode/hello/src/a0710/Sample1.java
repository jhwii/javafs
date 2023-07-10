package a0710;

public class Sample1 {
    public static void main(String[] args) {
        ZooKeeper zookeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Crocodile crocodile = new Crocodile();
        Leopard leopard = new Leopard();
        zookeeper.feed(tiger); // feed apple 출력
        zookeeper.feed(lion); // feed banana 출력
        zookeeper.feed(crocodile);
        zookeeper.feed(leopard);
    }
}

interface Feedable {
    void feed();
}

class Animal {
    String name;

    public Animal() {
        // 기본 생성자 내용
    }

    public Animal(String name) {
        this.name = name;
    }
}

class Tiger extends Animal implements Feedable {

    @Override
    public void feed() {
        System.out.println("feed apple");

    }

}

class Lion extends Animal implements Feedable {

    @Override
    public void feed() {
        System.out.println("feed banana");

    }
}

class Crocodile extends Animal implements Feedable {
    @Override
    public void feed() {
        System.out.println("feed strawberry");
    }
}

class Leopard extends Animal implements Feedable {
    @Override
    public void feed() {
        System.out.println("feed orange");
    }
}

class Zookeeper {
    void feed(Feedable animal) {
        animal.feed();
    }
}