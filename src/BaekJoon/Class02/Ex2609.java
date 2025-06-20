package BaekJoon.Class02;
import java.io.*;
import java.util.StringTokenizer;

public class Ex2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 공백 단위로 토큰 나눔
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        
        // 토큰화한 str을 형변환하여 정수 A,B에 대입
        int A = Integer.parseInt(str.nextToken());
        int B = Integer.parseInt(str.nextToken());

        // 최대 공약수
        int div = gcd(A, B);

        System.out.println(div);
        // 최소 공배수
        System.out.println(A * B / div);
    }

    // 최대공약수를 재귀로 구현
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        // GCD(a, b) = GCD(b, r)이므로 (r = a % b)
        return gcd(b, a % b);
    }
}
