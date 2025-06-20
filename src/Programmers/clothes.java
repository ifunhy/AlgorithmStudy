package Programmers;

import java.util.*;

public class clothes {
    public static void main(String[] args) {
        String[][] clothes = new String[4][2];
        clothes[0][0] = "동그란 안경";
        clothes[0][1] = "검정 선글라스";
        clothes[1][0] = "파란 티셔츠";
        clothes[2][0] = "청바지";
        clothes[3][0] = "긴 코드";

        Map<String,Integer> map = new HashMap<>();
        int answer = 1;

        // 1. 종류별로 묶기
        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        // 2. 경우의 수 곱하기
        for (String key : map.keySet()) {
            answer *= (map.get(key) + 1);
        }
        
        // 3. 아무것도 안 입는 경우 제거하기
        answer -= 1;
        System.out.println(answer);
//        return answer;
    }
}
