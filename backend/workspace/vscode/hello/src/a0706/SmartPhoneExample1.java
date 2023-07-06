package a0706;

public class SmartPhoneExample1 {
    public static void main(String[] args) {
        // SmartPhone 객체 생성
        SmartPhone1 myPhone1 = new SmartPhone1("갤럭시", "은색");

        // Phone으로부터 상속 받은 필드 일기
        System.out.println("모델:"+myPhone1.model);
        System.out.println("색상:"+myPhone1.color);
    }
}
