package BaekJoon.Others;

import java.util.*;
import java.io.*;

public class Ex11286 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> pq = new PriorityQueue<>(
            (o1, o2) -> {
                int abs1 = Math.abs(o1);
                int abs2 = Math.abs(o2);
                if (abs1 != abs2) {
                    return abs1 - abs2;
                } else return o1 - o2;
            }
        );

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x != 0) {
                pq.offer(x);
            } else {
                System.out.println(pq.isEmpty() ? 0 : pq.poll());
            }
        }
    }
}




//import java.util.*;
//import java.io.*;
//
//public class Ex11286 {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        // 우선순위 큐(PriorityQueue)를 사용자 정의 정렬로 초기화
//        // - 절댓값이 작은 순서로 정렬
//        // - 절댓값이 같으면 '작은 수'가 먼저
//        Queue<Integer> pq = new PriorityQueue<>(
//                (o1, o2) -> {
//                    int abs1 = Math.abs(o1); // o1의 절댓값
//                    int abs2 = Math.abs(o2); // o2의 절댓값
//
//                    if (abs1 != abs2) {
//                        return abs1 - abs2; // 절댓값이 다르면 작은 쪽이 먼저
//                    } else {
//                        return o1 - o2; // 절댓값 같으면 실제 값이 작은 쪽이 먼저
//                    }
//                }
//        );
//
//        // 명령의 수 입력 (0 또는 정수 입력)
//        int N = Integer.parseInt(br.readLine());
//
//        // N번 입력 반복
//        for (int i = 0; i < N; i++) {
//            int x = Integer.parseInt(br.readLine()); // 명령 읽기
//
//            if (x != 0) {
//                pq.offer(x); // x가 0이 아니면 우선순위 큐에 추가
//            } else {
//                // x가 0이면: 절댓값이 가장 작은 값 출력 및 제거
//                // 큐가 비어있으면 0 출력, 아니면 가장 앞 값 출력
//                System.out.println(pq.isEmpty() ? 0 : pq.poll());
//            }
//        }
//    }
//}
