package a0630;
// 자바의 정석 p.145 4-3
public class T_Ex3 {
    public static void main(String[] args) {
       int sum = 0;
       int totalSum = 0;
       for(int i=1; i<=10; i++){
        sum += i;
        totalSum = totalSum + sum;
       }
       System.out.println("totalSum:"+totalSum);
    }
}
