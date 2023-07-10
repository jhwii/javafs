package a0703;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("프로그램 종료를 원하시면 0번을 입력하세요.");
            System.out.print("연도를 입력해 주세요 > ");
            int user_year = scanner.nextInt();
            if (user_year == 0) {
                System.out.println();
                System.out.println("프로그램 종료");
                break;
            }
            if (user_year > 4000 || user_year <= 0) {
                System.out.println("최소 1년부터 최대 4000년까지 입력 가능합니다.");
                continue;
            }

            if ((user_year % 4 == 0 && user_year % 100 != 0) || (user_year % 400 == 0)) {
                System.out.println("윤년 입니다. : 1");
            } else {
                System.out.println("윤년이 아닙니다. : 0");
            }
            System.out.println("당신이 입력한 연도 : " + user_year);

        }
    }
}
