package BaekJoon.Class02;
import java.io.*;

public class Ex9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N  = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
    }
}

// ")"로 시작 -> "NO" 리턴
// "("로 끝 -> "NO" 리턴
// "("의 개수 == ")"의 개수 -> 각각 카운팅 후 수 비교

// deque 으로 구현