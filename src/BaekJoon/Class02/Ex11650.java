package BaekJoon.Class02;
import java.util.*;

public class Ex11650 {
    public static void main(String[] args) {
        // 1) 표준 입력을 편리하게 사용하기 위해 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 2) 첫 입력으로 점의 개수 N을 읽어 정수로 저장
        int N = sc.nextInt();

        // 3) N개의 점을 저장할 2차원 배열 생성
        //    arr[i][0]은 i번 점의 x 좌표, arr[i][1]은 i번 점의 y 좌표
        int[][] arr = new int[N][2];

        // 4) N개의 줄마다 x, y 좌표를 순서대로 읽어들여 arr 배열에 저장
        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();  // i번 점의 x 좌표를 읽어 저장
            arr[i][1] = sc.nextInt();  // i번 점의 y 좌표를 읽어 저장
        }

        // 5) Arrays.sort를 이용해 2차원 배열 arr을 정렬
        //    람다식을 사용하여 Comparator(비교 기준)를 직접 정의
        Arrays.sort(arr, (s1, s2) -> {
            // 5-1) 두 점 s1, s2의 x 좌표가 같으면 y 좌표를 기준으로 오름차순 정렬
            if (s1[0] == s2[0]) {
                return s1[1] - s2[1];  // x 좌표가 동일할 때 y1 - y2가 음수면 s1이 먼저 옴
            } else {
                // 5-2) x 좌표가 다르면 x 좌표를 기준으로 오름차순 정렬
                return s1[0] - s2[0];  // x1 - x2가 음수면 s1이 먼저 옴
            }
        });

        // 6) 정렬된 순서대로 각 점의 좌표를 한 줄씩 출력
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
            // arr[i][0] (x 좌표)와 arr[i][1] (y 좌표)을 공백으로 구분해 출력
        }
    }
}
