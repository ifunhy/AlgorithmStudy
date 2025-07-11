import java.io.*;                 // 입출력 관련 클래스
import java.util.*;               // 자료구조 관련 클래스 (Queue 등)
import java.awt.*;                // Point 클래스 사용을 위해 import

public class test {
    // 미로의 행 크기
    static int N;
    // 미로의 열 크기
    static int M;
    // 미로 정보를 저장할 배열
    static int[][] miro;
    // 방문 여부 체크 배열
    static boolean[][] visited;
    // 방향 벡터: 아래, 위, 오른쪽, 왼쪽
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        // 입력을 위한 BufferedReader 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫 줄 입력 받아서 공백으로 분리
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 미로의 행과 열 크기 입력
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 미로 배열 및 방문 배열 초기화
        miro = new int[N][M];
        visited = new boolean[N][M];

        // 미로 정보 입력
        for (int i = 0; i < N; i++) {
            String nextLine = br.readLine(); // 각 줄을 한 줄씩 입력
            for (int j = 0; j < M; j++) {
                miro[i][j] = nextLine.charAt(j) - '0'; // 문자 '1' 또는 '0'을 정수로 변환하여 저장
            }
        }

        // (0, 0) 지점에서 BFS 시작
        bfs(0, 0);

        // 도착 지점까지의 최단 거리 출력 (miro[N-1][M-1]에는 이동 횟수가 저장됨)
        System.out.println(miro[N - 1][M - 1]);
    }

    // BFS 탐색 메서드
    static void bfs(int x, int y) {
        // 시작점 방문 처리
        visited[x][y] = true;

        // BFS를 위한 큐 선언
        Queue<Point> queue = new LinkedList<>();
        // 시작점을 큐에 삽입
        queue.offer(new Point(x, y));

        // 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {
            // 현재 위치를 큐에서 꺼냄
            Point point = queue.poll();

            // 4방향 이동 시도
            for (int i = 0; i < 4; i++) {
                int nextX = point.x + dx[i];
                int nextY = point.y + dy[i];

                // 1. 범위를 벗어난 경우
                if (nextX < 0 || nextX >= N || nextY < 0 || nextY >= M)
                    continue;

                // 2. 이동할 수 없는 칸(0)인 경우
                if (miro[nextX][nextY] == 0)
                    continue;

                // 3. 이미 방문한 칸인 경우
                if (visited[nextX][nextY])
                    continue;

                // 다음 위치를 큐에 넣고 방문 처리
                queue.offer(new Point(nextX, nextY));
                visited[nextX][nextY] = true;

                // 현재 칸까지의 거리 + 1을 다음 칸에 기록
                miro[nextX][nextY] = miro[point.x][point.y] + 1;
            }
        }
    }
}
