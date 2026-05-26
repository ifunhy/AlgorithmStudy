package BaekJoon.Marathon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex23235 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;

        while (true) {
            String line = br.readLine();
            line = line.trim();

            if (line.equals("0")) {
                break;
            }

            System.out.println("Case " + i + ": Sorting... done!");
            i++;
        }
    }
}
