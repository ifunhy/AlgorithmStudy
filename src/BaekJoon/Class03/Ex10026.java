package BaekJoon.Class03;

import java.io.*;
import java.util.*;

public class Ex10026 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] area;
    static boolean[][] visited;
    static Queue<int[]> queue = new LinkedList<>();
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        area = new char[N][N];

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < N; j++) {
                area[i][j] = temp.charAt(j);
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    count++;
                    bfs(i, j);
                }
            }
        }

        sb.append(count + " ");
        count = 0;
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    count++;
                    bfs(i, j);
                }
            }
        }
        sb.append(count);
        System.out.println(sb);
    }

    public static void bfs(int x, int y) {
        queue.offer(new int[]{x, y});
        visited[x][y] = true;
        while (!queue.isEmpty()) {
            int[] t = queue.poll();
            int cx = t[0];
            int cy = t[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                if (visited[nx][ny] || area[cx][cy] != area[nx][ny]) continue;
                visited[nx][ny] = true;
                queue.offer(new int[]{nx, ny});
            }
            if (area[cx][cy] == 'G')
                area[cx][cy] = 'R';
        }
    }
}


//1. 초기 노드를 큐에 삽입 + 방문 처리
//2. 큐가 빌 때까지 반복 (큐.poll())
//3. 현재 노드의 모든 인접 노드를 순회(오름차순일 경우 정렬)
//   ㄴ 큐에 덮는 순간 visited[i] = true 처리 필요(중복 삽입 방지)