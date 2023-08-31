/* package a0704;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex100_13_1 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("실수를 입력해 주세요.");

        float num = scan.nextFloat();  // 1.23579
        DecimalFormat df = new DecimalFormat("#.##");
        String rounded = df.format(num);
    
        System.out.println(rounded);  // 1.24
    }
}
 */