package BaekJoon.Class02;
import java.io.*;

// hash set 사용해보기
public class Ex10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strN = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());
        String[] strM = br.readLine().split(" ");
        int[] result = new int[M];
        int count;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            count = 0;
            for (int j = 0; j < N; j++) {
                if (strM[i].equals(strN[j]))
                    count++;
            }
            result[i] = count;
            sb.append(result[i]).append(' ');
        }
        System.out.println(sb);
    }
}
