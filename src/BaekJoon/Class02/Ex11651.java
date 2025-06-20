package BaekJoon.Class02;
import java.util.*; // Scanner, Arrays 등을 사용하기 위해 java.util 패키지 전체를 import

public class Ex11651 {
    public static void main(String[] args) {
        // 1) Scanner 객체를 생성하여 표준 입력(System.in)으로부터 데이터를 읽어올 준비
        Scanner sc = new Scanner(System.in);

        // 2) 첫 번째 입력으로 정수 N을 읽어옴 (이후에 N개의 좌표를 입력받을 것)
        int N = sc.nextInt();

        // 3) N개의 점을 저장할 2차원 배열을 생성
        //    arr[i][0]에는 i번째 점의 x좌표를, arr[i][1]에는 i번째 점의 y좌표를 저장
        int[][] arr = new int[N][2];

        // 4) for문을 통해 N개만큼 반복하면서 각 점의 x, y좌표를 입력받아 배열에 저장
        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt(); // i번째 점의 x좌표 입력
            arr[i][1] = sc.nextInt(); // i번째 점의 y좌표 입력
        }

        // 5) Arrays.sort 메서드를 사용하여 2차원 배열 arr을 정렬
        //    람다식(Comparator)을 전달하여 정렬 기준을 직접 정의
        Arrays.sort(arr, (s1, s2) -> {
            // 5-1) 두 점의 y좌표(s1[1], s2[1])가 같으면
            if (s1[1] == s2[1]) {
                //     x좌표(s1[0], s2[0])를 비교하여 오름차순으로 정렬
                return s1[0] - s2[0]; // x1 - x2가 음수면 s1이 먼저, 양수면 s2가 먼저
            } else {
                // 5-2) y좌표가 다르면 y좌표(s1[1], s2[1])를 기준으로 오름차순 정렬
                return s1[1] - s2[1]; // y1 - y2가 음수면 s1이 먼저, 양수면 s2가 먼저
            }
        });

        // 6) 정렬이 완료된 후, 다시 for문을 돌면서 결과를 한 줄씩 출력
        for (int i = 0; i < N; i++) {
            // arr[i][0] (x좌표)와 arr[i][1] (y좌표)를 공백으로 구분하여 출력
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
