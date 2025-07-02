package BaekJoon.Others;
import java.io.*;
import java.util.StringTokenizer;

public class Ex1106 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int C = Integer.parseInt(st.nextToken());   // 도달할 고객 수
        int N = Integer.parseInt(st.nextToken());   // 도시 개수
        int[][] adv = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            adv[i][0] = Integer.parseInt(st.nextToken());
            adv[i][1] = Integer.parseInt(st.nextToken());
        }
    }
}
// target으로 최대비용을 설정?
