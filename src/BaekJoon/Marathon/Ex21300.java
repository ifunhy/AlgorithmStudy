package BaekJoon.Marathon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex21300 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println((Integer.parseInt(st.nextToken()) * 5) + (Integer.parseInt(st.nextToken()) * 5) +
                (Integer.parseInt(st.nextToken()) * 5) + (Integer.parseInt(st.nextToken()) * 5) +
                (Integer.parseInt(st.nextToken()) * 5) + (Integer.parseInt(st.nextToken()) * 5));
    }
}
