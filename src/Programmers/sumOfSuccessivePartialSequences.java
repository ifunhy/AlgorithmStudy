package Programmers;

import java.util.*;

public class sumOfSuccessivePartialSequences {
    public static void main(String[] args) {
        int[] sequence = {1,2,3,4,5};
        int k = 7;
        // result : [2,3]

        int start = 0;
        int end = start;
        int total = 0;
        List<Integer> myList = new ArrayList<>();

        while (start <= end && end <= sequence.length) {
            if (total == k && end >= start) {
                if (myList.size() > (end - start) || myList.isEmpty()) {
                    myList.clear();
                    for (int i = start; i < end; i++) {
                        myList.add(sequence[i]);
                    }
                }
                total -= sequence[start];
                start++;
            } else if (total < k) {
                if (end < sequence.length) {
                    total += sequence[end];
                    end++;
                } else {
                    break;
                }
            } else {
                total -= sequence[start];
                start++;
            }
        }
        int[] result = myList.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(result));
    }
}


// k : 부분수열의 합
// k인 수열이 여러개면 길이가 짧은 수열 출력
// List에 저장하여 사이즈 비교 후 작은 값 갱신
// 수열의 인덱스 출력
