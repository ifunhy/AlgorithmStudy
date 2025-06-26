package BaekJoon.Class03;
import java.io.*;
import java.util.StringTokenizer;

public class Ex2630 {
    static int white = 0;
    static int blue = 0;
    static int[][] paper;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];  // 색종이 크기 N * N

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        quarter(0, 0, N);
        System.out.println(white);
        System.out.println(blue);
    }

    public static void quarter(int x, int y, int n) {
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (paper[x][y] != paper[x+i][y+j]) {
                    flag = false;
                    break;
                }
                if(!flag) break;
            }
        }
        if (flag == true) {
            if (paper[x][y] == 0)
                white++;
            else
                blue++;
        } else {
            quarter(x, y, n/2); // 왼쪽 위
            quarter((x + n / 2), y, n/2); // 오른쪽 위
            quarter(x, (y + n / 2), n/2); // 왼쪽 아래
            quarter((x + n / 2), (y + n / 2), n/2); // 오른쪽 아래
        }
    }
}
