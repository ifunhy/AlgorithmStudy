package BaekJoon.Class02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 수학, 구현, 브루트포스 알고리즘, 사칙연산
public class Ex14626 {
    public static void main (String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ISBN = br.readLine();
        int[] arr = new int[13];
        int star = -1;

        for (int i = 0; i < 13; i++) {
            if (ISBN.charAt(i) == '*') {
                star = i;
                arr[i] = -1;
            } else {
                arr[i] = ISBN.charAt(i) - '0';
            }
        }

        // '*'의 위치 찾고 해당 위치 제외 계산
        // 짝수, 홀수별로 계산
        int odd = 0;
        int even = 0;
        int m = arr[12];

        for (int i = 0; i < 12; i++) {
            if (i % 2 == 0 && i != star) {
                even += arr[i];
            } else if (i % 2 == 1 && i != star) {
                odd += arr[i];
            }
        }

        int x = -1;
        for (int i = 0; i <= 9; i++) {
            if (star % 2 == 0) {
                if ((even + (3 * odd) + i + m) % 10 == 0) {
                    x = i;
                    break;
                }
            } else {
                if ((even + (3 * odd) + (3 * i) + m) % 10 == 0) {
                    x = i;
                    break;
                }
            }
        }

        System.out.println(x);
    }
}
