package BaekJoon.Class02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex30802 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] shirts = new int[6];

        for (int i = 0; i < 6; i++) {
            shirts[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int TBundle = 0;
        int PBundle = 0;
        int PIndividual = 0;

        for (int i = 0; i < 6; i++) {
            TBundle += (shirts[i] + T - 1) / T;
        }
        System.out.println(TBundle);

        PBundle = N / P;
        PIndividual = N % P;
        System.out.print(PBundle + " " + PIndividual);
    }
}



// 첫 줄에 참가자의 수 N
// 둘째 줄에 사이즈별 티셔츠 신청자의 수
// 셋째 줄에 원하는 티셔츠의 묶음 수(T)와 펜의 묶음 수(P)

// 23
// 3 1 4 1 5 9
// 5 7

// 둘째 줄을 5 단위로 묶음, 3 / 5 = 0.6 -> 반올림
// 23 / 7 = 3, 23 % 7 = 2

// Math.ceil -> 반올림 함수