package a0717.p_471;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for(int i=0; i<=array.length; i++){
            try {
                int value = Integer.parseInt(array[i]);
                // 문자열 -> 숫자
                System.out.println("array["+i+"]:"+value);
            }catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과됨:"+e.getMessage());
            }catch(Exception e) {
                System.out.println("실행에 문제가 있습니다.");
                // Exception e 모든 예외의 부모클래스
                // 하위 예외클래스에서 아래에 위치 시킴으로서 예외처리를 더욱 유연하게 한다.
            }
        }
    }
}
