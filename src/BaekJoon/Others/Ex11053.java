package BaekJoon.Others;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class Ex11053 {
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//        int[] A = new int[N];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        for (int i = 0; i < N; i++) {
//            A[i] = Integer.parseInt(st.nextToken());
//        }
//
//        int[] dp = new int[N + 1];
//        Arrays.fill(dp, 1);
//
//        for (int i = 1; i < N; i++) {
//            for (int j = 0; j < i; j++) {
//                if (A[j] < A[i]) {
//                    dp[i] = Math.max(dp[i], dp[j] + 1);
//                }
//            }
//        }
//        int answer = 0;
//        for (int i = 0; i < N; i++) {
//            answer = Math.max(answer, dp[i]);
//        }
//        System.out.println(answer);
//    }
//}



// 강사님 코드
import java.io.IOException;

public class Ex11053 {
    public static void main(String[] args) throws IOException {
        int[] arr = {10,20,10,30,20,50};
        int N = 6;
        int[] dp = new int[N];
        Arrays.fill(dp,1);
        List<List<Integer>> myList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            myList.add(new ArrayList<>());
        }

        for (int i = 0; i < dp.length; i++) {
            int max = Integer.MIN_VALUE;
            boolean check = false;
            int index = -1;

            for (int j = 0; j < i; j++) {

                if (arr[i] > arr[j] && dp[j] > max) {
                    max = dp[j];
                    index = j;
                    check = true;
                }
            }
            if (check) {
                for (int a : myList.get(index)) {
                    myList.get(i).add(a);
                }
                dp[i] = max + 1;
            }
            myList.get(i).add(arr[i]);
        }
        System.out.println(Arrays.toString(dp));
    }
}