package BaekJoon.Class02;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex1181 {
    public static void main(String[] args) throws IOException {
        // 입력 받기 위한 br
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력을 위한 bw
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 문자열 조합을 위한 sb
        StringBuilder sb = new StringBuilder();

        // 첫 줄에서 단어의 개수 N개를 읽어 정수로 형변환
        int N = Integer.parseInt(br.readLine());

        // 중복 제거를 위한 HashSet 사용
        Set<String> set = new HashSet<>();
        // N개의 단어를 한 줄씩 읽어 set에 추가(중복 자동 제거)
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        // 정렬을 위해 set의 요소를 리스트로 옮김
        List<String> list = new ArrayList<>(set);

        // 리스트를 먼저 길이 순, 길이가 같으면 사전 순으로 정렬
        list.sort(((o1, o2) -> {
            if (o1.length() != o2.length()) return Integer.compare(o1.length(), o2.length());   // 길이 비교
            return o1.compareTo(o2);    // 사전 순 비교
        }));

        // 정렬된 리스트의 각 단어를 한 줄씩 StringBuilder sb에 추가
        for (String str : list) {
            sb.append(str).append("\n");
        }

        // StringBuilder 내용을 버퍼에 쓰고 출력
        bw.write(sb.toString());
        bw.flush();
    }
}