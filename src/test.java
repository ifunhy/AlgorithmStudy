import java.io.*;
import java.util.*;

public class test {
    static int K;
    static int[] arr;
    static boolean[] visit;
    static List<Integer> temp = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            K = Integer.parseInt(st.nextToken());

            if (K == 0) break;
            arr = new int[K];
            visit = new boolean[K];
            temp.clear();

            for (int i = 0; i < K; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            dfs(0, 0);
            System.out.println();
        }
    }
    private static void dfs(int start, int depth) {
        if (depth == 6) {
            for (int value : temp) {
                System.out.print(value + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i < K; i++) {
            if (!visit[i]) {
                visit[i] = true;
                temp.add(arr[i]);
                dfs(i + 1, depth + 1);
                // 백트래킹
                temp.remove(temp.size() - 1);
                visit[i] = false;
            }
        }
    }
}
