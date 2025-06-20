package Programmers;

import java.util.*;

public class moreSpicy {
    public static void main(String[] args) {
        int[] scoville = {1,2,3,9,10,12};
        int K = 7;

        Queue<Integer> q = new PriorityQueue();

        for (int i = 0; i < scoville.length; i++) {
            q.add(scoville[i]);
        }

        int count = 0;

        while (q.size() > 1 && q.peek() < K) {
            int a = q.poll();
            int b = q.poll();
            q.add(a + (b * 2));
            count++;
        }

        if (q.peek() < K)
            System.out.println(-1);
        else System.out.println(count);
    }
}
