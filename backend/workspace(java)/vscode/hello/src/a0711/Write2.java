package a0711;

import java.io.FileOutputStream;
import java.io.IOException;

public class Write2 {
    public static void main(String[] args) throws IOException{
        FileOutputStream output = new FileOutputStream("d:/out.txt");
        for(int i=1; i<11; i++){
            String data = i+"번째 줄입니다.\r\n";
            output.write(data.getBytes());
        }
        output.close();
    }
}
