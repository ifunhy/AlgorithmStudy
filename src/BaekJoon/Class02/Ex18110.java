package BaekJoon.Class02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex18110 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            System.out.println(0);
            return;
        }

        int[] arr = new int[N];
        int exception = (int) Math.round(N * 0.15);
        int sum = 0;

        for (int i = 0; i< N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for (int i = exception; i < N - exception; i++) {
            sum += arr[i];
        }

        System.out.println((int) Math.round((double) sum / (N - (2 * exception))));
    }
}