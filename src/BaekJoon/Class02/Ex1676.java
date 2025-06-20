package BaekJoon.Class02;
import java.io.*;

public class Ex1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 5; i <= N; i *= 5)
            result = result + (N / i);
        System.out.println(result);
    }
}


// 1. 끝자리에 0이 나오려면 N!에서 곱한 값이 10 있어야 함
// 1-1. 끝자리에 0이 두 개 붙으려면 10 * 10 필요
//      팩토리얼 안에서 10이 몇 번 곱해지느냐
//      즉, 2와 5의 쌍이 몇 개냐

// 2. 5의 개수에 의해 결정됨
// 2-1. 2의 배수는 많음.  5^n의 개수 <= 2^n의 개수

// 3. 5의 배수는 N/5개, 5의 제곱수는 추가 계산이 필요
// 3-1. 25의 경우 5가 두 번 곱해짐
//      25, 50, 75, 100의 경우 -> N/25, N/50, N/75, N/100

// 4. 끝자리에 위치한 0의 개수 공식
//    5^n <= N가 성립할 때까지 N/5 + N/5^1 + N/5^2 + ...