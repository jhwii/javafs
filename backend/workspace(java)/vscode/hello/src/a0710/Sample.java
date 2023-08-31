package a0710;
//난 동물원의 사육사이다.

//육식 동물이 들어오면 난 먹이를 던져준다.
// 호랑이가 오면 사과를 던져준다.
// 사자가 오면 바나나를 던져준다.
// 악어(Crocodile)가 오면 스트로베리(strawberry)를 던져준다. 
// 표범(Leopard)이 오면 오렌지(orange)를 던져준다.

public class Sample {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Crocodile crocodile = new Crocodile();
        Leopard leopard = new Leopard();
        zooKeeper.feed(tiger); // feed apple 출력
        zooKeeper.feed(lion); // feed banana 출력
        zooKeeper.feed(crocodile);
        zooKeeper.feed(leopard);
    }
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

class Tiger extends Animal {
}

class Lion extends Animal {

}

class Crocodile extends Animal {

}

class Leopard extends Animal {

}

class ZooKeeper {
    void feed(Tiger tiger) { // 호랑이가 오면 사과를 던져 준다.
        System.out.println("feed apple");
    }

    void feed(Lion lion) { // 사자가 오면 바나나를 던져준다.
        System.out.println("feed banana");
    }

    void feed(Crocodile crocodile) {
        System.out.println("feed strawberry");
    }

    void feed(Leopard leopard) {
        System.out.println("feed orange");
    }
}
