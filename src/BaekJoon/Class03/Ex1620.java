package BaekJoon.Class03;
import java.io.*;
import java.util.*;

public class Ex1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());      // 토큰 1: 포켓몬 개수 N
        int M = Integer.parseInt(st.nextToken());      // 토큰 2: 질의(문제) 개수 M

        Map<String, Integer> pocketmon = new HashMap<>(N);
        // 이름→번호 매핑을 저장할 HashMap, 초기 용량 N
        String[] numToName = new String[N + 1];         // 번호→이름 매핑을 위한 배열(1번부터 N번까지 사용)

        for (int i = 0; i < N; i++) {                   // N번 반복하며 포켓몬 이름과 번호를 읽음
            String name = br.readLine();               // 한 줄씩 포켓몬 이름 읽기
            pocketmon.put(name, i + 1);                // Map에 name→(i+1) 저장 (1-based 번호)
            numToName[i] = name;                       // 배열에는 0-based 인덱스에 name 저장
        }

        StringBuilder sb = new StringBuilder();         // 결과 출력을 모아두기 위한 StringBuilder

        while (M-- > 0) {                               // M개의 질의를 처리
            String str = br.readLine();                 // 질의 입력(이름 또는 번호 문자열)

            if (Character.isDigit(str.charAt(0))) {     // 첫 글자가 숫자이면 → 번호 질의
                int index = Integer.parseInt(str);      // 문자열을 정수로 변환
                sb.append(numToName[index - 1]);        // 배열에서 (index-1) 위치의 이름을 꺼내어 추가
            } else {                                    // 그렇지 않으면 → 이름 질의
                sb.append(pocketmon.get(str));          // Map에서 str(key)에 대응하는 번호를 꺼내어 추가
            }
            sb.append("\n");                            // 한 줄 구분을 위해 줄바꿈 문자 추가
        }
        System.out.print(sb);                           // 한 번에 묶어서 결과 출력
    }
}

// 첫째줄 N : 포켓몬 개수 / M : 맞춰야 할 문제의 개수
// N개의 포켓몬 이름이 입력되면 순서대로 번호 부여
// N개가 들어온 이후로 들어오는 것 : 맞춰야 할 문제
// 입력 : 숫자 -> 출력 : 포켓몬 이름
// 입력 : 포켓몬 이름 -> 출력 : 포켓몬 번호

