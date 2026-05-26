package BaekJoon.Marathon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex15000 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lower = br.readLine();
        String[] arr = new String[lower.length()];

        for (int i = 0; i < lower.length(); i++) {
            arr[i] = String.valueOf((char)(lower.charAt(i) - 32));
            System.out.print(arr[i]);
        }
    }
}
