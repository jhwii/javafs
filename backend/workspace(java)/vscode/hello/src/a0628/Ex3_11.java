package a0628;

public class Ex3_11 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0;
        // 'Math.round(pi * 1000)'은 3.141.992 반올림 -> 3142
        // 3142 / 1000.0 = 3.142
        System.out.println(shortPi);
    }
}
