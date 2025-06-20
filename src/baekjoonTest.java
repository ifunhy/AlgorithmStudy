import java.io.*;

public class baekjoonTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // 최대 n은 보통 40
        int maxN = 40;
        int[][] dp = new int[maxN+1][2];
        dp[0] = new int[]{1, 0};
        dp[1] = new int[]{0, 1};
        for (int i = 2; i <= maxN; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n][0]).append(' ').append(dp[n][1]).append('\n');
        }
        System.out.print(sb);
    }
}
