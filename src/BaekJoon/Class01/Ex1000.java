package BaekJoon.Class01;

import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

//public class Ex1000 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//
//        System.out.println(A + B);
//    }
//}

import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Ex1000 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.println(A + B);
    }
}
