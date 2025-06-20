package BaekJoon.Class02;
import java.io.*;

public class Ex2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();

        int result = 0;

        // 범위를 (N - 9 * 자리수)로 줄여 탐색
        // Math.max(a, b) : 두 인자 값 중 큰 값을 리턴
        for (int i = Math.max(1, N - 9 * String.valueOf(N).length()); i < N; i++)
        {
            int sum = i;
            int temp = i;

            // 각 자리수 더하기
            while (temp > 0)
            {
                sum += temp % 10;
                temp /= 10;
            }

            // sum과 입력값이 같을 때(= 생성자) 대입 후 종료
            if (sum == N)
            {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}

// 분해합 = M + M의 각 자리수의 합

// 완전탐색 사용 (Ex> 216)
// M + (M의 자리수 합) == 216(N)
// for (int m = N - 9 * 자릿수; m <= N; m++)
// 분해합 계산: m + 자리수합(m)
// 결과가 N -> 정답