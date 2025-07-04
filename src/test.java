import java.io.*;
import java.util.StringTokenizer;

public class test {
    static final int INF = 987654321; // 무한대를 의미하는 값 (충분히 큰 수)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 유저 수
        int M = Integer.parseInt(st.nextToken()); // 친구 관계 수
        int[][] arr = new int[N + 1][N + 1];       // 거리 저장 배열 (1-indexed)

        // 거리 배열 초기화
        // 모든 정점 간의 "최단 거리"를 구하기 위해 시작값을 명확히 설정
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                arr[i][j] = INF; // 초기에는 모두 무한 거리로 설정
                if (i == j) arr[i][j] = 0; // 자기 자신으로의 거리는 0
            }
        }

        // 친구 관계 입력 처리 (무방향 그래프)
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()); // 사용자 x
            int y = Integer.parseInt(st.nextToken()); // 사용자 y

            arr[x][y] = 1; // 친구면 거리 1
            arr[y][x] = 1; // 양방향 관계
        }

        // 플로이드-워셜 알고리즘 수행
        for (int k = 1; k <= N; k++) {         // 경유지 k
            for (int i = 1; i <= N; i++) {     // 출발지 i
                for (int j = 1; j <= N; j++) { // 도착지 j
                    // i에서 j로 가는 최단 경로를 업데이트
                    arr[i][j] = Math.min(arr[i][j], arr[i][k] + arr[k][j]);
                }
            }
        }

        int res = INF; // 최소 케빈 베이컨 수
        int idx = -1;  // 최소 값을 가진 사용자 번호

        // 각 사람마다 다른 모든 사람과의 거리 합을 계산
        for (int i = 1; i <= N; i++) {
            int total = 0; // i번 사람의 케빈 베이컨 수
            for (int j = 1; j <= N; j++) {
                total += arr[i][j]; // i에서 j까지의 거리 합산
            }

            // 더 작은 케빈 베이컨 수가 있으면 갱신
            if (res > total) {
                res = total;
                idx = i;
            }
        }

        // 가장 케빈 베이컨 수가 적은 사람의 번호 출력
        bw.write(idx + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
