package a0711.ArrayList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileClass {
    private File file;
    private String dir;
    private String fileName;

    public FileClass(){
        file = new File("d:\\");
    }
    public FileClass(String dir, String filename){
        file = new File("d:\\"+dir+"\\"+filename+",txt");
        this.dir = "d:\\"+dir;  // d:/sun
        this.fileName = fileName+".txt";  // memberInfo.txt
    }
    // file = d:/sun/memberInfo.txt

    // 파일명이 있는지 확인하기
    public boolean check(File file){
        if(file.exists()){
            return true;
        }
            return false;
    }

    // creat
    public void create() throws Exception{
        boolean exist = check(file);
        if(exist){
            file.delete();
            file.createNewFile();
        }
        else {
            file = new File(dir);
            file.mkdirs();  // 디렉토리(폴더) 생성
            file = new File(dir+"\\"+fileName);  // 파일명 생성
            file.createNewFile();  // 새로운 파일 만들기
            // 실제로 파일을 생성하는 메서드
        }
    }

    // read
    public void read() throws Exception{
        boolean exist = check(file);
        if(exist){
            FileReader fr = new FileReader(file);
            BufferedReader bw = new BufferedReader(fr);
            String str;
            while((str = bw.readLine()) != null){
                System.out.println(str);
            }
            bw.close();
        }else {
            System.out.println("읽을 파일이 없습니다.");
        }
    }

    // write
    public void write(String str) throws Exception{
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(str);
        fw.close();
    }

    // memberDAO 와 연결해서 사용하기
    // 만들 메소드
    // createfile
    // read
    // write
}
