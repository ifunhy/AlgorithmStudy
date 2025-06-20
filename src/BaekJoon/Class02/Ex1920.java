package BaekJoon.Class02;
import java.io.*;
import java.util.*;

public class Ex1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];       // N개의 정수를 저장할 배열 선언
        StringTokenizer strN = new StringTokenizer(br.readLine());   // 두 번째 줄을 읽어 공백 기준으로 토큰화

        for (int i = 0; i < N; i++)
            arrN[i] = Integer.parseInt(strN.nextToken());    // 토큰 하나씩 꺼내서 정수로 변환한 뒤 배열에 저장
        Arrays.sort(arrN);      // 배열을 오름차순으로 정렬하여 이분 탐색을 수행할 준비

        // 2. M개의 쿼리를 읽어서, 이분 탐색으로 검사
        int M = Integer.parseInt(br.readLine());    // 세 번째 줄을 읽어 'M'(쿼리 개수)로 변환하여 저장
        StringTokenizer strM = new StringTokenizer(br.readLine());   // 네 번째 줄을 읽어 공백 기준으로 토큰화
        StringBuilder sb = new StringBuilder(); // 결과를 한 번에 모아서 출력하기 위한 StringBuilder 생성

        for (int i = 0; i < M; i++) {
            int x = Integer.parseInt(strM.nextToken());  // 각 토큰을 정수로 변환하여 검색할 숫자 x에 저장
            // 이분 탐색: Arrays.binarySearch(arrN, x) 결과가 0 이상이면 배열에 존재함
            if (Arrays.binarySearch(arrN, x) >= 0) {
                sb.append("1\n");       // 존재하면 '1'을 추가하고 줄 바꿈
            } else {
                sb.append("0\n");       // 존재하지 않으면 '0'을 추가하고 줄 바꿈
            }
        }

        // 3. 결과를 한 번에 출력
        System.out.print(sb);   // StringBuilder에 모아둔 결과(각 줄에 1 또는 0)를 한 번에 출력
    }
}
