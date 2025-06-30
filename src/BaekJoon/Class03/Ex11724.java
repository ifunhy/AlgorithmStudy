package BaekJoon.Class03;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex11724 {
    static boolean[] visited;
    static ArrayList[] nodeList;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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
        System.out.println(Arrays.toString(nodeList));
    }
}
