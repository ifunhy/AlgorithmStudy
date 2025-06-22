import java.io.*;
import java.util.*;

public class test {
    static int N;
    static int M;
    static boolean[] visit;
    static List<Integer> temp = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visit = new boolean[N + 1];

        dfs(0);

    }

    private static void dfs(int depth) {
        if (depth == M) {
            for (int value : temp) {
                System.out.print(value + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                temp.add(i);
                dfs(depth + 1);
                // 백트래킹
                temp.remove(temp.size() - 1);
                visit[i] = false;
            }
        }
    }
}
