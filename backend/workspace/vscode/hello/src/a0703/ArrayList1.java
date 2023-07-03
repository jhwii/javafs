package a0703;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        // add() 메소드를 이용한 요소 저장
        arrList.add(40);
        arrList.add(20);
        arrList.add(30);
        arrList.add(10);

        // for 문과 get() 메소드를 이용한 요소의 출력
        for(int i=0; i<arrList.size(); i++){
            System.out.print(arrList.get(i)+" ");
        }
        System.out.println();

        // remove() 메소드를 이용한 요소의 제거
        arrList.remove(1);

        // Enhanced for 문과 get() 메소드를 이용한 요소의 출력
        for(int e:arrList){
            System.out.print(e+" ");
        }
        // 'arrList' 는 ArrayList 객체를 가리키는 변수
        // Enhanced for 문을 사용하여 'arrList' 의 모든요소를 순회 하면서 각 요소를 'e' 라는 변수에 저장합니다.
        System.out.println();

        // Collections.sort() 메소드를 이용한 요소의 집합
        Collections.sort(arrList);
        
        // iterator() 메소드와 get() 메소드를 이용한 요소의 출력
       Iterator<Integer> iter = arrList.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+" ");
        }
        System.out.println();

        // set() 메소드를 이용한 요소의 변경
        arrList.set(0, 20);

        for(int e:arrList){
            System.out.print(e+" ");
        }
        System.out.println();

        // size() 메소드를 이용한 요소의 총 개수
        System.out.println("리스트의 크기:"+arrList.size());
    }
}
