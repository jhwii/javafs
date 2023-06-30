package a0630;

public class T_ex4 {
    // 자바의 정석 p.145 4-4
    public static void main(String[] args) {
        int sum = 0; // 총합을 구하는 변수
        int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
        int num = 0;

        // 조건값이 true이므로 무한반복문이 된다.
        // for (int i = 1; true; i++, s = -s) { // 매반복마다 s의 값은 1, -1, 1, -1, ...
        //     num = s * i;
        //     sum = sum + num;
        //     if (sum >= 100)
        //         break;
        // }
        for(int i=1; sum < 100; i++ , s = -s){
            num = i * s;
            sum+=num;
        }
        System.out.println("num=" + num);
        System.out.println("sum=" + sum);
    }
}
