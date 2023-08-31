/* package a0703;

import java.util.Scanner;

public class Yy {
    public static void main(String[] args) {
        // 연도 저장위한 초기 변수 선언
        int year = 0;

        // Scanner 객체 사용해서 사용자로부터 연도를 입력받는다.
        Scanner scan = new Scanner(System.in);

        System.out.print("연도를 입력하세요.");
        year = scan.nextInt();

        // 윤년인지 확인하기 위한 if문 수행
        if((year % 4 == 0) && (year % 100 != 0) && (year % 400 == 0)){
            System.out.println();
        }
        else{
            System.out.println();
        }

    }
} */