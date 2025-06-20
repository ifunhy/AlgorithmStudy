package BaekJoon.Class02;
import java.io.*;
import java.util.*;

public class Ex10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 빠르게 처리하기 위한 BufferedReader 초기화
        int N = Integer.parseInt(br.readLine());    // 첫 줄에서 명령 개수 N을 읽어 정수로 변환

        Queue<String> queue = new LinkedList<>();   // FIFO 구조의 큐를 LinkedList 구현체로 생성

        for (int i = 0; i < N; i++) {   // N개의 명령을 순차적으로 처리
            String[] cmd = br.readLine().split(" ");    // 명령어와 인자를 공백 단위로 분리하여 배열에 저장
            switch (cmd[0]) {
                case "push":
                    queue.add(cmd[1]);  // push 명령: 인자로 주어진 값을 큐에 추가
                    break;
                case "pop":
                    String s = queue.poll();    // pop 명령: 큐에서 꺼내거나 없으면 null
                    System.out.println(s == null ? -1 : s); // 꺼낼 값이 없으면 -1, 아니면 값 그대로 출력
                    break;
                case "size":
                    System.out.println(queue.size());   // size 명령: 현재 큐에 들어있는 요소 개수 출력
                    break;
                case "empty":
                    System.out.println(queue.isEmpty() ? 1 : 0);    // empty 명령: 비어 있으면 1, 아니면 0 출력
                    break;
                case "front":
                    System.out.println(queue.peek() == null ? -1 : queue.peek());   // front 명령: 맨 앞 요소 조회하거나 없으면 -1
                    break;
                case "back":
                    LinkedList<String> q = (LinkedList<String>) queue;  // back 명령을 위해 LinkedList로 다운캐스트
                    System.out.println(q.peekLast() == null ? -1 : q.peekLast());  // 큐의 맨 뒤 요소 조회하거나 없으면 -1
                    break;
            }
        }
    }
}



// push : 정수 X를 큐에 넣는 연산
// pop : 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력. 없는 경우 -1
// size : 큐에 들어있는 정수의 개수 출력
// empty : 큐가 비어있으면 1, 아니면 0 출력
// front : 큐의 가장 앞에 있는 정수 출력. 없는 경우 -1
// back : 큐의 가장 뒤에 있는 정수 출력. 없는 경우 -1