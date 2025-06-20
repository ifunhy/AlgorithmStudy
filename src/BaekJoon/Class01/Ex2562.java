package BaekJoon.Class01;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ex2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int num;
        for (int i = 0; i < 9; i++)
        {
            String str = br.readLine();
            num = Integer.parseInt(str);
            arr[i] = num;
        }
        int max = arr[0];
        int len = 1;
        for (int i = 1; i < 9; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                len = i + 1;
            }
        }
        System.out.println(max + "\n" + len);
    }
}

// 9개의 서로 다른 자연수 주어짐
// 한 줄에 하나의 자연수
// 최댓값을 찾기
// 그 최댓값이 몇 번째 수인지 구하기 -> 인덱스 번호 + 1 (?)