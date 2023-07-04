/* package a0704;

import java.util.Scanner;

public class Ex100_27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요>");
        int num1 = scan.nextInt();
        System.out.println("정수를 입력하세요>");
        int num2 = scan.nextInt();

        // int num3 = (num1>num2) ? num1:num2;
        // System.out.println(num3);
        int num3;
        if(num1>num2){
            num3 = num1;
        }else{
            num3 = num2;
        }
        System.out.println(num3);
    }
}
 */