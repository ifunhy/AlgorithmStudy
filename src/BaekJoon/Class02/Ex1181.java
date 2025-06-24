package BaekJoon.Class02;
import java.io.*;
import java.util.*;

public class Ex1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // 입력 받기 위한 br
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력을 위한 bw
        StringBuilder sb = new StringBuilder(); // 문자열 조합을 위한 sb

        int N = Integer.parseInt(br.readLine());     // 첫 줄에서 단어의 개수 N개를 읽어 정수로 형변환
        Set<String> set = new HashSet<>();  // 중복 제거를 위한 HashSet 사용

        for (int i = 0; i < N; i++) {   // N개의 단어를 한 줄씩 읽어 set에 추가(중복 자동 제거)
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>(set);   // 정렬을 위해 set의 요소를 리스트로 옮김

        list.sort(((o1, o2) -> {    // 리스트를 먼저 길이 순, 길이가 같으면 사전 순으로 정렬
            if (o1.length() != o2.length()) return Integer.compare(o1.length(), o2.length());   // 길이 비교
            return o1.compareTo(o2);    // 사전 순 비교
        }));

        for (String str : list) {   // 정렬된 리스트의 각 단어를 한 줄씩 StringBuilder sb에 추가
            sb.append(str).append("\n");
        }

        bw.write(sb.toString());    // StringBuilder 내용을 버퍼에 쓰고 출력
        bw.flush();
    }
}