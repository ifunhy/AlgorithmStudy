package BaekJoon.Class02;
import java.io.*;
import java.util.StringTokenizer;

public class Ex1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력받은 과목 수
        int n = Integer.parseInt(br.readLine());
        // 토큰 단위로 문자열 분리
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 가장 큰 값을 저장할 변수
        int max = 0;
        // 전체 점수의 합계를 저장할 변수
        double sum = 0;
        // 점수의 개수만큼 반복
        for (int i = 0; i < n; i++) {
            // 점수 하나 꺼내서 정수로 변환
            int value = Integer.parseInt(st.nextToken());
            // 현재 점수가 지금까지의 최댓값보다 크다면 최댓값 갱신
            if (max < value) max = value;
            // 점수 누적 합산
            sum += value;
        }
        // (점수 / 최고점 * 100) 으로 조정 후 평균 출력
        System.out.println(((sum / max) * 100)/n);
    }
}
