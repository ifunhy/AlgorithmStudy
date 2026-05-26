package BaekJoon.Class02;
import com.sun.org.apache.xpath.internal.operations.Neg;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// hash set 사용해보기
public class Ex10816 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        String[] strN = br.readLine().split(" ");
//        int M = Integer.parseInt(br.readLine());
//        String[] strM = br.readLine().split(" ");
//        int[] result = new int[M];
//        int count;
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < M; i++) {
//            count = 0;
//            for (int j = 0; j < N; j++) {
//                if (strM[i].equals(strN[j]))
//                    count++;
//            }
//            result[i] = count;
//            sb.append(result[i]).append(' ');
//        }
//        System.out.println(sb);
//    }
    public static void main(String[] args) throws Exception{
        // 1. N 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 2. 숫자 카드 N개 입력 → HashMap에 count 저장
        //    - key: 숫자
        //    - value: 등장 횟수
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        int[] card = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        for (int num : card) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }


        // 3. M 입력받고 찾고 싶은 숫자들 입력
        int M = Integer.parseInt(br.readLine());
        int[] num = new int[M];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            num[i] = Integer.parseInt(st.nextToken());

            // 4. 각 숫자마다 map.getOrDefault(value, 0) 출력
            bw.write(String.valueOf(map.getOrDefault(num[i], 0)));
            bw.write(" ");
        }
        bw.flush();
    }
}
