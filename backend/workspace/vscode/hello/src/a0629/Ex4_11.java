package a0629;

public class Ex4_11 {
    public static void main(String[] args) {
        // int sum = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // 줄바꿈 x
            }
            System.out.println(); // 줄바꿈 o
        }
    }
}
