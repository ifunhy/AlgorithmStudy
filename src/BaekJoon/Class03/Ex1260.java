package BaekJoon.Class03;
import java.io.*;
import java.util.*;

public class Ex1260 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        visited = new boolean[N + 1];
        adjList = new ArrayList<>();

        for (int i = 0; i <= N; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        for (int i = 0; i <= N; i++) {
            Collections.sort(adjList.get(i));
        }

        dfs(V);
        visited = new boolean[visited.length];
        System.out.println();
        bfs(V);

    }

    static void dfs(int node) {
        System.out.print(node + " ");
        visited[node] = true;

        for (int a : adjList.get(node)) {
            if (!visited[a]) {
                dfs(a);
            }
        }
    }

    static void bfs(int node) {
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(node);
        visited[node] = true;

        while (!myQueue.isEmpty()) {
            int temp = myQueue.poll();
            System.out.print(temp + " ");

            for (int a : adjList.get(temp)) {
                if (!visited[a]) {
                    myQueue.add(a);
                    visited[a] = true;
                }
            }
        }
    }
}

// adjList 생성
// u,v 무방향 그래프 값
// 번호 작은 순으로 방문
// dfs 수행
// bfs 수행