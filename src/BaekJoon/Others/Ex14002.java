package BaekJoon.Others;
import java.io.*;
import java.util.*;

public class Ex14002 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            A[i] =  Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N + 1];
        Arrays.fill(dp, 1);

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (A[j] < A[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer = Math.max(answer, dp[i]);
        }

        Stack<Integer> progression = new Stack<>();
        int len = answer;
        for (int i = N - 1; i >= 0; i--) {
            if (dp[i] == len) {
                progression.push(A[i]);
                len--;
            }
        }

        System.out.println(answer);

        while (!progression.isEmpty()) {
            System.out.print(progression.pop() + " ");
        }
    }
}

//import java.io.*;
//import java.util.*;
//
//public class Ex14002 {
//    public static void main(String[] args) throws IOException {
//        // 입력을 받기 위한 BufferedReader 생성
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        // 수열의 길이 입력
//        int N = Integer.parseInt(br.readLine());
//
//        // 수열을 저장할 배열 A 선언 및 초기화
//        int[] A = new int[N];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        // 수열 A에 입력값 저장
//        for (int i = 0; i < N; i++) {
//            A[i] = Integer.parseInt(st.nextToken());
//        }
//
//        // dp[i]: A[i]를 마지막 원소로 갖는 LIS의 길이
//        int[] dp = new int[N + 1];
//        Arrays.fill(dp, 1);  // LIS 최소 길이는 1
//
//        // dp 배열 채우기 (LIS 길이 계산)
//        for (int i = 1; i < N; i++) {
//            for (int j = 0; j < i; j++) {
//                if (A[j] < A[i]) {
//                    // A[i]가 A[j]보다 크다면, A[i]를 끝으로 하는 LIS 길이 갱신
//                    dp[i] = Math.max(dp[i], dp[j] + 1);
//                }
//            }
//        }
//
//        // dp 배열 중 가장 큰 값을 answer로 저장 (최장 증가 부분 수열의 길이)
//        int answer = 0;
//        for (int i = 0; i < N; i++) {
//            answer = Math.max(answer, dp[i]);
//        }
//
//        // LIS 수열을 저장할 스택 (역순 추적)
//        Stack<Integer> progression = new Stack<>();
//        int len = answer;  // 현재 찾고 있는 길이
//
//        // 뒤에서부터 역추적하며 수열 구성
//        for (int i = N - 1; i >= 0; i--) {
//            if (dp[i] == len) {
//                progression.push(A[i]);  // 스택에 넣고
//                len--;                   // 다음 작은 길이를 찾아감
//            }
//        }
//
//        // 최장 증가 부분 수열의 길이 출력
//        System.out.println(answer);
//
//        // 스택에서 꺼내어 LIS 수열 출력 (정방향)
//        while (!progression.isEmpty()) {
//            System.out.print(progression.pop() + " ");
//        }
//    }
//}


