package BaekJoon.Class01;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ex8958 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] arr = new String[num];

        // num만큼 문자열을 입력 받음
        for (int i = 0; i < num; i++)
            arr[i] = br.readLine();

        // 배열 길이만큼 반복
        for (int i = 0; i < arr.length; i++)
        {
            int count = 0;
            int sum = 0;
            // 문자마다 O 확인 후 카운팅
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O')
                    count++;
                else
                    count = 0;
                // 카운팅한 값 합산
                sum += count;
            }
            System.out.println(sum);
        }
    }
}


// OX 문제
// O가 연속되면 해당 O의 값이 +1씩 증가
// OXOOXXOOOX -> 10점
// 첫 줄은 입력 받을 줄의 개수를 입력 받음



//        for (int i = 0; i < arr.length; i++)
//        {
//        for (int j = 0; j < num; j++) {
//        if (arr[j].charAt() == 0)
//        {
//count++;
//        }
//        else
//count = 0;
//sum += count;
//                }
//                        }