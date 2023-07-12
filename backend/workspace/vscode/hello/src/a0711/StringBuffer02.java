package a0711;

public class StringBuffer02 {
    public static void main(String[] args) {
        StringBuffer str01 = new StringBuffer("Java");
        StringBuffer str02 = new StringBuffer("Java");

        System.out.println(str01.capacity());
        System.out.println(str02.capacity());
    }
}
