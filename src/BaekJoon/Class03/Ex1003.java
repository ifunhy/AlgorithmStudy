package BaekJoon.Class03;
import java.io.*;

public class Ex1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            int[][] result = new int[N+2][2];
            result[0][0] = 1;
            result[0][1] = 0;
            result[1][0] = 0;
            result[1][1] = 1;

            for (int j = 2; j <= N; j++) {
                result[j][0] = result[j-1][0] + result[j-2][0];
                result[j][1] = result[j-1][1] + result[j-2][1];
            }
            System.out.println(result[N][0] + " " + result[N][1]);
        }
    }
}



//public class Ex1003{
//
//    public static void main(String[] args) throws IOException{
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        // 테스트 케이스 K
//        int K = Integer.parseInt(br.readLine());
//
//        for(int i=0; i<K; i++) {
//            // 정수 N 받기
//            int N = Integer.parseInt(br.readLine());
//            // 초기값 세팅
//            int [][]result = new int[N+2][2];
//            result[0][0]=1;
//            result[0][1]=0;
//            result[1][0]=0;
//            result[1][1]=1;
//            for(int j=2; j<N+1; j++) {
//                result[j][0]= result[j-1][0]+result[j-2][0];
//                result[j][1]= result[j-1][1]+result[j-2][1];
//            }
//            System.out.println(result[N][0] + " " + result[N][1]);
//        }
//    }
//}

//public class Ex1003 {
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < N; i++) {
//            int num = Integer.parseInt(br.readLine());
//            Fibonacci fib = new Fibonacci();
//            String result = fib.Fibonacci(num);
//            System.out.println(result);
//        }
//    }
//}
//
//class Fibonacci {
//    public String Fibonacci(int num) {
//        int zeroCount = 0;
//        int oneCount = 0;
//        String result = null;
//
//        if (num == 0) {
//            zeroCount++;
//        }
//        else if (num == 1) {
//            oneCount++;
//        }
//        else {
//            String r1 = Fibonacci(num - 1);
//            String r2 = Fibonacci(num - 2);
//
//            String[] arr1 = r1.split(" ");
//            String[] arr2 = r2.split(" ");
//
//            zeroCount = Integer.parseInt(arr1[0]) + Integer.parseInt(arr2[0]);
//            oneCount = Integer.parseInt(arr1[1]) + Integer.parseInt(arr2[1]);
//        }
//
//        return (zeroCount + " " + oneCount);
//    }
//}

// 1. int N
// 2. 돌어오는 케이스마다 피보나치 함수 호출
// 2-1. 0과 1이 각각 몇 번 호출됐는지 카운팅
// 3. 들어온 케이스의 값이 0이나 1이 아닐 때, 재귀
// 3-1. "0 1" "1 0" 을 공백 기준 split
// 3-2. 0은 0번째 인덱스 값을 더함
// 3-3. 1은 1번째 인덱스 값을 더함
// 4. 사이에 공백을 추가하여 리턴
// 5. 리턴값 출력