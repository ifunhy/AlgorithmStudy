package BaekJoon.Class02;
import java.io.*;
import java.util.StringTokenizer;

public class Ex11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력된 줄을 공백 기준으로 토큰 단위로 저장
        StringTokenizer s = new StringTokenizer(br.readLine());

        // 자연수 N과 정수 K를 정수로 변환하여 저장
        int N = Integer.parseInt(s.nextToken());
        int K = Integer.parseInt(s.nextToken());

        // 분자와 분모값을 1로 초기화
        int numer = 1;
        int denomin = 1;

        // 정수만큼 반복
        for (int i = 0; i < K; i++)
        {
            numer *= (N - i);   // 분자 누적
            denomin *= (i + 1); // 분모 누적
        }
        System.out.println(numer / denomin);
    }
}

// 자연수 N과 정수 K가 주어졌을 때 이항계수를 구함
// 이항계수 : 주어진 집합에서 원하는 개수만큼 순서없이 뽑는 조합의 개수
// N개의 항 중에서 K개를 고르는 경우의 수