package BaekJoon.Others;

import java.io.*;
import java.util.*;

public class Ex2210 {
    static int[] dx;
    static int[] dy;
    static String[][] arr = new String[5][5];
    static Set<String> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dx = new int[]{-1, 1, 0, 0};
        dy = new int[]{0, 0, 1, -1};

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] =st.nextToken();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dfs(i, j, 0, arr[i][j]);
            }
        }
        System.out.println(set.size());

    }

    static void dfs(int x, int y, int count, String xy) {
        if (count == 5) {
            set.add(xy);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 숫자판 범위 바깥인 경우 skip
            if (nx < 0 || nx >= 5 || ny < 0 || ny >= 5) {
                continue;
            }

            dfs(nx, ny, count + 1, xy + arr[nx][ny]);
        }
    }
}


// import java.io.*;                     // 입출력 관련 라이브러리
//import java.util.HashSet;            // 중복 제거를 위한 HashSet
//import java.util.Set;
//import java.util.StringTokenizer;    // 입력 분리용 라이브러리
//
//public class Ex2210 {
//    static int[] dx;                 // x축 방향 이동 (상, 하, 우, 좌)
//    static int[] dy;                 // y축 방향 이동
//    static String[][] arr = new String[5][5]; // 숫자판 저장 배열
//    static Set<String> set = new HashSet<>(); // 중복 없이 6자리 숫자 조합을 저장
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        // 상, 하, 우, 좌 방향 이동을 위한 배열
//        dx = new int[]{-1, 1, 0, 0};
//        dy = new int[]{0, 0, 1, -1};
//
//        // 5×5 숫자판 입력 받기
//        for (int i = 0; i < 5; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < 5; j++) {
//                arr[i][j] = st.nextToken(); // 각 칸의 숫자를 저장
//            }
//        }
//
//        // 모든 칸에서 DFS 탐색 시작
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                // 시작 위치 (i, j)와 현재까지 만든 숫자 문자열 (처음엔 arr[i][j])
//                dfs(i, j, 0, arr[i][j]);
//            }
//        }
//
//        // HashSet에 저장된 조합 개수 출력 (중복 제거됨)
//        System.out.println(set.size());
//    }
//
//    /**
//     * DFS로 6자리 숫자를 완성해 나가는 함수
//     * @param x 현재 x좌표
//     * @param y 현재 y좌표
//     * @param count 현재까지 만든 문자열의 길이 (0부터 시작해서 5가 되면 종료)
//     * @param xy 지금까지 만든 숫자 문자열
//     */
//    static void dfs(int x, int y, int count, String xy) {
//        // 6자리 숫자가 완성되었으면 Set에 저장하고 종료
//        if (count == 5) {
//            set.add(xy); // HashSet이므로 중복은 자동 제거
//            return;
//        }
//
//        // 상하좌우 4방향으로 탐색
//        for (int i = 0; i < 4; i++) {
//            int nx = x + dx[i]; // 다음 x좌표
//            int ny = y + dy[i]; // 다음 y좌표
//
//            // 숫자판 범위를 벗어나면 무시
//            if (nx < 0 || nx >= 5 || ny < 0 || ny >= 5) {
//                continue;
//            }
//
//            // 다음 칸으로 이동하여 재귀 호출 (다음 숫자 추가)
//            dfs(nx, ny, count + 1, xy + arr[nx][ny]);
//        }
//    }
//}


// 강사님 코드
// import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.HashSet;
//import java.util.Set;
//
//
//public class Main {
//    static int[] dx = {1,-1,0,0};
//    static int[] dy = {0,0,-1,1};
//    static int[][] arr = new int[5][5];
//    static Set<String> staticSet = new HashSet<>();
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        for (int i=0; i<5; i++){
//            String[] temp = br.readLine().split(" ");
//            for (int j=0; j<5; j++){
//                arr[i][j] = Integer.parseInt(temp[j]);
//            }
//        }
//        for (int i=0; i<5; i++){
//            for (int j=0; j<5; j++){
//                dfs(String.valueOf(arr[i][j]), i, j);
//            }
//        }
//        System.out.println(staticSet.size());
//    }
//    static void dfs(String temp, int x, int y){
/// /        문자의길이가 6이 되었을때 set에 add
//        if(temp.length()==6){
//            staticSet.add(temp);
//            return;
//        }
////        상하좌우 검사후에 dfs()호출
//        for (int i=0; i<4; i++){
//            int nx = x +dx[i];
//            int ny = y +dy[i];
//            if(nx>=0 && nx<5 && ny>=0 && ny<5){
//                dfs(temp+arr[nx][ny], nx, ny);
//            }
//        }
//    }
//
//}