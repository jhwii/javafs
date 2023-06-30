package a0630;

public class Ex5_8 {
    public static void main(String[] args) {
        int[][] score = {
            {100, 100 ,100} // 0의 0,1,2 방
            ,{20, 20 ,20}
            ,{30, 30 ,30}
            ,{40, 40 ,40}
        };
        int sum = 0;
        for(int i=0; i < score.length; i++) {    // score.length = 4
            for(int j=0; j < score[i].length; j++) { // score[i].length = 3
                System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);

                sum += score[i][j];
            }
        }
        System.out.println("sum=" + sum);
    }
}
