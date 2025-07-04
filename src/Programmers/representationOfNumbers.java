package Programmers;

import java.util.ArrayList;
import java.util.List;

public class representationOfNumbers {
    public static void main(String[] args) {
        int n = 15;

        int start = 1;
        int end = start;
        int total = 1;
        int count = 0;

        while (start <= end && end <= n) {
            if (total == n) {
                count++;
                end++; // 또는 start++
                total += end;
            } else if (total < n) {
                end++;
                total += end;
            } else {
                total -= start;
                start++;
            }
        }
        System.out.println(count);
    }
}
