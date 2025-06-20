package BaekJoon.Class02;
import java.io.*;

public class Ex7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 사람의 수를 정수형변환하여 저장
        int N = Integer.parseInt(br.readLine());
        // 키와 몸무게를 저장할 2차원 배열 생성
        int[][] arr = new int[N][2];
        // 공백으로 토큰화한 것을 담을 배열
        String[] strArr;

        for (int i = 0; i < N; i++) {
            strArr = br.readLine().split(" ");  // 공백을 기준으로 몸무게와 키를 분리하여 저장
            arr[i][0] = Integer.parseInt(strArr[0]);    // 몸무게 저장
            arr[i][1] = Integer.parseInt(strArr[1]);    // 키 저장
        }

        // 등수 계산
        for (int i = 0; i < N; i++) {
            int rank = 1;   // 시작 등수를 1로 지정

            for (int j = 0; j < N; j++) {
                if (i == j)     // 본인은 비교 대상 제외하기 위해 continue
                    continue;
                // 다음 비교대상의 몸무게와 키가 더 큰 경우
                else if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])
                    rank++;
            }
            System.out.print(rank + " ");   // 등수 + 공백으로 출력
        }
    }
}

// 몸무게, 키를 공백 기준으로 스플릿하여 2차원 배열로 구성
// 이중 for문으로 등수를 계산
// 시작 등수를 1로 지정하여 비교
// 한 줄로 출력하기 위하여 (계산된 등수 + 공백)을 출력