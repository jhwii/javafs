package a0629;

public class Ex4_10 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            // sum = sum + i;
            sum += i;
            System.out.printf("1부터 %2d 까지의 합 : %2d%n", i, sum);
        }
        // %2d 정수를 출력할 때 최소 두 자리로 출력하고, 필요한 경우
        // 앞을 공백으로 채우는 형식 지정자 
    }
}
