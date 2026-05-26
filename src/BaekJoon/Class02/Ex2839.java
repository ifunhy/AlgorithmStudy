package BaekJoon.Class02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// DP, 그리디 알고리즘, 수학
public class Ex2839 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int INF = 5001;
        int[] dp = new int[N + 1];
        Arrays.fill(dp, INF);

        dp[0] = 0;

        for (int i = 1; i <= N; i++) {
            if (i >= 3) {
                dp[i] = Math.min(dp[i], dp[i - 3] + 1);
            }
            if (i >= 5) {
                dp[i] = Math.min(dp[i], dp[i - 5] + 1);
            }
        }
        System.out.println(dp[N] >= INF ? -1 : dp[N]);
    }
}
