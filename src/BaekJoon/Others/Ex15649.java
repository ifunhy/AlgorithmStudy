package BaekJoon.Others;// 15649 N과 M - 첫 번째 풀이
import java.io.*;
import java.util.*;

public class Ex15649 {
    static int N;              // 자연수 N
    static int M;              // 길이가 M인 수열
    static boolean[] visit;    // default 값은 false
    static int[] arr;          // 길이가 M인 배열
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visit = new boolean[N];                 // 길이가 N인 boolean 배열(true, false)를 담기 위함
        arr = new int[M];                       // 길이가 M인 수열을 저장하기 위함

        dfs(0);
        System.out.println(sb);

    }
    private static void dfs(int depth) {
        if (depth == M) {
            for (int value : arr) {
                sb.append(value).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;    // 백트래킹 체크 위함
                arr[depth] = i  + 1;    // 수열 값을 채우기 위해 i + 1
                dfs(depth + 1); // 재귀
                visit[i] = false;   // 백트래킹
            }
        }
    }
}


// 15649 N과 M - 두 번째 풀이
//import java.io.*;
//import java.util.*;
//
//public class Ex15649 {
//    static int N;
//    static int M;
//    static boolean[] visit;
//    static List<Integer> temp = new ArrayList<>();
//
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        N = Integer.parseInt(st.nextToken());
//        M = Integer.parseInt(st.nextToken());
//        visit = new boolean[N + 1];
//
//        dfs(0);
//
//    }
//
//    private static void dfs(int depth) {
//        if (depth == M) {
//            for (int value : temp) {
//                System.out.print(value + " ");
//            }
//            System.out.println();
//            return;
//        }
//
//        for (int i = 1; i <= N; i++) {
//            if (!visit[i]) {
//                visit[i] = true;
//                temp.add(i);
//                dfs(depth + 1);
//                // 백트래킹
//                temp.remove(temp.size() - 1);
//                visit[i] = false;
//            }
//        }
//    }
//}
