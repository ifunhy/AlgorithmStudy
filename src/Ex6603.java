// 6603 로또 - 첫 번째 풀이
import java.io.*;
import java.util.*;

public class Ex6603 {
    static int K;
    static int[] arr;
    static List<Integer> temp = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            K = Integer.parseInt(st.nextToken());

            if (K == 0) break;
            arr = new int[K];

            for (int i = 0; i < K; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            dfs(0, 0);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    private static void dfs(int start, int depth) {
        if (depth == 6) {
            for (int value : temp) {
                sb.append(value).append(" ");
            }
            sb.setLength(sb.length() - 1);  // 마지막 공백 제거
            sb.append("\n");
            return;
        }

        if (start >= K) return;

        for (int i = start; i < K; i++) {
            temp.add(arr[i]);
            dfs(i + 1, depth + 1);
            // 백트래킹
            temp.remove(temp.size() - 1);
        }
    }
}


// 6603 로또 - 두 번째 풀이
//import java.io.*;
//import java.util.*;
//
//public class test {
//    static int K;
//    static int[] arr;
//    static boolean[] visit;
//    static List<Integer> temp = new ArrayList<>();
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        while (true) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            K = Integer.parseInt(st.nextToken());
//
//            if (K == 0) break;
//            arr = new int[K];
//            visit = new boolean[K];
//            temp.clear();
//
//            for (int i = 0; i < K; i++) {
//                arr[i] = Integer.parseInt(st.nextToken());
//            }
//            dfs(0, 0);
//            System.out.println();
//        }
//    }
//    private static void dfs(int start, int depth) {
//        if (depth == 6) {
//            for (int value : temp) {
//                System.out.print(value + " ");
//            }
//            System.out.println();
//            return;
//        }
//
//        for (int i = start; i < K; i++) {
//            if (!visit[i]) {
//                visit[i] = true;
//                temp.add(arr[i]);
//                dfs(i + 1, depth + 1);
//                // 백트래킹
//                temp.remove(temp.size() - 1);
//                visit[i] = false;
//            }
//        }
//    }
//}
