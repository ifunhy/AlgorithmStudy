package BaekJoon.Marathon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex30224 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        br.close();

        boolean hasSeven = num.contains("7");
        int value = Integer.parseInt(num);

        if (!hasSeven && value % 7 != 0) {
            System.out.println(0);
        } else if (!hasSeven && value % 7 == 0) {
            System.out.println(1);
        } else if (hasSeven && value % 7 != 0) {
            System.out.println(2);
        } else if (hasSeven && value % 7 == 0) {
            System.out.println(3);
        }
    }
}
// 0 : 7이 없으면서 7로 나누어 떨어지지 않음
// 1 : 7이 없지만, 7로 나누어 떨어짐
// 2 : 7이 있지만, 7로 나누어 떨어지지 않음
// 3 : 7이 있으면서 7로 나누어 떨어짐
