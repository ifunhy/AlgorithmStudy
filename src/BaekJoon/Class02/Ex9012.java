package BaekJoon.Class02;
import java.io.*;
import java.util.Stack;

//public class Ex9012 {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int N  = Integer.parseInt(br.readLine());
//        String[] arr = new String[N];
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = br.readLine();
//        }
//
//        for (int i = 0; i < N; i++) {
//            int front = 0;
//            int end = 0;
//
//            if ((arr[i].charAt(0) == ')') || arr[i].charAt(arr[i].length() - 1) == '(') {
//                bw.write("NO\n");
//            } else {
//                for (int j = 0; j < arr[i].length(); j++) {
//                    char c = arr[i].charAt(j);
//                    if (c == '(' && (front >= end)) {
//                        front += 1;
//                    }
//                    if (c == ')' && (front >= end)) {
//                        end += 1;
//                    }
//                }
//                if (front == end) {
//                    bw.write("YES\n");
//                } else {
//                    bw.write("NO\n");
//                }
//            }
//        }
//        bw.flush();
//    }
//}

// ")"로 시작 -> "NO" 리턴
// "("로 끝 -> "NO" 리턴
// "("의 개수 == ")"의 개수 -> 각각 카운팅 후 수 비교

// deque 으로 구현

public class Ex9012 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            boolean check = true;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (s.charAt(j) == '(') {
                    stack.push(c);
                } else if (stack.empty()){
                    bw.write("NO\n");
                    check = false;
                    break;
                } else {
                    stack.pop();
                }
            }

            if (check) {
                if (stack.empty()) {
                    bw.write("YES\n");
                } else {
                    bw.write("NO\n");
                }
            }
            stack.clear();
        }
        bw.flush();
    }
}