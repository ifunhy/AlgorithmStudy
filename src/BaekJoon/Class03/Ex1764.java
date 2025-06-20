package BaekJoon.Class03;
import java.io.*;
import java.util.*;

public class Ex1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 토큰 1: 듣도 못한 사람 수 N
        int M = Integer.parseInt(st.nextToken()); // 토큰 2: 보도 못한 사람 수 M
        int count = 0;                             // 듣보잡 수를 저장할 변수 초기화

        Map<String, Integer> map = new HashMap<>(); // 듣도 못한 사람 이름을 저장할 Map (이름 → 임의 번호)
        Set<String> set = new HashSet<>();          // 듣보잡(듣도 못했고 보도 못한) 이름을 저장할 Set
        String name = null;                         // 임시로 이름을 읽어올 변수

        // 1) 듣도 못한 사람 목록을 map에 저장
        for (int i = 0; i < N; i++) {
            name = br.readLine();                  // 한 줄씩 이름 읽기
            map.put(name, i + 1);                  // Map에 name → (i+1) 저장 (값은 크게 중요하지 않음)
        }

        // 2) 보도 못한 사람 목록을 하나씩 읽어오며, map에 이미 있는 이름(듣도 못한 사람)이면 set에 추가
        for (int i = 0; i < M; i++) {
            name = br.readLine();                  // 한 줄씩 이름 읽기
            if (map.containsKey(name)) {           // map에 key로 존재하면 듣보잡
                set.add(name);                     // Set에 추가 (중복 없이 관리)
            }
        }
        count = set.size();                        // 최종 듣보잡 수는 set의 크기

        System.out.println(count);                 // 듣보잡 수 출력

        // 3) 듣보잡 이름을 사전 순으로 정렬하여 한 줄씩 출력하기 위해 List로 변환
        List<String> list = new ArrayList<>(set);  // Set → List 변환
        Collections.sort(list);                     // 사전 순 정렬

        for (String s : list) {                     // 정렬된 리스트 순회
            System.out.println(s);                  // 각 이름을 한 줄씩 출력
        }
    }
}

// 교집합인 사람의 수 출력
// 교집합인 사람의 이름을 알파벳순으로 출력