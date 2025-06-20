package BaekJoon.Class02;
import java.io.*;

public class Ex1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫 번째 입력을 정수로 저장
        int N = Integer.parseInt(br.readLine());
        br.close();

        int num = 666;  // 검색을 시작할 기본 숫자 설정
        int count = 1;  // 현재까지 찾은 "666" 포함 숫자의 개수

        // count와 N의 값이 같아질 때까지 반복
        while (count != N)
        {
            num++;
            // 현재 숫자에 "666"이 포함되어 있는지 검사
            if (String.valueOf(num).contains("666"))
                count++;
        }
        System.out.println(num);    // N번째 "666" 포함 숫자를 출력
    }
}
