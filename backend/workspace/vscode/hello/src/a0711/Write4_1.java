package a0711;

import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write4_1 {
    public static void main(String[] args) throws IOException{
        PrintWriter pw = new PrintWriter("d:/out.txt");
        for(int i=1; i<11; i++){
            String data = i+"번째 줄입니다.\r\n";
            pw.write(data);
        }
        pw.close();

        // Printwriter를 사용할 경우에는 생성자 파라미터로 파일명 대신 추가로 열린 FileWriter에 객체를 전달해야 한다.
        
        PrintWriter pw2 = new PrintWriter(new FileWriter("d:/out.txt", true));
        for(int i=11; i<21; i++){
            String data = i+"번째 줄입니다.\r\n";
            pw2.write(data);
        }
        pw2.close();
    }
}
