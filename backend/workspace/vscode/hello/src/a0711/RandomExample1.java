package a0711;

import java.util.Arrays;
import java.util.Random;

public class RandomExample1 {
    public static void main(String[] args) {
        // 선택번호
        int[] selectNumber = new int[6];
        // 코드에 사용된 Random 객체는 시드값을 인자로 받아서 생성되는데, 시드값이 같으면 동일한 시퀀스의 난수를 생성합니다.
        Random random = new Random();
        System.out.print("선택번호:");
        for(int i=0; i<6; i++){
            selectNumber[i] = random.nextInt(45)+1;
            System.out.print(selectNumber[i]+" ");
        }
        System.out.println();
        
        // 당첨번호
        int[] winningNumber = new int[6];
        random = new Random();
        System.out.print("당첨번호:");
        for(int i=0; i<6; i++){
            winningNumber[i] = random.nextInt(45)+1;
            System.out.print(winningNumber[i]+" ");
        }
        System.out.println();

        // 당첨여부
        Arrays.sort(selectNumber);
        Arrays.sort(winningNumber);
        boolean result = Arrays.equals(selectNumber, winningNumber);
        System.out.print("당첨여부:");
        if(result){
            System.out.println("1등에 당첨되셨습니다.");
        }else {
            System.out.println("당첨되지 않았습니다.");
        }
    }
}
