package BaekJoon.Class03;
import java.io.*;
import java.util.*;

public class Ex11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());          // 토큰1: 코인 종류 수 N
        int K = Integer.parseInt(st.nextToken());          // 토큰2: 목표 금액 K

        Integer[] moneyArr = new Integer[N];                // 코인 가치를 저장할 배열 (Integer 배열로 선언)

        for (int i = 0; i < N; i++)
            moneyArr[i] = Integer.parseInt(br.readLine());  // 각 줄에서 코인 가치를 읽어 배열에 저장

        Arrays.sort(moneyArr, Comparator.reverseOrder());   // 큰 값부터 사용하기 위해 내림차순 정렬

        int count = 0;                                      // 사용할 코인 개수를 누적할 변수

        for (int i = 0; i < N; i++) {
            if (moneyArr[i] <= K) {                         // 남은 금액 K가 이 동전 가치 이상이면
                count += K / moneyArr[i];                   // 해당 동전으로 최대한 많이 사용
                K %= moneyArr[i];                           // 남은 금액을 동전 가치로 나눈 나머지로 갱신
            }
        }
        System.out.println(count);                          // 최종 사용한 코인 총 개수 출력
    }
}