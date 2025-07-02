package BaekJoon.Others;

import java.io.*;
import java.util.*;

public class Ex1927 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        while (N > 0) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (pq.isEmpty())
                    System.out.println("0");
                else System.out.println(pq.poll());
            }
            else pq.offer(num);
            N--;
        }
    }
}
