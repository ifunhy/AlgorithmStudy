package BaekJoon.Marathon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex27389 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double num = Double.parseDouble(br.readLine());
        Double result = 0.0;

        for (Double i = 0.0; i < num; i++) {
            result += 0.25;
        }
        System.out.println(result);
    }
}

// 16 -> 4.0
// 99 -> 24.75