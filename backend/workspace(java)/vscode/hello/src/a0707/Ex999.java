/* package a0707;
// 카톡문제
import java.util.Scanner;

public class Ex999 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double z = scan.nextInt();
        double x = scan.nextInt();
    
        double a = z + x; 
        double b = z - x; 
        double c = x - z;
        double d = z * x; 
        double e = z / x;  
        double f = x / z; 
        double g =  Math.pow(z,x);
        double h =  Math.pow(x,z);
    
        if(a >= b && a >= c && a >= d && a >= e && a >= f && a >= g && a >= h){ 
            System.out.printf("%.6f",a);
        }
        else if(b >= a && b >= c && b >= d && b >= e && b >= f && b >= g && b >= h ){ 
            System.out.printf("%.6f",b);
        }
        else if(c >= b && c >= a && c >= d && c >= e && c >= f && c >= g && c >= h){
            System.out.printf("%.6f",c);
        }
        else if(d >= b && d >= c && d >= a && d >= e && d >= f && d >= g && d >= h){
            System.out.printf("%.6f",d);
            }
        else if(e >= b && e >= c && e >= d && e >= a && e >= f && e >= g && e >= h){
            System.out.printf("%.6f",e);
            }
        else if(f >= b && f >= c && f >= d && f >= e && f >= a && f >= g && f >= h){ 
            System.out.printf("%.6f",f);
        }
        else if(f >= b && f >= c && f >= d && f >= e && f >= f && f >= a && f >= h){ 
            System.out.printf("%.6f",g);
        }
        else if(h >= b && h >= c && h >= d && h >= e && h >= f && h >= g && h >= a){ 
            System.out.printf("%.6f",h);
        } 
    }
}


 */