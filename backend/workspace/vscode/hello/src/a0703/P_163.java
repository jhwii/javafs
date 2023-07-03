package a0703;

public class P_163 {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);
        String substring = subject.substring(location);
        System.out.println(substring);
        
        location = subject.indexOf("자바");
        if(location != -1){  // 찾는 문자열이 없으면 -1이 나옴
            System.out.println("자바와 관련된 책이군요.");
        }else {
            System.out.println("자바와 관련 없는 책이군요.");
        }
        boolean result = subject.contains("자바");
        if(result){
            System.out.println("자바와 관련된 책이군요.");
        }else {
            System.out.println("자바와 관련 없는 책이군요.");
        }
    }   
}
