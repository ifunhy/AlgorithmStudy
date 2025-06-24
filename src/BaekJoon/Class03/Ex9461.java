package BaekJoon.Class03;
import java.io.*;

public class Ex9461 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long[] P = new long[101];
        P[1] = 1;
        P[2] = 1;
        P[3] = 1;
        P[4] = 2;
        P[5] = 2;

        for (int i = 6; i <= 100; i++) {
            P[i] = P[i - 1] + P[i - 5];
        }

        int T = Integer.parseInt(br.readLine());    // 테이스케이스 개수

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(P[N]);
        }
        br.close();
    }
}
