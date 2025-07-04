package BaekJoon.Others;
import java.io.*;
import java.util.*;

public class Ex2470 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        // 0에 가까운 값
        int start = 0;
        int end = N - 1;
        int total;
        Map<String, Integer> map = new HashMap<>();

        while (start < end && end <= arr.length) {
            // 두 수를 합산 -> 절대값으로 변환 -> map에 저장
            int sum = arr[start] + arr[end];
            total = Math.abs(sum);

            map.put(arr[start] + " " + arr[end], total);

            if (sum > 0) {  // total로 하면 항상 양수라 sum > 0
                end--;
            } else {
                start++;
            }
        }
        // 가장 작은 value의 key값 출력
        Integer minValue = Collections.min(map.values());
        for (String key : map.keySet()) {
            if (map.get(key) == minValue) {
                System.out.println(key);
                break;
            }
        }
    }
}
