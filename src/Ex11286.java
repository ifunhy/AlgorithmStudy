import java.util.*;
import java.io.*;

public class Ex11286 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> pq = new PriorityQueue<>(
            (o1, o2) -> {
                int abs1 = Math.abs(o1);
                int abs2 = Math.abs(o2);
                if (abs1 != abs2) {
                    return abs1 - abs2;
                } else return o1 - o2;
            }
        );

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x != 0) {
                pq.offer(x);
            } else {
                System.out.println(pq.isEmpty() ? 0 : pq.poll());
            }
        }
    }
}
