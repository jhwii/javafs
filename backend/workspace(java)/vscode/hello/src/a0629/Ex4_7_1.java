package a0629;

public class Ex4_7_1 {
    public static void main(String[] args) {
        int sum = 0;
        int i;
        for (i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        // System.out.println("1부터 100까지 합계는" + sum);
        System.out.printf("1부터 100까지 합계는 %d%n", sum); // +를 안써도 됨
    }
}
