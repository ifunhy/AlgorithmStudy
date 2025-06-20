package BaekJoon.Class02;
import java.io.*;
import java.util.*;

public class Ex1158 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> q = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        int temp = K - 1;
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while(!q.isEmpty()) {
            temp %= q.size();   // 리스트 크기 넘어가는 것 방지
            sb.append(q.get(temp));
            q.remove(temp); // 하나만 있을 경우

            if (!q.isEmpty()) {
                sb.append(", ");
                temp += K - 1;
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}
