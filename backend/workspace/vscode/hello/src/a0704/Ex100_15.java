/* package a0704;

import java.util.Scanner;

public class Ex100_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int year = 0;
        int month = 0;
        int day = 0;

        year = scan.nextInt();
        month = scan.nextInt();
        day = scan.nextInt();

        // % : 심볼
        // 02 : 2자릿수가 안되면 0으로 출
        // d : 십진수 형태로 출
        // %02d

        System.out.printf("%02d.%02d.%02d",year,month,day);
    }
}
 */