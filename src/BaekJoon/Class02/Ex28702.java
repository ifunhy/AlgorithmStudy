package BaekJoon.Class02;
import java.io.*;

public class Ex28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 세 줄의 입력 결과를 배열에 저장
        String[] arr = new String[3];
        for (int i = 0; i < 3; i++)
            arr[i] = br.readLine();

        int idx = -1;   // 숫자가 위치한 인덱스
        int num = 0;    // 값을 보관할 변수

        // 첫 번째로 숫자인 줄을 찾아 파싱
        for (int i = 0; i < 3; i++) {
            if (arr[i].matches("^[0-9]*$")) {   // 정규식으로 숫자 여부 판정
                idx = i;                              // 숫자를 찾은 인덱스 기록
                num = Integer.parseInt(arr[i]);       // 정수로 형변환하여 저장
                break;  // for문 탈출
            }
        }

        // (현재 위치의 값 + (3 - idx))로 출력될 수를 계산
        int next = num + (3 - idx);

        // FizzBuzz 규칙에 따라 출력
        if (next % 3 == 0 && next % 5 == 0) {   // 3과 5의 공배수 -> "FizzBuzz"
            System.out.println("FizzBuzz");
        } else if (next % 3 == 0) {             // 3의 배수 -> "Fizz"
            System.out.println("Fizz");
        } else if (next % 5 == 0) {             // 5의 배수 -> "Buzz"
            System.out.println("Buzz");
        } else {                                // 그 외는 계산된 next값 출력
            System.out.println(next);
        }
    }
}

// 1. 세 줄의 FizzBuzz 출력 결과를 모두 읽어 저장
// 2. 첫 번째로 숫자인 줄을 찾아 파싱
// 3. 다음에 출력될 숫자를 계산 (현재 위치 + (3 - idx))
// 4. FizzBuzz 규칙에 따라 한 줄만 출력