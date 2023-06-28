package a0627;

public class Sp3 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        int pencilPerStudent = (pencils/students);
        System.out.println(pencilPerStudent);
        
        int pencilsLeft = (pencils%students);
        System.out.println(pencilsLeft);
    }
}
