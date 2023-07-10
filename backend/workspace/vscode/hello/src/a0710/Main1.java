package a0710;

public class Main1 implements Dog, Cat {
    public static void main(String[] args) {
        Main1 main = new Main1();
        main.crying();
        main.one();
        main.two();
    }

    @Override
    public void crying() {
        System.out.println("월월");
    }

    @Override
    public void one() {
        System.out.println("one");
    }

    @Override
    public void two() {
        System.out.println("two");
    }
}
