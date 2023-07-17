package a0717;

public class Sample24 extends Thread{
    int seq;
    public Sample24(int seq){
        this.seq = seq;
    }
    public void run() {    
        System.out.println(this.seq+"thread start."); // 스레드 시작
        try {
            Thread.sleep(1000);  // 1초 대기한다.
        }catch(Exception e) {
        }
        System.out.println(this.seq+"thread end.");  // 스레드 종료
    }
    
    public static void main(String[] args) {
        for (int i=0; i<10; i++){    // 총 10개의 스레드를 생성하여 실행한다.
            Thread t = new Sample24(i);
            t.start();
        }
        System.out.println("main end.");  // main 메서드 종료
    }
}
