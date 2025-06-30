package Programmers;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class theHallOfFame1 {
    public static void main(String[] args) {
        int k = 3;
        int[] score = {10,100,20,140,1,100,200};
        // result = [10,10,10,20,20,100,100]
        int[] result = new int[score.length];

        Queue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            if (pq.size() < k)
                pq.offer(score[i]);
            else {
                if (pq.peek() < score[i]) {
                    pq.poll();
                    pq.offer(score[i]);
                }
            }
            result[i] = pq.peek();
        }
        System.out.println(Arrays.toString(result));
    }
}
