package BaekJoon.Class02;
import java.io.*;

public class Ex15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        // 해시 결과값 저장 변수
        long result = 0;
        // 가중치를 나타낼 변수 (31의 거듭제곱)
        long pow = 1;   // 처음은 31^0 = 1

        for (int i = 0; i < num; i++)
        {
            // 각 문자의 해시 값 = (알파벳 번호 * 현재 가중치)
            result += ((str.charAt(i) - 96) * pow);
            // 반복할 때마다 pow = 31^i
            // long 오버플로우 방지 위해 % 1234567891
            pow = (pow * 31) % 1234567891;
        }
        // 전체 해시 값을 1234567891로 나눈 나머지 출력
        System.out.println(result % 1234567891);
    }
}

// (문자마다 점수 * 가중치)의 합
// r = 31, M = 1234567891
// r^i는 가중치, M으로 나눠서 오버플로 방지
// a_i는 i번째 문자의 숫자 값