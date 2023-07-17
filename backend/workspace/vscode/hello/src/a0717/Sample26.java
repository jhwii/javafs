package a0717;

import java.util.ArrayList;

public class Sample26 implements Runnable {
    int seq;

    public Sample26(int seq) {
        this.seq = seq;
    }

    public void run() {
        System.out.println(this.seq + "thread start."); // 스레드 시작
        try {
            Thread.sleep(1000); // 1초 대기한다.
        } catch (Exception e) {
        }
        System.out.println(this.seq + "thread end."); // 스레드 종료
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) { // 총 10개의 스레드를 생성하여 실행한다.
            Thread t = new Thread(new Sample26(i));
            t.start();
            threads.add(t);
        }
        for (int i = 0; i < threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                t.join(); // t 스레드가 종료할 떄까지 기다린다.
            } catch (Exception e) {
            }
        }
        System.out.println("main end."); // main 메서드 종료
    }
}
