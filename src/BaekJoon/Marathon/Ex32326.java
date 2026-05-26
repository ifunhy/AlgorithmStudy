package BaekJoon.Marathon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex32326 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int R = 3 * Integer.parseInt(br.readLine());
        int G = 4 * Integer.parseInt(br.readLine());
        int B = 5 * Integer.parseInt(br.readLine());
        br.close();

        System.out.println(R + G + B);
    }
}

// red : $3
// green : $4
// blue : $5