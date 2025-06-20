package BaekJoon.Class02;
import java.io.*;
import java.util.Arrays;

public class Ex10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 정렬할 개수를 저장할 변수
        int num = Integer.parseInt(br.readLine());
        // num만큼 arr 정수 배열 생성
        int[] arr = new int[num];
        // 정수로 형변환하여 배열에 삽입
        for (int i = 0; i < num; i++)
            arr[i] = Integer.parseInt(br.readLine());
        // 오름차순으로 정렬
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        // 정렬한 값을 줄바꿈하여 저장
        for (int i = 0; i < num; i++) {
            sb.append(arr[i]).append('\n');
        }
        System.out.print(sb);
    }
}

// 첫 번째 줄에 입력 받을 인자 개수
// N개의 자연수 주어짐
// 오름차순 정렬