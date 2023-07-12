package a0711;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
            .append("DEF")  // DEF
            .insert(0,"ABC")  // ABCDEF
            .delete(3, 4)  // ABCEF
            .toString();
        System.out.println(data);  // ABCEF
    }
}
// StringBuilder는 가변성을 가진 클래스로, 문자열을 추가, 수정, 삭제하는 등의 작업을 효율적으로 처리