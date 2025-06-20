package BaekJoon.Class02;
import java.io.*;

public class Ex1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String S = br.readLine();
            //StringBuilder sb 선언하여 입력값 S 대입
            StringBuilder sb = new StringBuilder(S);
            //StringBuilder 내장 함수 reverse를 사용하여 값 저장
            String reverse = sb.reverse().toString();

            //0 입력시 종료
            if (S.equals("0")) break;

            //두 문자열을 비교하여 값 출력
            if (S.equals(reverse)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}