//package BaekJoon.Others;
//import java.io.*;
//import java.util.*;
//
//public class Ex2512 {
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int[] request = new int[N];
//        int max = 0;
//        int min = 0;
//        int sum = 0;
//
//        for (int i = 0; i < N; i++) {
//            request[i] = Integer.parseInt(st.nextToken());  // 140 110 120 150
//            max = Math.max(max, request[i]);
//            sum += request[i];
//        }
//
//        int budget = Integer.parseInt(br.readLine());   // 485
//        int division = budget / N;      // 121
//        int remainder = budget % N;     // 1
//        boolean[] visited = new boolean[N + 1];
//        int trueCount = 0;
//        int maxRequest = 0;
//        int count = 0;
//
//        if (budget > sum) {
//            System.out.println(max);
//            return ;
//        } else if (budget < sum) {
//            for (int i = 0; i < N; i++) {
//                min = Math.min(request[i], budget);
//
//                if (min == budget){
//                    System.out.println(min);
//                    return ;
//                } else {
//                    System.out.println(budget / N);
//                    return ;
//                }
//            }
//        }
//
//        while (budget >= 0) {
//            boolean changed = false;    // 변화 감지 플래그
//
//            for (int i = 0; i < N; i++) {
//                if (division < request[i]) {
//                    if (!visited[i]) {
//                        visited[i] = true;  // 방문 안 했으면 일단 기록하고 패스
//                        changed = true;
//                        ++count;
//                    } else {    // 두 번째 방문시 여기로 들어가야 함
//                        trueCount = 0;
//
//                        for (boolean element : visited) {   // visited == true인 request 개수
//                            if (element)
//                                trueCount++;
//                        }
//                        maxRequest = Math.max(maxRequest, division + (remainder / count));
//                        budget -= (division + (remainder / trueCount));
//                        changed = true;
//                    }
//                } else {
//                    if (!visited[i]) {
//                        visited[i] = true;
//                        budget -= request[i];
//                        remainder += (division - request[i]);
//                        changed = true;
//                    }
//                }
//            }
//            if (!changed)   // 변화가 없으면 break
//                break;
//        }
//        System.out.println(maxRequest);
//    }
//}
//
//
////package BaekJoon.Others;
////import java.io.*;
////import java.util.*;
////
////public class Main {
////    public static void main(String[] args) throws IOException{
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////
////        int N = Integer.parseInt(br.readLine());
////        StringTokenizer st = new StringTokenizer(br.readLine());
////        int[] request = new int[N];
////        int max = 0;
////        int min = 0;
////        int sum = 0;
////
////        for (int i = 0; i < N; i++) {
////            request[i] = Integer.parseInt(st.nextToken());
////            max = Math.max(max, request[i]);
////            sum += request[i];
////        }
////
////        int budget = Integer.parseInt(br.readLine());
////        int division = budget / N;
////        int remainder = budget % N;
////        boolean[] visited = new boolean[N + 1];
////        int trueCount = 0;
////        int maxRequest = 0;
////        int count = 0;
////
////        if (budget > sum) {
////            System.out.println(max);
////            return ;
////        } else if (budget < sum) {
////            for (int i = 0; i < N; i++) {
////                min = Math.min(request[i], budget);
////
////                if (min == budget){
////                    System.out.println(min);
////                    return ;
////                } else {
////                    System.out.println(budget / N);
////                    return ;
////                }
////            }
////        }
////
////        while (budget >= 0) {
////            boolean changed = false;
////
////            for (int i = 0; i < N; i++) {
////                if (division < request[i]) {
////                    if (!visited[i]) {
////                        visited[i] = true;
////                        changed = true;
////                        ++count;
////                    } else {
////                        trueCount = 0;
////
////                        for (boolean element : visited) {
////                            if (element)
////                                trueCount++;
////                        }
////                        maxRequest = Math.max(maxRequest, division + (remainder / count));
////                        budget -= (division + (remainder / trueCount));
////                        changed = true;
////                    }
////                } else {
////                    if (!visited[i]) {
////                        visited[i] = true;
////                        budget -= request[i];
////                        remainder += (division - request[i]);
////                        changed = true;
////                    }
////                }
////            }
////            if (!changed)
////                break;
////        }
////        System.out.println(maxRequest);
////    }
////}
package BaekJoon.Others;
import java.io.*;
import java.util.*;

public class Ex2512 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] request = new int[N];
        int max = 0;
        int min = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            request[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, request[i]);
            sum += request[i];
        }

        int budget = Integer.parseInt(br.readLine());
        int division = budget / N;
        int remainder = budget % N;
        boolean[] visited = new boolean[N + 1];
        int trueCount = 0;
        int maxRequest = 0;
        int count = 0;

        if (budget > sum) {
            System.out.println(max);
            return ;
        } else if (budget < sum) {
            for (int i = 0; i < N; i++) {
                min = Math.min(request[i], budget);

                if (min == budget){
                    System.out.println(min);
                    return ;
                }
//                else {
//                    System.out.println(budget / N);
//                    return ;
//                }
            }
        }

        while (budget >= 0) {
            boolean changed = false;

            for (int i = 0; i < N; i++) {
                if (division < request[i]) {
                    if (!visited[i]) {
                        visited[i] = true;
                        changed = true;
                        ++count;
                    } else {
                        trueCount = 0;

                        for (boolean element : visited) {
                            if (element)
                                trueCount++;
                        }
                        maxRequest = Math.max(maxRequest, division + (remainder / count));
                        budget -= (division + (remainder / trueCount));
                        changed = true;
                    }
                } else {
                    if (!visited[i]) {
                        visited[i] = true;
                        budget -= request[i];
                        remainder += (division - request[i]);
                        changed = true;
                    }
                }
            }
            if (!changed)
                break;
        }
        System.out.println(maxRequest);
    }
}