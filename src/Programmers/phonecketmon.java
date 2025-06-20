package Programmers;

import java.util.*;

public class phonecketmon {
    public static void main(String[] args) {
        int[] nums = {3,1,2,3};

        int N = nums.length;
        Set<Integer> distinctSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            distinctSet.add(nums[i]);
        }
        int distinctCount = distinctSet.size();
        int maxPick = N / 2;

        System.out.println(Math.min(distinctCount, maxPick));
    }
}
