import java.io.*;
import java.util.*;

public class Ex11725 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    static int[] parent;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] nodes = new int[N - 1][2];
        visited = new boolean[N + 1];
        parent = new int[N + 1];

        adjList = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < N - 1; i++) {   // 간선 수만큼
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            nodes[i][0] = u;
            nodes[i][1] = v;
        }

        for (int i = 0; i < nodes.length; i++) {
            adjList.get(nodes[i][0]).add(nodes[i][1]);
            adjList.get(nodes[i][1]).add(nodes[i][0]);
        }

        for (int i = 0; i < adjList.size(); i++) {
            adjList.get(i).sort(Comparator.naturalOrder());
        }

        dfs(1);

        for (int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }
    }

    static void dfs(int node) {
        visited[node] = true;

        for (int a : adjList.get(node)) {
            if (!visited[a]) {
                parent[a] = node;
                dfs(a);
            }
        }
    }
}



//import java.io.*;
//import java.util.*;
//
//public class Ex11725 {
//    // 인접 리스트를 사용한 그래프 표현
//    static List<List<Integer>> adjList;
//
//    // 방문 여부를 체크하는 배열
//    static boolean[] visited;
//
//    // 각 노드의 부모를 저장할 배열
//    static int[] parent;
//
//    public static void main(String[] args) throws IOException {
//        // 입력을 받기 위한 BufferedReader 사용
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        // 노드 개수 입력 받기
//        int N = Integer.parseInt(br.readLine());
//
//        // 간선 정보를 저장할 배열 (N - 1개의 간선)
//        int[][] nodes = new int[N - 1][2];
//
//        // 방문 여부와 부모 정보 초기화
//        visited = new boolean[N + 1];
//        parent = new int[N + 1];
//
//        // 인접 리스트 초기화
//        adjList = new ArrayList<>();
//        for (int i = 0; i <= N; i++) {
//            adjList.add(new ArrayList<>());
//        }
//
//        // 간선 정보 입력 받아 nodes 배열에 저장
//        for (int i = 0; i < N - 1; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int u = Integer.parseInt(st.nextToken());  // 부모 또는 연결 노드
//            int v = Integer.parseInt(st.nextToken());  // 자식 또는 연결 노드
//            nodes[i][0] = u;
//            nodes[i][1] = v;
//        }
//
//        // 간선 정보를 인접 리스트에 저장 (양방향 연결)
//        for (int i = 0; i < nodes.length; i++) {
//            adjList.get(nodes[i][0]).add(nodes[i][1]);
//            adjList.get(nodes[i][1]).add(nodes[i][0]);
//        }
//
//        // 노드 번호가 작은 순서로 정렬 (문제 요구는 아니지만 디버깅에 유용)
//        for (int i = 0; i < adjList.size(); i++) {
//            adjList.get(i).sort(Comparator.naturalOrder());
//        }
//
//        // 루트 노드(1번 노드)부터 DFS 시작
//        dfs(1);
//
//        // 2번 노드부터 N번 노드까지의 부모 출력
//        for (int i = 2; i <= N; i++) {
//            System.out.println(parent[i]);
//        }
//    }
//
//    // DFS 탐색을 통해 부모 노드 기록
//    static void dfs(int node) {
//        visited[node] = true;  // 현재 노드 방문 처리
//
//        // 현재 노드에 연결된 모든 인접 노드를 확인
//        for (int a : adjList.get(node)) {
//            if (!visited[a]) {  // 아직 방문하지 않은 노드라면
//                parent[a] = node;  // 부모를 현재 노드로 기록
//                dfs(a);  // 해당 노드에 대해 DFS 재귀 호출
//            }
//        }
//    }
//}