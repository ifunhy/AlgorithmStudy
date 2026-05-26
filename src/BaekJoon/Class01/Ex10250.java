package BaekJoon.Class01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10250 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        int[][] arr = new int[testCase][3];
        int YY = 0;
        int XX = 0;

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < arr.length; i++) {
            int H = arr[i][0];
            int N = arr[i][2];

            YY = N % H;
            XX = N / H + 1;

            if (YY == 0) {
                YY = H;
                XX = N / H;
            }

            if (XX < 10) {
                System.out.println(YY + "0" + XX);
            } else {
                System.out.println(YY + "" + XX);
            }
        }
    }
}

// 6 12 10 -> 402
// 30 50 72 -> 1203
// 6 12 20 -> 204
// 6 12 5 -> 501
// 101~601, 102~602, 103~603, 104, 204