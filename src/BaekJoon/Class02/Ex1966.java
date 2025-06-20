package BaekJoon.Class02;
import java.util.*;
import java.io.*;

public class Ex1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int num = Integer.parseInt(br.readLine());  // 첫 줄: 테스트 케이스 개수 읽어서 정수로 변환

        for (int i = 0; i < num; i++) {             // 각 테스트 케이스마다 반복
            st = new StringTokenizer(br.readLine());        // 한 줄에서 N과 M을 읽기 위해 토큰 분리
            int N = Integer.parseInt(st.nextToken());      // 문서의 총 개수 N
            int M = Integer.parseInt(st.nextToken());      // 우리가 궁금한 문서의 인덱스 M

            // Queue 선언: [원래위치, 중요도]를 담은 int[] 요소를 저장
            Queue<int[]> q = new LinkedList<>();

            st = new StringTokenizer(br.readLine());       // 다음 줄에서 N개의 중요도 값을 읽기 위해 토큰 분리
            for (int j = 0; j < N; j++) {                  // N번 반복하여
                int importance = Integer.parseInt(st.nextToken());  // 각 문서의 중요도 읽기
                q.add(new int[]{j, importance});           // (원래 인덱스, 중요도) 쌍을 큐의 뒤에 삽입
            }

            int count = 0;                                 // 인쇄 순서를 세기 위한 변수

            while (true) {                                 // 타겟 문서가 인쇄될 때까지 반복
                int[] cur = q.poll();                     // 큐의 앞에서 (원위치, 중요도)를 꺼냄
                boolean check = true;                     // 뒤에 더 높은 중요도가 있는지 여부 플래그

                for (int[] other : q) {                   // 큐에 남은 모든 요소를 순회하면서
                    if (other[1] > cur[1]) {              // 더 높은 중요도가 발견되면
                        check = false;                    // 이 문서는 즉시 인쇄되지 않음
                        break;                            // 더 이상 탐색할 필요 없으므로 탈출
                    }
                }

                if (check) {                              // 이 문서가 현재 최고 중요도라면
                    count++;                             // 인쇄 순서 하나 증가
                    if (cur[0] == M)                     // 꺼낸 문서가 우리가 찾던 문서이면
                        break;                           // 반복 종료 (결과 count 출력 준비)
                } else {                                 // 더 높은 중요도가 뒤에 있었다면
                    q.add(cur);                          // 꺼낸 문서를 다시 큐의 뒤에 삽입
                }
            }
            System.out.println(count);                   // 해당 테스트 케이스의 인쇄 순서 출력
        }
    }
}
