package a0628;

public class Ex3_16 {
    public static void main(String[] args) {
        boolean b = true;
        char ch = 'C';

        System.out.printf("b=%b%n", b);
        System.out.printf("!b=%b%n", !b);
        System.out.printf("!!b=%b%n", !!b);
        System.out.printf("!!!b=%b%n", !!!b);
        System.out.println();

        System.out.printf("ch=%c%n", ch); // c% 한개의 문자 c
        System.out.printf("ch < 'a' || ch > 'z'=%b%b", ch < 'a' || ch > 'z');
        // true 소문자 a는 아스키 코드값이 97 대문자 C 는 67 ch < 'a' 참이므로 true
        System.out.printf("!('a'<=ch && ch<='z')=%b%n", !('a'<= ch && ch<= 'z')); // true
        System.out.printf(" 'a'<=ch && ch<='z' = %b%n", 'a'<= ch && ch<='z'); // false && 앞뒤에 둘다 식이 참이여야만 true
    }
}
