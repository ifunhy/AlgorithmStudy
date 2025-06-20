package BaekJoon.Class03;
import java.io.*;

public class Ex1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(make1(N));   // make1 메소드를 호출해 N을 1로 만드는 최소 연산 횟수를 계산하여 출력
    }

    // n을 1로 만드는 최소 연산 횟수를 DP로 계산하는 메소드
    static int make1(int n) {
        int[] dp = new int[n + 1];      // dp[i]는 정수 i를 1로 만드는 데 필요한 최소 연산 횟수
        dp[1] = 0;                  // base case: 1은 이미 1이므로 연산 0회

        for (int i = 2; i <= n; i++) {  // 2부터 n까지 차례대로 dp 값을 채워 나감
            int m = dp[i - 1];          // 가장 기본 연산인 “1 빼기” 만큼의 연산 횟수

            if (i % 2 == 0)             // i가 2로 나누어 떨어지면, “2로 나누기” 연산 횟수 후보와 비교
                m = Math.min(m, dp[i / 2]);
            if (i % 3 == 0)             // i가 3으로 나누어 떨어지면, “3으로 나누기” 연산 횟수 후보와 비교
                m = Math.min(m, dp[i / 3]);
            dp[i] = m + 1;              // 최솟값에 현재 연산 하나를 더해 dp[i]에 저장
        }
        return dp[n];                   // 최종적으로 dp[n]을 반환
    }
}