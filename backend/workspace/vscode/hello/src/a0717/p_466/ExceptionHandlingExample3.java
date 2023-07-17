package a0717.p_466;

public class ExceptionHandlingExample3 {
    public static void printLength(String data){
        try{
            int result = data.length();
            System.out.println("문자 수:"+result);
        }catch(NullPointerException e){
            System.out.println("예외 발생:"+e.getMessage());  // 예외 메시지 출력
        }finally {
            System.out.println("[마무리 실행]\n");
        }
    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}
