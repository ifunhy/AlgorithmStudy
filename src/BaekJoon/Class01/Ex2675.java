package BaekJoon.Class01;
import java.util.Scanner;

public class Ex2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력 받을 줄 개수
        int n = sc.nextInt();

        // n만큼 반복
        for (int i = 0; i < n; i++)
        {
            // 정수와 문자열 저장
            int count = sc.nextInt();
            String str = sc.next();

            // str 배열에 저장된 문자의 수만큼 반복
            for (int j = 0; j < str.length(); j++)
            {
                for (int k = 0; k < count; k++)
                    System.out.print(str.charAt(j));
            }
            System.out.println();
        }
        sc.close();
    }
}

// 에러 - count의 개수가


// 첫 번째에 입력받은 정수만큼 문자열 입력 받음
// 반복횟수 R의 범위: 1 <= R <= 8
// R과 공백으로 구분되는 문자열 S
// S의 문자를 각각 R번씩 반복하여 출력



// 제이든 -> 성원식당