package Programmers;

import java.util.*;

public class hateSameNum {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (i == 0 || arr[i] != arr[i - 1]) {
//                list.add(arr[i]);
//            }
//        }
//
//        int[] answer = new int[list.size()];
//
//        for (int i = 0; i < list.size(); i++) {
//            answer[i] = list.get(i);
//        }

        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            if(stack.size() == 0 || stack.peek() != num) {
                stack.push(num);
            }
        }

        int size = stack.size();
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = stack.get(i);
        }

        System.out.println(Arrays.toString(answer));  // [1, 3, 0, 1]
    }
}
