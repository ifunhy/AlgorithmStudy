package BaekJoon.Class02;
import java.io.*;

public class Ex2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 테스트 케이스 개수 T
        int T = Integer.parseInt(br.readLine());

        // T만큼 반복
        for (int i = 0; i < T; i++)
        {
            int K = Integer.parseInt(br.readLine());    // 층수 K
            int N = Integer.parseInt(br.readLine());    // 호수 N
            int [] arr = new int[N];    // 0층의 방 인원 정보 배열

            // 0층은 방마다 +1
            for (int j = 0; j < N; j++)
                arr[j] = j + 1;

            // K층까지 인원 수 누적 합
            // K번 반복하여 한 층씩 올라감
            for (int j = 0; j < K; j++)
            {
                // 각 층 1호실은 아래층 N호실과 값이 같아, 2호실부터 N호실까지 계산
                for (int k = 1; k < N; k++)
                    arr[k] += arr[k - 1];   // a[k][i] = a[k-1][i] + a[k][i-1] 배열 누적합
            }
            // K층 N호실의 최종 인원 수 출력
            System.out.println(arr[N - 1]);
        }

    }
}

// a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 함
// 누적 합 문제

// 아파트 구조
// 층 수 : 0층 ~ k층
// 각 층마다 1호부터 n호까지 방 존재

// 초기(0)층 주민 수
// 0층의 i번 방에는 i명이 삶
// a[0][i] = i

// k층 주민 수 규칙
// k > 0층의 i번 방에 사는 사람 수는 1) + 2)
// 1) 바로 아래층(k - 1)의 같은 호(i번 방)에 사는 사람 수
// 2) 같은 층(k층)의 왼쪽 방(1번부터 i - 1번 방까지) 전체에 사는 사람 수
// a[k][i] = a[k - 1][i] + a[k][i - 1]

// 구하고자 하는 것
// 주어진 k, n에 대해 a[k][n] 출력