//package BaekJoon.Class03;
//
//import java.io.*;
//import java.util.StringTokenizer;
//
//public class Ex2630 {
//
//    static int white = 0;   // 흰색 색종이 개수 저장
//    static int blue = 0;    // 파란색 색종이 개수 저장
//    static int[][] paper;   // 입력으로 들어올 색종이 정보 저장할 2차원 배열
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());    // 색종이의 한 변의 길이 N (N x N)
//        paper = new int[N][N];  // 색종이 크기만큼 2차원 배열 생성
//
//        // 색종이 데이터 입력 받기
//        for (int i = 0; i < N; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < N; j++) {
//                paper[i][j] = Integer.parseInt(st.nextToken()); // 0(흰색) 또는 1(파란색) 저장
//            }
//        }
//
//        // (0, 0) 좌표에서 시작하여 N x N 크기의 종이를 4등분하면서 확인
//        quarter(0, 0, N);
//
//        System.out.println(white);
//        System.out.println(blue);
//    }
//
//    // 종이를 재귀적으로 4등분하면서 색이 모두 같은지 확인
//    public static void quarter(int x, int y, int n) {
//        boolean flag = true;    // 현재 영역이 모두 같은 색인지 확인하는 flag
//
//        // (x, y)부터 (x+n, y+n)까지 순회하면서 색 일치 여부 확인
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (paper[x][y] != paper[x+i][y+j]) {   // 기준점(x, y)과 다른 색이 있는 경우
//                    flag = false; // 색이 섞여있음
//                    break;
//                }
//            }
//            if(!flag) break; // 바깥쪽 루프도 중단
//        }
//
//        // 모두 같은 색일 경우
//        if (flag == true) {
//            if (paper[x][y] == 0)
//                white++; // 흰색이면 white 증가
//            else
//                blue++;  // 파란색이면 blue 증가
//        } else {    // 색이 섞여있으면 4등분하여 재귀 호출
//            quarter(x, y, n/2);                           // 왼쪽 위
//            quarter(x + n / 2, y, n/2);                // 오른쪽 위
//            quarter(x, y + n / 2, n/2);                // 왼쪽 아래
//            quarter(x + n / 2, y + n / 2, n/2);     // 오른쪽 아래
//        }
//    }
//}
