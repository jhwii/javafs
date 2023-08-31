package a0707;

import java.util.Arrays;
import java.util.Collections;

public class Arrays3_1 {
    public static void main(String[] args) {
        Integer arr[] = {4,23,33,15,17,19};
        Arrays.sort(arr,Collections.reverseOrder());

        for(int i:arr){
            System.out.print("["+i+"]");
        }
    }
}
