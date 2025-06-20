package BaekJoon.Class03;
import java.io.*;

public class Ex9095 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());    // 첫 줄: 테스트 케이스 수 T 읽어서 정수로 변환

        // 각 테스트 케이스마다 처리
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());    // 다음 줄: 합을 구할 목표 숫자 n 읽음

            // dp[j]: j를 1,2,3의 합으로 나타내는 방법의 수
            int[] dp = new int[11]; // 문제 제약상 n ≤ 10이므로 크기 11 배열 생성

            // base case 설정
            dp[1] = 1;          // 1을 만드는 방법: [1]
            dp[2] = 2;          // 2를 만드는 방법: [1+1], [2]
            dp[3] = 4;          // 3을 만드는 방법: [1+1+1], [1+2], [2+1], [3]

            // j = 4 부터 n까지 dp 점화식 적용
            // dp[j] = dp[j-1] + dp[j-2] + dp[j-3]
            for (int j = 4; j <= n; j++) {
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
            }

            System.out.println(dp[n]);  // n을 만드는 방법의 수 출력
        }
    }
}