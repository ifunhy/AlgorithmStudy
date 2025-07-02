package BaekJoon.Others;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 주어진 데이터를 중복해서 사용할 수 있는지 구분 필요 -> visited?
public class Ex12865 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 테스트케이스
        int K = Integer.parseInt(st.nextToken());   // 최대 무게
        Map<Integer, Integer> bag = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            bag.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

    }
}

// 중복 체크