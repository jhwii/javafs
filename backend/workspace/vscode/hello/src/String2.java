public class String2 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";
        String c = "hello";
        String d = new String("hello");

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a == c);
        System.out.println(a == d);
        System.out.println(a.equals(d));
        System.out.println(d);
    }
}
