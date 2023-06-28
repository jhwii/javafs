package a0627;

public class Sp5 {
    public static void main(String[] args) {
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        // double area = (lengthTop+lengthBottom)*height/2.0; (o)
        // double area = (double)(lengthTop+lengthBottom)*height/2; (o)
        // double area = (lengthTop+lengthBottom)*height*1.0/2; (0)
        double area = (double) ((lengthTop+lengthBottom)*height/2); // (x)

        System.out.println(area);
    }
}
