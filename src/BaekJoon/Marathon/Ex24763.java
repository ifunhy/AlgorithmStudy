package BaekJoon.Marathon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex24763 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = (6 * Integer.parseInt(st.nextToken())) + (3 * Integer.parseInt(st.nextToken())) + (2 * Integer.parseInt(st.nextToken()))
                + (Integer.parseInt(st.nextToken())) + (2 * (Integer.parseInt(st.nextToken())));

        st = new StringTokenizer(br.readLine());
        int B = (6 * Integer.parseInt(st.nextToken())) + (3 * Integer.parseInt(st.nextToken())) + (2 * Integer.parseInt(st.nextToken()))
                + (Integer.parseInt(st.nextToken())) + (2 * (Integer.parseInt(st.nextToken())));

        System.out.println(A + " " + B);

    }
}
