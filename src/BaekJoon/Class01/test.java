package BaekJoon.Class01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float f = Float.parseFloat(br.readLine());
        System.out.println(f);
    }
}

// 실수형 변수를 선언하고 그 변수에 실수값을 저장한 후
// 저장되어 있는 실수값을 출력