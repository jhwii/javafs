package a0703;

public class String1 {
    public static void main(String[] args) {
        // 자바에서는 문자열을 위한 String이라는 클래스가 별도로 제공
        // String 인스턴스는 한 번 생성되면 그 값을 읽기만 할 수 있고, 변경할 수는 없습니다.
        // 이러한 객체를 자바에서는 불변객체

        String str = new String("Java");
        System.out.println("원본 문자열:"+str);

        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println("\ncharAt() 메소드 호출 후 원본 문자열:"+str);
    }
}
