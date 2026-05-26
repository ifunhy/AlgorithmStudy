package BaekJoon.Class01;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Ex1152 {
//    public static void main(String[] args) throws Exception{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int num = 0;
//
//        while (st.hasMoreTokens()) {
//            String word = st.nextToken();
//            num++;
//        }
//
//        System.out.println(num);
//    }
//}

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex1152 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();

        if (s.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(s.split("\\s+").length);
        }
    }
}