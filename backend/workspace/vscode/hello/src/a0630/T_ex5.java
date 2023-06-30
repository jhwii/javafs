package a0630;

public class T_ex5 {
    // 자바의 정석 p.145 4-5
    public static void main(String[] args) {
        for(int i=0; i<=10; i++){
            for(int j=0; j<=i; j++)
            System.out.println("*");
            System.out.println();
        }
    }
}
