package a0711;

import java.io.FileOutputStream;
import java.io.IOException;

public class Write1 {
    public static void main(String[] args) throws IOException{
        FileOutputStream output = new FileOutputStream("d:/out.txt");
        output.close();
    }
}
