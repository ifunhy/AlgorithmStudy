package BaekJoon.Others;//import java.io.*;
//import java.util.*;
//
//public class Ex1032 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        String[] arr = new String[N];
//        // map에 넣을 key값 삽입
//        for (int i = 0; i < N; i++) {
//            arr[i] = br.readLine();
//        }
//
//        Map<String, Integer> book = new HashMap<>();
//
//        // key의 value 수 카운트
//        for (int i = 0; i < arr.length; i++) {
//            if (book.containsKey(arr[i]))
//                book.put(arr[i], book.get(arr[i]) + 1);
//            else
//                book.put(arr[i], 1);
//        }
//
//        // 가장 많이 팔린 책
//        int max = Integer.MIN_VALUE;
//        String maxKey = null;
//
//        for (String k : book.keySet()) {
//            if (book.get(k) > max) {
//                max = book.get(k);
//                maxKey = k;
//            }
//        }
//        System.out.println(maxKey);
//    }
//}


import java.io.*;
import java.util.*;

public class Ex1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        // map에 넣을 key값 삽입
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        // 빈도수 세기 (책 이름 → 판매량)
        Map<String, Integer> book = new HashMap<>();
        for (String title : arr) {
            book.put(title, book.getOrDefault(title, 0) + 1);
        }

        // 가장 많이 팔린 책
        int max = Integer.MIN_VALUE;
        String maxKey = null;

        for (String k : book.keySet()) {
            if (book.get(k) > max) {
                max = book.get(k);
                maxKey = k;
            }
            else if (book.get(k) == max) {
                if (book.get(k) == max && maxKey.compareTo(k) > 0) {
                    maxKey = k;
                }
            }
        }
        System.out.println(maxKey);
    }
}
