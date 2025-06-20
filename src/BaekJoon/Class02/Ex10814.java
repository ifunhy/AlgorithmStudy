package BaekJoon.Class02;
import java.io.*;

public class Ex10814 {
    public static void main(String[] args) throws IOException {
        // 1) BufferedReader를 사용해 표준 입력을 빠르고 효율적으로 읽어올 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 2) 첫 번째 줄에서 입력된 정수 N을 읽어 정수로 변환 (회원 수).
        int N = Integer.parseInt(br.readLine());
        // 3) 나이(0~200)에 따라 정렬된 결과를 담을 StringBuilder 배열을 선언
        StringBuilder[] arr = new StringBuilder[201];

        // 4) 배열의 각 인덱스(나이 0~200)에 대응하는 StringBuilder 객체를 생성해 초기화
        for (int i = 0; i <= 200; i++) {
            arr[i] = new StringBuilder();
        }

        // 5) N명의 회원 정보를 한 줄씩 읽어 들임
        for (int i = 0; i < N; i++) {
            // 5-1) 한 줄을 공백으로 분리하여 나이와 이름을 얻음
            String[] input = br.readLine().split(" ");
            // 5-2) 분리된 첫 번째 토큰을 정수로 변환해 나이(age)에 저장
            int age = Integer.parseInt(input[0]);
            // 5-3) 두 번째 토큰을 이름(name)으로 저장
            String name = input[1];

            // 5-4) 해당 나이(age)에 대응하는 StringBuilder에
            //      "나이 이름\n" 형식으로 문자열을 추가
            arr[age].append(age).append(" ").append(name).append("\n");
        }

        // 6) 최종 결과를 모아 둘 StringBuilder 객체를 생성
        StringBuilder result = new StringBuilder();

        // 7) 나이별로(0부터 200까지) 미리 저장된 StringBuilder 내용을 순서대로 모음
        for (int i = 0; i <= 200; i++) {
            result.append(arr[i]);
        }

        // 8) 완성된 결과 문자열을 한 번에 출력
        System.out.println(result);
    }
}

// 1. 나이가 증가하는 순
// 2. 나이가 같으면 먼저 가입하는 사람
// 2-1. 가입된 순서는 입력한 순서

// 첫 줄 N : 입력 받을 개수
// N개의 줄 : 나이 + " " + 이름4

// 1. 회원 수 N 입력 받기
// 2. StringBuilder 배열 생성 (크기 : 201)
// 2-1. null 방지 위해 배열 초기화
// 3. 공백 기준으로 이름, 나이 분리하여 입력 받음
// 3-1. 나이 int, 이름 string 각각 추출 반복
// 4. append로 인덱스에 누적 저장
// 5. 전체 출력 위해 StringBuilder 사용