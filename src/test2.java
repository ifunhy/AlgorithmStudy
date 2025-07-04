import java.io.*;
import java.util.StringTokenizer;

public class test2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] request = new int[N];

        for (int i = 0; i < N; i++) {
            request[i] = Integer.parseInt(st.nextToken());  // 예: 140 110 120 150
        }

        int budget = Integer.parseInt(br.readLine());   // 예: 485
        int division = budget / N;      // 예: 121
        int remainder = budget % N;     // 예: 1
        boolean[] visited = new boolean[N + 1];
        int trueCount = 0;
        int maxRequest = 0;

        while (budget >= 0) {
            boolean changed = false;    // 변화 감지 플래그

            for (int i = 0; i < N; i++) {
                if (division < request[i]) {
                    trueCount = 0;
                    for (boolean element : visited) {
                        if (element)
                            trueCount++;
                    }

                    if (!visited[i]) {
                        visited[i] = true;  // 첫 방문이면 기록만
                        changed = true;
                    } else {    // 두 번째 방문일 때 분배 및 갱신
                        int distributed;
                        if (trueCount == 0) {
                            distributed = division;
                        } else {
                            distributed = division + (remainder / trueCount);
                        }

                        if (distributed <= request[i]) {
                            if (distributed > maxRequest) {
                                maxRequest = distributed;
                            }
                        } else {
                            if (request[i] > maxRequest) {
                                maxRequest = request[i];
                            }
                        }

                        budget -= distributed;
                        changed = true;
                    }
                } else {
                    if (!visited[i]) {
                        visited[i] = true;
                        budget -= request[i];
                        remainder += division - request[i];
                        changed = true;
                    }
                }
            }

            if (!changed)   // 변화 없으면 종료
                break;
        }

        System.out.println(maxRequest);
    }
}
