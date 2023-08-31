package a0711;


import java.io.PrintWriter;
import java.io.IOException;

public class Write4 {
    public static void main(String[] args) throws IOException{
        PrintWriter pw = new PrintWriter("d:/out.txt");
        for(int i=1; i<11; i++){
            String data = i+"번째 줄입니다.\r\n";
            pw.write(data);
        }
        pw.close();
    }
}
