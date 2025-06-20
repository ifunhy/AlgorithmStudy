package BaekJoon.Class02;
import java.io.*;
import java.util.StringTokenizer;

public class Ex2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());

        // A, B, V 값 토큰으로부터 정수로 파싱
        int up = Integer.parseInt(s.nextToken());   // 낮에 올라가는 높이 A
        int down = Integer.parseInt(s.nextToken()); // 밤에 미끄러지는 높이 B
        int len = Integer.parseInt(s.nextToken());  // 목표 높이 V

        // (V - B) / (A - B) 계산: 마지막 날 도달 전까지 소요 일수
        int count = (len - down) / (up - down);
        // 나누어떨어지지 않으면 하루를 더 올라가야 하므로 1일 추가
        if ((len - down) % (up - down) != 0)
            count++;

        // 최종적으로 올라가 목표에 도달하기까지 걸리는 일수 출력
        System.out.println(count);
    }
}