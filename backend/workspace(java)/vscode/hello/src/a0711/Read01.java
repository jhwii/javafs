package a0711;

import java.io.FileInputStream;
import java.io.IOException;

public class Read01 {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[1024];
        FileInputStream input = new FileInputStream("d:/out.txt");
        input.read(b);
        System.out.println(new String(b));  // byte 배열을 문자열로 변경하여 출력
        input.close();
    }
}
