package BaekJoon.Class03;
import java.io.*;
import java.util.*;

public class Ex30804 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] fruits = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            fruits[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> fruitsCount = new HashMap<>();
        for (int i = 0; i < N; i++) {
            fruitsCount.put(fruits[i], fruitsCount.getOrDefault(fruits[i], 0) + 1);
        }

        int type = fruitsCount.values().size();
        int front = 0;
        int back = fruits.length - 1;

        while (type > 2) {
            int pointer = 1;    // front, back 구분

            if (pointer == 1) {
                fruitsCount.remove(fruits[front]);
                type--;
                front++;
                pointer = 2;
            }
            if (pointer == 2 && type > 2) {
                fruitsCount.remove(fruits[back]);
                type--;
                back--;
            }
        }

        Map<Integer, Integer> finalCount = new HashMap<>();
        for (int i = front; i <= back; i++) {
            finalCount.put(fruits[i], finalCount.getOrDefault(fruits[i], 0) + 1);
        }
        int count = 0;
        for (int value : finalCount.values()) {
            count += value;
        }
        System.out.println(count);
        System.out.println("key: " + finalCount.keySet());
        System.out.println("value: " + finalCount.values());
    }
}