package BaekJoon.Class03;
import java.io.*;
import java.util.*;

public class Ex17219 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());  // 토큰1: 웹사이트-비밀번호 쌍 개수 N
        int M = Integer.parseInt(st.nextToken());  // 토큰2: 조회할 URL 개수 M

        Map<String, String> map = new HashMap<>();  // URL을 key, 비밀번호를 value로 저장할 Map

        for (int i = 0; i < N; i++) {  // N번 반복하며 URL과 비밀번호 읽기
            StringTokenizer token = new StringTokenizer(br.readLine());  // 한 줄을 공백 기준으로 토큰화
            String url = token.nextToken();  // URL 추출
            String password = token.nextToken();  // 비밀번호 추출
            map.put(url, password);  // Map에 URL-비밀번호 쌍 저장
        }

        StringBuilder sb = new StringBuilder();  // 출력 결과를 모아둘 StringBuilder

        while (M-- > 0) {  // M번 반복하며 조회 요청 처리
            String str = br.readLine();  // 조회할 URL 읽기
            sb.append(map.get(str));  // 해당 URL의 비밀번호를 Map에서 꺼내어 추가
            sb.append("\n");  // 줄바꿈 추가
        }
        sb.deleteCharAt(sb.lastIndexOf("\n"));  // 마지막 줄바꿈 문자 제거
        System.out.println(sb);  // 최종 결과 한 번에 출력
    }
}

// 1. 첫 줄 토큰화 -> int N,M 저장
// 2. Map<String, String>에 주소, 비밀번호
// 3. 한번에 출력하기 위해 결과 저장할 StringBuilder
// 4. while (M-- > 0) 주소에 따른 비밀번호 get
// 5. 마지막 개행 제거
// 6. 전체 결과 출력