package BaekJoon.Marathon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex32314 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ampere = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int watt = Integer.parseInt(st.nextToken());
        int volt = Integer.parseInt(st.nextToken());

        if (ampere * volt <= watt) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}