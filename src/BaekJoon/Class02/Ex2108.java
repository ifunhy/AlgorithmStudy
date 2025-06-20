package BaekJoon.Class02;
import java.io.*;

public class Ex2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append(br.readLine());
        }
        System.out.println(sb);
    }
}
