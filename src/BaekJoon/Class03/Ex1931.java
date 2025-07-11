package BaekJoon.Class03;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex1931 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());    // 회의의 수
        int[][] time = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());  // 시작 시간
            time[i][1] = Integer.parseInt(st.nextToken());  // 종료 시간
        }

        Arrays.sort(time, (o1,o2) -> {  // o1,o2로 정렬기준 생성
            if (o1[1] ==o2[1]) {                 // 종료 시간이 같으면
                return (o1[0] - o2[0]);          // 시작 시간 기준으로 오름차순 정렬(-1 : o1 먼저, 0 : 순서 동일, 1 : o2 먼저)
            }
            return (o1[1] - o2[1]);              // 종료 시간 기준으로 오름차순 정렬(-1 : o1 먼저, 0 : 순서 동일, 1 : o2 먼저)
        });

        int count = 0;  // 배정 가능한 회의 수
        int end = 0;    // 직전 회의의 종료 시간

        for (int i = 0; i < time.length; i++) {
            if (end <= time[i][0]) {    // 이전 회의가 끝난 이후에 시작하는 회의만 선택
                count++;
                end = time[i][1];       // 종료 시간 없데이트
            }
        }

        System.out.println(count);
    }
}
// 회의 종료 시간(end)을 기준으로 오름차순 정렬
// end값보다 큰 start값 중 가장 작은 값 비교
// 같은 start 값이면 더 작은 end를 가진 time을 채택하고 count++

