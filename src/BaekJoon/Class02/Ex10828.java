package BaekJoon.Class02;
import java.io.*;
import java.util.Arrays;

public class Ex10828 {
    // 제네릭 스택 클래스 선언: E는 나중에 지정할 요소 타입을 나타냄
    static class MyStack<E> {
        private E[] elements;       // 실제 데이터를 담을 배열
        private int size = 0;       // 현재 스택에 담긴 요소 개수

        // 생성자: 스택의 초기 용량(capacity)을 받아 배열 생성
        @SuppressWarnings("unchecked")
        public MyStack(int capacity) {
            // Object 배열을 만들고 E[]로 캐스팅하여 제네릭 배열 생성
            elements = (E[]) new Object[capacity];
        }

        // push 구현: 새 요소를 스택에 추가
        public void push(E object) {
            // 배열이 가득 찼다면 크기를 두 배로 늘림 (시간복잡도 문제)
            if (size == elements.length) {
                elements = Arrays.copyOf(elements, elements.length * 2);
            }
            // 요소를 현재 size 위치에 저장하고 size를 1 증가
            elements[size++] = object;
        }

        // pop 구현: 스택에서 요소를 꺼내 반환
        public E pop() {
            if (size == 0)            // 비어 있으면 null 반환
                return null;
            E top = elements[--size]; // size를 감소시킨 후 그 위치의 요소를 꺼냄
            elements[size] = null;    // 가비지 컬렉션을 위해 꺼낸 자리의 참조 제거
            return top;               // 꺼낸 요소 반환
        }

        // size 구현: 스택에 담긴 요소 개수를 반환
        public int size() {
            return size;
        }

        // isEmpty 구현: 비어 있으면 1, 아니면 0 반환 (문제 요구사항)
        public int isEmpty() {
            return (size == 0) ? 1 : 0;
        }

        // top 구현: 맨 위 요소를 제거 없이 반환
        public E top() {
            if (size == 0)           // 비어 있으면 null 반환
                return null;
            return elements[size - 1]; // 현재 top 위치의 요소 반환
        }
    }

    // -------------------------------------
    // main 메서드: BOJ 10828번 명령 처리
    // -------------------------------------
    public static void main(String[] args) throws IOException {
        // 1) BufferedReader로 빠른 입력 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 2) 첫 줄 N을 읽어 총 명령 개수로 변환
        int N = Integer.parseInt(br.readLine());

        // 3) MyStack<Integer> 인스턴스 생성 (초기 용량 N)
        MyStack<Integer> stack = new MyStack<>(N);

        // 4) N개의 명령을 순차 처리
        for (int i = 0; i < N; i++) {
            // 4-1) 한 줄을 읽어 공백으로 분리
            String[] cmd = br.readLine().split(" ");

            // 4-2) 명령어에 따라 분기
            switch (cmd[0]) {
                case "push":
                    // push X: 문자열로 받은 X를 정수로 변환해 스택에 추가
                    stack.push(Integer.parseInt(cmd[1]));
                    break;
                case "pop":
                    // pop: 꺼낸 값이 null이면 -1, 아니면 값을 출력
                    Integer popResult = stack.pop();
                    System.out.println(popResult == null ? -1 : popResult);
                    break;
                case "empty":
                    // empty: 스택이 비었는지 isEmpty() 결과(1 or 0) 출력
                    System.out.println(stack.isEmpty());
                    break;
                case "size":
                    // size: 현재 스택 크기 반환
                    System.out.println(stack.size());
                    break;
                case "top":
                    // top: 빈 스택이면 -1, 아니면 top() 결과 출력
                    Integer topResult = stack.top();
                    System.out.println(topResult == null ? -1 : topResult);
                    break;
            }
        }
    }
}
