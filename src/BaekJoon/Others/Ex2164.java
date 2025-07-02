package BaekJoon.Others;

import java.io.*;
import java.util.*;

public class Ex2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> card = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            card.add(i);
        }

        while(card.size() > 1) {
            card.poll();
            card.add(card.poll());
        }
        System.out.println(card.peek());
    }
}
