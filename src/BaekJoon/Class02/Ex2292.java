package BaekJoon.Class02;
import java.io.*;

public class Ex2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        int count = 1;
        int i = 2;

        // 입력값이 1이면 1 출력
        if (N == count)
            System.out.println("1");
        // 입력값이 2 이상일 때
        else
        {
            while (i <= N)
            {
                i = i + (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}

// N = 1 -> 1
// N = 2 ~ 7 -> 2(6)
// N = 8 ~ 19 -> 3(12)
// N = 20 ~ 37 - > 4(18)
// N = 38 ~ 61 -> 5(24)
// num = max - min + 1;
// result = num / 6 + 1;

// j = j + (6 * 1)