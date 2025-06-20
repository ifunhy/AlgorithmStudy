import java.io.*;
import java.util.*;

public class Ex10815 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] strN = br.readLine().split(" ");
        Set<String> cards = new HashSet<>(Arrays.asList(strN));

        int M = Integer.parseInt(br.readLine());
        String[] strM = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            if (cards.contains(strM[i])) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
