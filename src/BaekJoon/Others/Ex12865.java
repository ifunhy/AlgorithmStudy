package BaekJoon.Others;
import java.io.*;
import java.util.*;

// 주어진 데이터를 중복해서 사용할 수 있는지 구분 필요 -> visited?
public class Ex12865 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 테스트케이스
        int target = Integer.parseInt(st.nextToken());   // 최대 무게
        int[] dp = new int[target + 1];
        int[][] arr = new int[N][2];
        Arrays.fill(dp, 0);

        int weight;
        int value;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());

        }

    }
}

// 중복 체크 (이중 for문 : 배낭 -> 무게)
// 순회 순서 고려 (뒤에서부터)

// map으로 풀 순 없나?
// 나중에 도전
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int N = Integer.parseInt(st.nextToken());   // 테스트케이스
//        int K = Integer.parseInt(st.nextToken());   // 최대 무게
//        int[] dp = new int[K + 1];
//        Arrays.fill(dp, 0);
//        Map<Integer, Integer> bag = new HashMap<>();
//
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine());
//            bag.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
//        }