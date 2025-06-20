package BaekJoon.Class02;
import java.io.*;
import java.util.*;

public class Ex10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 1) 입력값을 쌓았다 뺐다 할 스택 역할의 리스트를 생성 (List<Integer> 인터페이스, ArrayList 구현체)
        List<Integer> list = new ArrayList<>();

        // 2) N번 반복하며, 각 줄에 주어지는 수를 읽고 0이면 'pop', 아니면 'push' 연산 수행
        for (int i = 1; i <= N; i++) {
            // 2-1) 한 줄을 읽어 정수로 변환
            int x = Integer.parseInt(br.readLine());
            // 2-2) 입력값이 0이면 마지막에 추가된 원소를 제거 (pop)
            if (x == 0) {
                list.remove(list.size() - 1);
            } else {
                // 2-3) 0이 아니면 리스트 끝에 추가 (push)
                list.add(x);
            }
        }

        // 3) 최종적으로 리스트에 남아 있는 모든 값을 합산
        long sum = 0;
        for (int v : list) {
            sum += v;
        }
        br.close();
        // 4) 계산된 합계를 출력
        System.out.println(sum);
    }
}
