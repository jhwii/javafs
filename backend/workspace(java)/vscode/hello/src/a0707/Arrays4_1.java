package a0707;

import java.util.Arrays;
import java.util.Collections;

public class Arrays4_1 {
    public static void main(String[] args) {
        String arr[] = {"apple","orange","banana","pear","peach","melon"};
        Arrays.sort(arr,Collections.reverseOrder());

        for(String i:arr){
            System.out.print("["+i+"]");
        }
    }
}
