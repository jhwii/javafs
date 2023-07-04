/* package a0704;

import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("시간을 24시간제로 입력해 주세요(ex) 0~23)");
            int hour = scan.nextInt();
            if (hour < 0 || hour > 23) {
                System.out.println("\n0시 ~ 23시까지만 입력해주세요.\n");
                continue;
            }

            System.out.println("분을 입력해 주세요(ex) 0~59)");
            int min = scan.nextInt();
            if (min < 0 || min > 59) {
                System.out.println("\n0분 ~ 59분까지만 입력해주세요.\n");
            }
            if (hour == 0) {
                hour = 24;
            }
            int time = ((hour * 60) + min) - 45;

            System.out.printf("알람이 %d시 %d분에 맞춰졌습니다!", time / 60, time % 60);
            break;
        }

    }
}
 */