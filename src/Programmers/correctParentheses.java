package Programmers;
import java.io.*;
import java.util.*;

public class correctParentheses {
        // 올바른 괄호인지 검사하는 메서드
    public boolean solution(String s) {
        int vaild = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                vaild++;
            } else if (c == ')') {
                if (vaild == 0)
                    return (false);
                else vaild--;
            }
        }
        return (vaild == 0);                // 모든 열린 괄호가 닫혔는지 확인
    }

    // 로컬 테스트용 main 메서드
    public static void main(String[] args) {
        correctParentheses sol = new correctParentheses();
        System.out.println(sol.solution("()()"));    // true
        System.out.println(sol.solution("(())"));    // true
        System.out.println(sol.solution("())(()"));  // false
    }
}


//int valid = 0;                       // 현재 열린 괄호의 개수
//
//        for (char c : s.toCharArray()) {    // 문자열을 한 글자씩 순회
//        if (c == '(') {
//valid++;                     // 열린 괄호 하나 추가
//        } else if (c == ')') {
//        if (valid == 0) {            // 닫힌 괄호가 더 많아지면 즉시 false
//        return false;
//        }
//valid--;                     // 열린 괄호 하나 소모
//        }
//        }