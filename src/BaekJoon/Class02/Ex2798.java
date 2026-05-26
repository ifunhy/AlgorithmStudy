package BaekJoon.Class02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2798 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // N : 카드의 개수, M : 근사해야 할 값
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        // N개의 카드
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        int temp = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    temp = arr[i] + arr[j] + arr[k];
                    if (temp <= M && temp > sum) {
                        sum = temp;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}


// 첫째 줄: 카드의 개수 N과 숫자 M
// 둘째 줄: N개의 숫자
// N개의 숫자 중 3장의 카드를 뽑아 M과 가장 근사한 값 생성