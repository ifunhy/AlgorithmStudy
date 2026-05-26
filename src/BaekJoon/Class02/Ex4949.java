package BaekJoon.Class02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex4949 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = br.readLine();
            char[] stack = new char[line.length()];
            int i = 0;

            if (line.equals(".")) {
                break;
            }

            for (Byte b : line.getBytes()) {
                if (b == '(') {
                    stack[i] = ')';
                    i++;
                } else if (b == '[') {
                    stack[i] = ']';
                    i++;
                } else if (b == ')' || b == ']') {
                    if (i > 0 && stack[i - 1] == b) {
                        i--;    // pop
                    } else {
                        i = -1;
                        break;
                    }
                }
            }
            if (i == 0) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }
        System.out.println(sb);
    }
}
