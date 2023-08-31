package a0629;

public class P_137 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            if(i%2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
