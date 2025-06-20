package BaekJoon.Class03;
import java.io.*;  // 입출력 관련 클래스 사용을 위해 java.io 패키지 전체를 import

public class Ex9095 {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 이용해 콘솔 입력을 효율적으로 읽음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄: 테스트 케이스 수 n 읽어서 정수로 변환
        int n = Integer.parseInt(br.readLine());

        // 각 테스트 케이스마다 처리
        for (int i = 0; i < n; i++) {
            // 다음 줄: 합을 구할 목표 숫자 num 읽음
            int num = Integer.parseInt(br.readLine());

            // dp[j]: j를 1,2,3의 합으로 나타내는 방법의 수
            // 문제 제약상 num ≤ 10이므로 크기 11 배열 생성
            int[] dp = new int[11];

            // base case 설정
            dp[1] = 1;  // 1을 만드는 방법: [1]
            dp[2] = 2;  // 2를 만드는 방법: [1+1], [2]
            dp[3] = 4;  // 3을 만드는 방법: [1+1+1], [1+2], [2+1], [3]

            // j = 4 부터 num까지 dp 점화식 적용
            // dp[j] = dp[j-1] + dp[j-2] + dp[j-3]
            for (int j = 4; j <= num; j++) {
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
            }

            // num을 만드는 방법의 수 출력
            System.out.println(dp[num]);
        }
    }
}