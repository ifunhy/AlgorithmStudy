package BaekJoon.Class03;
import java.io.*;
import java.util.*;

public class Ex11724 {
    static boolean[] visited;
    static ArrayList<Integer>[] nodeList;
    static int count;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        visited = new boolean[N + 1];
        nodeList = new ArrayList[N + 1];

        for (int i = 0; i < N + 1; i++) {
            nodeList[i] = new ArrayList();
        }

        for (int i = 0; i < M; i++) {
            st  = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            nodeList[u].add(v);
            nodeList[v].add(u);
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }
        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int start) {
        visited[start] = true;

        for (int v : nodeList[start]) {
            if (!visited[v]) {
                dfs(v);
            }
        }
    }
}
