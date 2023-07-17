/* package a0717;

public class Sample20 {
    public void shouldBeRun() {
        System.out.println("ok thanks");
    }
    public static void main(String[] args) {
        Sample20 sample = new Sample20();
        int c;
        try{
            c=4/0;
        }catch(ArithmeticException e) {
            c=-1;
        }finally {
            sample.shouldBeRun();  // 예외에 상관없이 무조건 수행된다.
        }
    }
}
 */