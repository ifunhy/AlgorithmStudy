package BaekJoon.Class01;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ex19809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

    }
}

// 첫째 줄에 단어 하나가 주어짐
// a가 처음 등장하는 위치, b가 처음 등장하는 위치 ... 공백으로 구분하여 출력
// 포함되어 있지 않다면 -1 출력


// int 배열을 -1로 초기화 (문자열의 문자 위치 확인용) Arrays.fill()
// 문자열 생성
// 문자열 길이만큼 반복
// charAt()으로 문자 단위 확인하여 값 저장
// (저장한 값 - 97 == -1) 이라면 초기화
// 배열 출력

// trim 사용도 공부해보기
// StringBuilder()
// indexOf()
