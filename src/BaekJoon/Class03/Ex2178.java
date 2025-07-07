package BaekJoon.Class03;
import java.io.*;
import java.util.*;
import java.awt.*;

public class Ex2178 {
    static int N;
    static int M;
    static int[][] miro;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        miro = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String nextLine = br.readLine();
            for (int j = 0; j < M; j++) {
                miro[i][j] = nextLine.charAt(j) - '0';
            }
        }

        bfs(0,0);

        System.out.println(miro[N - 1][M - 1]);
    }

    static void bfs(int x, int y) {
        // 방문처리
        visited[x][y] = true;
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x,y));    // queue의 좌표 공간 속 (x,y)에 점을 생성하고 초기화
        // 4방위 이동여부판별
        while (!queue.isEmpty()) {
            Point point = queue.poll(); // 좌표값 poll()

            for (int i = 0; i < 4; i++) {
                int nextX = point.x + dx[i];
                int nextY = point.y + dy[i];

                // 예외조건
                // 1. 범위 내에 있는지
                if (nextX < 0 || nextX >= N || nextY < 0 || nextY >= M)
                    continue;
                // 2. 막힌 길인지
                if (miro[nextX][nextY] == 0)
                    continue;
                // 3. 이미 방문했는지
                if (visited[nextX][nextY])
                    continue;

                // 예외조건 통과 시 (= 갈 수 있는 길)
                // 큐에 삽입하고 방문처리
                queue.offer(new Point(nextX, nextY));
                visited[nextX][nextY] = true;

                miro[nextX][nextY] = miro[point.x][point.y] + 1;
            }
        }
    }
}
