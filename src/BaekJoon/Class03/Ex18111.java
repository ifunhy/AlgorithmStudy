package BaekJoon.Class03;
import java.io.*;
import java.util.StringTokenizer;

public class Ex18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] minecraft = new int[N][M];
        int min = Integer.MAX_VALUE;
        int max = -1;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                minecraft[i][j] = Integer.parseInt(st.nextToken());
                min = Math.min(min, minecraft[i][j]);
                max = Math.max(max, minecraft[i][j]);
            }
        }

        int min_sec = Integer.MAX_VALUE;
        int high_block = 0;

        for (int i = min; i <= max; i++) {
            int second = 0;
            int block = B;

            for (int j = 0; j < N; j++) {
                for (int k =0; k < M; k++) {
                    if (i > minecraft[j][k]) {
                        second += i - minecraft[j][k];
                        block -= (i - minecraft[j][k]);
                    } else {
                        second += (minecraft[j][k] - i) * 2;
                        block += minecraft[j][k] - i;
                    }
                }
            }

            if (block < 0)
                continue;
            if (min_sec >= second) {
                min_sec = second;
                high_block = Math.max(high_block, i);
            }
        }
        System.out.println(min_sec + " " + high_block);
    }
}


//import java.io.*;
//import java.util.StringTokenizer;
//
//public class Ex18111 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        // 첫 줄 입력: N(행), M(열), B(초기 인벤토리 블록 개수)
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken());  // 맵의 세로 길이
//        int M = Integer.parseInt(st.nextToken());  // 맵의 가로 길이
//        int B = Integer.parseInt(st.nextToken());  // 초기 가지고 있는 블록 개수
//
//        // 땅의 높이를 저장할 2차원 배열
//        int[][] minecraft = new int[N][M];
//
//        // 땅에서 가장 낮은 높이와 가장 높은 높이를 저장
//        int min = Integer.MAX_VALUE;  // 땅의 최소 높이
//        int max = -1;                 // 땅의 최대 높이
//
//        // 맵 입력 및 최소/최대 높이 계산
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < M; j++) {
//                minecraft[i][j] = Integer.parseInt(st.nextToken());
//                min = Math.min(min, minecraft[i][j]);  // 최소 높이 갱신
//                max = Math.max(max, minecraft[i][j]);  // 최대 높이 갱신
//            }
//        }
//
//        int min_sec = Integer.MAX_VALUE;  // 최소 걸리는 시간
//        int high_block = 0;               // 그 때의 땅 높이
//
//        // 가능한 모든 목표 높이(i)를 순회 (최솟값 ~ 최댓값)
//        for (int i = min; i <= max; i++) {
//            int second = 0;    // 현재 높이로 맞추는 데 걸리는 시간
//            int block = B;     // 현재 가지고 있는 블록 수
//
//            // 모든 좌표를 순회하여 블록 채우기/제거 판단
//            for (int j = 0; j < N; j++) {
//                for (int k = 0; k < M; k++) {
//                    int currentHeight = minecraft[j][k];
//
//                    if (i > currentHeight) {
//                        // 현재 높이가 목표보다 낮으면 블록을 채워야 함
//                        second += (i - currentHeight);          // 1초 per block
//                        block -= (i - currentHeight);           // 블록 사용
//                    } else {
//                        // 현재 높이가 목표보다 높으면 블록을 제거해야 함
//                        second += (currentHeight - i) * 2;      // 2초 per block
//                        block += (currentHeight - i);           // 블록 얻음
//                    }
//                }
//            }
//
//            // 인벤토리에 블록이 부족하면 해당 높이는 불가능
//            if (block < 0) continue;
//
//            // 최소 시간 갱신 또는 같은 시간일 경우 더 높은 높이 선택
//            if (min_sec >= second) {
//                min_sec = second;
//                high_block = Math.max(high_block, i);  // 같은 시간이라면 높은 땅 선택
//            }
//        }
//
//        // 최소 시간과 해당 높이 출력
//        System.out.println(min_sec + " " + high_block);
//    }
//}
