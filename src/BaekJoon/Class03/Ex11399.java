package BaekJoon.Class03;
import java.io.*;
import java.util.*;

public class Ex11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());        // 첫 줄에서 사람(고객) 수 N 읽기
        int[] time = new int[N];                        // 각 사람이 돈을 인출하는 데 걸리는 시간 배열 선언

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 둘째 줄에서 N개의 시간을 공백 단위로 읽기 위해 StringTokenizer 사용

        for (int i = 0; i < N; i++)
            time[i] = Integer.parseInt(st.nextToken()); // 배열에 각 시간 값을 정수로 파싱하여 저장

        Arrays.sort(time);                              // 시간이 작은 순서대로 정렬하여 그리디 적용 준비

        int sum = 0;                                    // 현재까지 누적된 시간
        int total = 0;                                  // 모든 사람이 대기한 시간의 합

        for (int t : time) {                            // 정렬된 배열을 순회하며
            sum += t;                                   // 이번 사람의 인출 시간을 누적
            total += sum;                               // 누적된 시간을 총합에 더함
        }
        System.out.println(total);                      // 최종 결과(총 대기 시간)를 출력
    }
}